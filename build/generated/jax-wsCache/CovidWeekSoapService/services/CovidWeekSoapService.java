
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CovidWeekSoapService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CovidWeekSoapService {


    /**
     * 
     * @param year
     * @return
     *     returns java.util.List<services.Covidweek>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByYear", targetNamespace = "http://services/", className = "services.FindByYear")
    @ResponseWrapper(localName = "findByYearResponse", targetNamespace = "http://services/", className = "services.FindByYearResponse")
    @Action(input = "http://services/CovidWeekSoapService/findByYearRequest", output = "http://services/CovidWeekSoapService/findByYearResponse")
    public List<Covidweek> findByYear(
        @WebParam(name = "year", targetNamespace = "")
        int year);

    /**
     * 
     * @param seq
     * @return
     *     returns services.Covidweek
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findBySeq", targetNamespace = "http://services/", className = "services.FindBySeq")
    @ResponseWrapper(localName = "findBySeqResponse", targetNamespace = "http://services/", className = "services.FindBySeqResponse")
    @Action(input = "http://services/CovidWeekSoapService/findBySeqRequest", output = "http://services/CovidWeekSoapService/findBySeqResponse")
    public Covidweek findBySeq(
        @WebParam(name = "seq", targetNamespace = "")
        int seq);

    /**
     * 
     * @return
     *     returns java.util.List<services.Covidweek>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllCovidWeek", targetNamespace = "http://services/", className = "services.FindAllCovidWeek")
    @ResponseWrapper(localName = "findAllCovidWeekResponse", targetNamespace = "http://services/", className = "services.FindAllCovidWeekResponse")
    @Action(input = "http://services/CovidWeekSoapService/findAllCovidWeekRequest", output = "http://services/CovidWeekSoapService/findAllCovidWeekResponse")
    public List<Covidweek> findAllCovidWeek();

}