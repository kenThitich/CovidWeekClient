/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidweekdatahandler;

import java.io.IOException;
import java.text.ParseException;
import services.Covidweek;

/**
 *
 * @author TUFGAMING
 */
public class CovidWeekClient {
    public static void main(String[]args) throws ParseException, IOException{
        //CovidWeekDataHandler.readJsonToDB();
        Covidweek covid = findBySeq(4);
        System.out.println(covid.getCovidyear());
    }

    private static java.util.List<services.Covidweek> findAllCovidWeek() {
        services.CovidWeekSoapService_Service service = new services.CovidWeekSoapService_Service();
        services.CovidWeekSoapService port = service.getCovidWeekSoapServicePort();
        return port.findAllCovidWeek();
    }

    private static Covidweek findBySeq(int seq) {
        services.CovidWeekSoapService_Service service = new services.CovidWeekSoapService_Service();
        services.CovidWeekSoapService port = service.getCovidWeekSoapServicePort();
        return port.findBySeq(seq);
    }

    private static java.util.List<services.Covidweek> findByYear(int year) {
        services.CovidWeekSoapService_Service service = new services.CovidWeekSoapService_Service();
        services.CovidWeekSoapService port = service.getCovidWeekSoapServicePort();
        return port.findByYear(year);
    }
}
