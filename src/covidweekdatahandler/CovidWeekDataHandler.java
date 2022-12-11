/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidweekdatahandler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author TUFGAMING
 */

public class CovidWeekDataHandler {
    
    public static void readJsonToDB() throws ParseException, MalformedURLException, IOException{
        URL obj = new URL("https://covid19.ddc.moph.go.th/api/Cases/today-cases-all");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            String json = response.toString();
            System.out.println(json);
            
            JsonReader jsonr = Json.createReader(new StringReader(json));
            JsonArray jsona = jsonr.readArray();
            jsonr.close();
            
            System.out.println(jsona);
            
            for(int i=0;i<jsona.size();i++){
                JsonObject firstname = jsona.getJsonObject(i);
            
                int year = firstname.getInt("year");
                System.out.println(year);
            
                int weeknum = firstname.getInt("weeknum");
                System.out.println(weeknum);
            
                int new_case = firstname.getInt("new_case");
                System.out.println(new_case);
            
                int total_case = firstname.getInt("total_case");
                System.out.println(total_case);
            
                int new_case_excludeabroad = firstname.getInt("new_case_excludeabroad");
                System.out.println(new_case_excludeabroad);
            
                int total_case_excludeabroad = firstname.getInt("total_case_excludeabroad");
                System.out.println(total_case_excludeabroad);
            
                int new_recovered = firstname.getInt("new_recovered");
                System.out.println(new_recovered);
            
                int total_recovered = firstname.getInt("total_recovered");
                System.out.println(total_recovered);
            
                int new_death = firstname.getInt("new_death");
                System.out.println(new_death);
            
                int total_death = firstname.getInt("total_death");
                System.out.println(total_death);
            
                int case_foreign  = firstname.getInt("case_foreign");
                System.out.println(case_foreign);
            
                int case_prison = firstname.getInt("case_prison");
                System.out.println(case_prison);
            
                int case_walkin = firstname.getInt("case_walkin");
                System.out.println(case_walkin);
            
                int case_new_prev = firstname.getInt("case_new_prev");
                System.out.println(case_new_prev);
            
                int case_new_diff = firstname.getInt("case_new_diff");
                System.out.println(case_new_diff);
            
                int death_new_prev = firstname.getInt("death_new_prev");
                System.out.println(death_new_prev);
            
                int death_new_diff = firstname.getInt("death_new_diff");
                System.out.println(death_new_diff);
            
                String update_date = firstname.getString("update_date");
                System.out.println(update_date);
            
                SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                Date date = DateFor.parse(update_date);
            
                Covidweek covid = new Covidweek(year,weeknum,new_case,total_case,new_case_excludeabroad,total_case_excludeabroad,new_recovered,total_recovered,new_death,total_death,case_foreign,case_prison,case_walkin,case_new_prev,case_new_diff,death_new_prev,death_new_diff,date);
                insertDB(covid);
            }
        }
        else {
            System.out.println("GET request did not work.");
        }
    }
    
    public static void insertDB(Covidweek covid){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidWeekDataHandlerPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(covid);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
     
     public static void removeDB(Covidweek covid) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidWeekDataHandlerPU");
        EntityManager em = emf.createEntityManager();
        Covidweek fromDb = em.find(Covidweek.class, covid.getSeq());
        em.getTransaction().begin();
        try {
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
