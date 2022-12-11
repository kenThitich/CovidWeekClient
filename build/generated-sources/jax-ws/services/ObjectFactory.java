
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindByYear_QNAME = new QName("http://services/", "findByYear");
    private final static QName _FindByYearResponse_QNAME = new QName("http://services/", "findByYearResponse");
    private final static QName _FindAllCovidWeekResponse_QNAME = new QName("http://services/", "findAllCovidWeekResponse");
    private final static QName _FindAllCovidWeek_QNAME = new QName("http://services/", "findAllCovidWeek");
    private final static QName _FindBySeq_QNAME = new QName("http://services/", "findBySeq");
    private final static QName _FindBySeqResponse_QNAME = new QName("http://services/", "findBySeqResponse");
    private final static QName _Covidweek_QNAME = new QName("http://services/", "covidweek");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindBySeqResponse }
     * 
     */
    public FindBySeqResponse createFindBySeqResponse() {
        return new FindBySeqResponse();
    }

    /**
     * Create an instance of {@link FindBySeq }
     * 
     */
    public FindBySeq createFindBySeq() {
        return new FindBySeq();
    }

    /**
     * Create an instance of {@link Covidweek }
     * 
     */
    public Covidweek createCovidweek() {
        return new Covidweek();
    }

    /**
     * Create an instance of {@link FindByYearResponse }
     * 
     */
    public FindByYearResponse createFindByYearResponse() {
        return new FindByYearResponse();
    }

    /**
     * Create an instance of {@link FindByYear }
     * 
     */
    public FindByYear createFindByYear() {
        return new FindByYear();
    }

    /**
     * Create an instance of {@link FindAllCovidWeek }
     * 
     */
    public FindAllCovidWeek createFindAllCovidWeek() {
        return new FindAllCovidWeek();
    }

    /**
     * Create an instance of {@link FindAllCovidWeekResponse }
     * 
     */
    public FindAllCovidWeekResponse createFindAllCovidWeekResponse() {
        return new FindAllCovidWeekResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findByYear")
    public JAXBElement<FindByYear> createFindByYear(FindByYear value) {
        return new JAXBElement<FindByYear>(_FindByYear_QNAME, FindByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findByYearResponse")
    public JAXBElement<FindByYearResponse> createFindByYearResponse(FindByYearResponse value) {
        return new JAXBElement<FindByYearResponse>(_FindByYearResponse_QNAME, FindByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCovidWeekResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllCovidWeekResponse")
    public JAXBElement<FindAllCovidWeekResponse> createFindAllCovidWeekResponse(FindAllCovidWeekResponse value) {
        return new JAXBElement<FindAllCovidWeekResponse>(_FindAllCovidWeekResponse_QNAME, FindAllCovidWeekResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCovidWeek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllCovidWeek")
    public JAXBElement<FindAllCovidWeek> createFindAllCovidWeek(FindAllCovidWeek value) {
        return new JAXBElement<FindAllCovidWeek>(_FindAllCovidWeek_QNAME, FindAllCovidWeek.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBySeq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findBySeq")
    public JAXBElement<FindBySeq> createFindBySeq(FindBySeq value) {
        return new JAXBElement<FindBySeq>(_FindBySeq_QNAME, FindBySeq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBySeqResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findBySeqResponse")
    public JAXBElement<FindBySeqResponse> createFindBySeqResponse(FindBySeqResponse value) {
        return new JAXBElement<FindBySeqResponse>(_FindBySeqResponse_QNAME, FindBySeqResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covidweek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "covidweek")
    public JAXBElement<Covidweek> createCovidweek(Covidweek value) {
        return new JAXBElement<Covidweek>(_Covidweek_QNAME, Covidweek.class, null, value);
    }

}
