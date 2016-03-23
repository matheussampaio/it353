
package com.cdyne.ws.profanityws.profanity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cdyne.ws.profanityws.profanity package. 
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

    private final static QName _FilterReturn_QNAME = new QName("http://ws.cdyne.com/ProfanityWS/Profanity.asmx", "FilterReturn");
    private final static QName _UserDefinedResult_QNAME = new QName("http://ws.cdyne.com/ProfanityWS/Profanity.asmx", "UserDefinedResult");
    private final static QName _ArrayOfProfanityLevel_QNAME = new QName("http://ws.cdyne.com/ProfanityWS/Profanity.asmx", "ArrayOfProfanityLevel");
    private final static QName _ArrayOfString_QNAME = new QName("http://ws.cdyne.com/ProfanityWS/Profanity.asmx", "ArrayOfString");
    private final static QName _ArrayOfReplaceType_QNAME = new QName("http://ws.cdyne.com/ProfanityWS/Profanity.asmx", "ArrayOfReplaceType");
    private final static QName _ArrayOfProfanityKey_QNAME = new QName("http://ws.cdyne.com/ProfanityWS/Profanity.asmx", "ArrayOfProfanityKey");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cdyne.ws.profanityws.profanity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteProfanityWordFromLevelByKey }
     * 
     */
    public DeleteProfanityWordFromLevelByKey createDeleteProfanityWordFromLevelByKey() {
        return new DeleteProfanityWordFromLevelByKey();
    }

    /**
     * Create an instance of {@link GetWordsByLevelResponse }
     * 
     */
    public GetWordsByLevelResponse createGetWordsByLevelResponse() {
        return new GetWordsByLevelResponse();
    }

    /**
     * Create an instance of {@link AdvancedProfanityFilter }
     * 
     */
    public AdvancedProfanityFilter createAdvancedProfanityFilter() {
        return new AdvancedProfanityFilter();
    }

    /**
     * Create an instance of {@link AdvancedProfanityFilterResponse }
     * 
     */
    public AdvancedProfanityFilterResponse createAdvancedProfanityFilterResponse() {
        return new AdvancedProfanityFilterResponse();
    }

    /**
     * Create an instance of {@link GetDefaultLevelsResponse }
     * 
     */
    public GetDefaultLevelsResponse createGetDefaultLevelsResponse() {
        return new GetDefaultLevelsResponse();
    }

    /**
     * Create an instance of {@link GetProfanityLevels }
     * 
     */
    public GetProfanityLevels createGetProfanityLevels() {
        return new GetProfanityLevels();
    }

    /**
     * Create an instance of {@link DeleteWordFromNonProfanityListByKeyResponse }
     * 
     */
    public DeleteWordFromNonProfanityListByKeyResponse createDeleteWordFromNonProfanityListByKeyResponse() {
        return new DeleteWordFromNonProfanityListByKeyResponse();
    }

    /**
     * Create an instance of {@link ProfanityKey }
     * 
     */
    public ProfanityKey createProfanityKey() {
        return new ProfanityKey();
    }

    /**
     * Create an instance of {@link CreateProfanityLevel }
     * 
     */
    public CreateProfanityLevel createCreateProfanityLevel() {
        return new CreateProfanityLevel();
    }

    /**
     * Create an instance of {@link GetDefaultWordsByLevel }
     * 
     */
    public GetDefaultWordsByLevel createGetDefaultWordsByLevel() {
        return new GetDefaultWordsByLevel();
    }

    /**
     * Create an instance of {@link GetWordsByLevel }
     * 
     */
    public GetWordsByLevel createGetWordsByLevel() {
        return new GetWordsByLevel();
    }

    /**
     * Create an instance of {@link AddProfanityWordToLevelByKeyResponse }
     * 
     */
    public AddProfanityWordToLevelByKeyResponse createAddProfanityWordToLevelByKeyResponse() {
        return new AddProfanityWordToLevelByKeyResponse();
    }

    /**
     * Create an instance of {@link GetKeysByLicenseKey }
     * 
     */
    public GetKeysByLicenseKey createGetKeysByLicenseKey() {
        return new GetKeysByLicenseKey();
    }

    /**
     * Create an instance of {@link SimpleProfanityFilterResponse }
     * 
     */
    public SimpleProfanityFilterResponse createSimpleProfanityFilterResponse() {
        return new SimpleProfanityFilterResponse();
    }

    /**
     * Create an instance of {@link DeleteProfanityLevelByKeyResponse }
     * 
     */
    public DeleteProfanityLevelByKeyResponse createDeleteProfanityLevelByKeyResponse() {
        return new DeleteProfanityLevelByKeyResponse();
    }

    /**
     * Create an instance of {@link ProfanityFilter }
     * 
     */
    public ProfanityFilter createProfanityFilter() {
        return new ProfanityFilter();
    }

    /**
     * Create an instance of {@link DeleteKeyByLicenseKey }
     * 
     */
    public DeleteKeyByLicenseKey createDeleteKeyByLicenseKey() {
        return new DeleteKeyByLicenseKey();
    }

    /**
     * Create an instance of {@link DeleteProfanityWordFromLevelByKeyResponse }
     * 
     */
    public DeleteProfanityWordFromLevelByKeyResponse createDeleteProfanityWordFromLevelByKeyResponse() {
        return new DeleteProfanityWordFromLevelByKeyResponse();
    }

    /**
     * Create an instance of {@link GetReplaceTypesResponse }
     * 
     */
    public GetReplaceTypesResponse createGetReplaceTypesResponse() {
        return new GetReplaceTypesResponse();
    }

    /**
     * Create an instance of {@link AddProfanityWordToLevelByKey }
     * 
     */
    public AddProfanityWordToLevelByKey createAddProfanityWordToLevelByKey() {
        return new AddProfanityWordToLevelByKey();
    }

    /**
     * Create an instance of {@link GetReplaceTypes }
     * 
     */
    public GetReplaceTypes createGetReplaceTypes() {
        return new GetReplaceTypes();
    }

    /**
     * Create an instance of {@link GetDefaultWordsByLevelResponse }
     * 
     */
    public GetDefaultWordsByLevelResponse createGetDefaultWordsByLevelResponse() {
        return new GetDefaultWordsByLevelResponse();
    }

    /**
     * Create an instance of {@link SimpleProfanityFilter }
     * 
     */
    public SimpleProfanityFilter createSimpleProfanityFilter() {
        return new SimpleProfanityFilter();
    }

    /**
     * Create an instance of {@link CreateProfanityLevelResponse }
     * 
     */
    public CreateProfanityLevelResponse createCreateProfanityLevelResponse() {
        return new CreateProfanityLevelResponse();
    }

    /**
     * Create an instance of {@link UserDefinedResult }
     * 
     */
    public UserDefinedResult createUserDefinedResult() {
        return new UserDefinedResult();
    }

    /**
     * Create an instance of {@link ProfanityFilterResponse }
     * 
     */
    public ProfanityFilterResponse createProfanityFilterResponse() {
        return new ProfanityFilterResponse();
    }

    /**
     * Create an instance of {@link CreateUserDefinedKeyResponse }
     * 
     */
    public CreateUserDefinedKeyResponse createCreateUserDefinedKeyResponse() {
        return new CreateUserDefinedKeyResponse();
    }

    /**
     * Create an instance of {@link GetDefaultLevels }
     * 
     */
    public GetDefaultLevels createGetDefaultLevels() {
        return new GetDefaultLevels();
    }

    /**
     * Create an instance of {@link CreateUserDefinedKey }
     * 
     */
    public CreateUserDefinedKey createCreateUserDefinedKey() {
        return new CreateUserDefinedKey();
    }

    /**
     * Create an instance of {@link FilterReturn }
     * 
     */
    public FilterReturn createFilterReturn() {
        return new FilterReturn();
    }

    /**
     * Create an instance of {@link AddWordToNonProfanityListByKeyResponse }
     * 
     */
    public AddWordToNonProfanityListByKeyResponse createAddWordToNonProfanityListByKeyResponse() {
        return new AddWordToNonProfanityListByKeyResponse();
    }

    /**
     * Create an instance of {@link ReplaceType }
     * 
     */
    public ReplaceType createReplaceType() {
        return new ReplaceType();
    }

    /**
     * Create an instance of {@link ArrayOfProfanityLevel }
     * 
     */
    public ArrayOfProfanityLevel createArrayOfProfanityLevel() {
        return new ArrayOfProfanityLevel();
    }

    /**
     * Create an instance of {@link ArrayOfProfanityKey }
     * 
     */
    public ArrayOfProfanityKey createArrayOfProfanityKey() {
        return new ArrayOfProfanityKey();
    }

    /**
     * Create an instance of {@link ProfanityLevel }
     * 
     */
    public ProfanityLevel createProfanityLevel() {
        return new ProfanityLevel();
    }

    /**
     * Create an instance of {@link DeleteWordFromNonProfanityListByKey }
     * 
     */
    public DeleteWordFromNonProfanityListByKey createDeleteWordFromNonProfanityListByKey() {
        return new DeleteWordFromNonProfanityListByKey();
    }

    /**
     * Create an instance of {@link FilterRequest }
     * 
     */
    public FilterRequest createFilterRequest() {
        return new FilterRequest();
    }

    /**
     * Create an instance of {@link ArrayOfReplaceType }
     * 
     */
    public ArrayOfReplaceType createArrayOfReplaceType() {
        return new ArrayOfReplaceType();
    }

    /**
     * Create an instance of {@link DeleteKeyByLicenseKeyResponse }
     * 
     */
    public DeleteKeyByLicenseKeyResponse createDeleteKeyByLicenseKeyResponse() {
        return new DeleteKeyByLicenseKeyResponse();
    }

    /**
     * Create an instance of {@link DeleteProfanityLevelByKey }
     * 
     */
    public DeleteProfanityLevelByKey createDeleteProfanityLevelByKey() {
        return new DeleteProfanityLevelByKey();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetProfanityLevelsResponse }
     * 
     */
    public GetProfanityLevelsResponse createGetProfanityLevelsResponse() {
        return new GetProfanityLevelsResponse();
    }

    /**
     * Create an instance of {@link AddWordToNonProfanityListByKey }
     * 
     */
    public AddWordToNonProfanityListByKey createAddWordToNonProfanityListByKey() {
        return new AddWordToNonProfanityListByKey();
    }

    /**
     * Create an instance of {@link GetKeysByLicenseKeyResponse }
     * 
     */
    public GetKeysByLicenseKeyResponse createGetKeysByLicenseKeyResponse() {
        return new GetKeysByLicenseKeyResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", name = "FilterReturn")
    public JAXBElement<FilterReturn> createFilterReturn(FilterReturn value) {
        return new JAXBElement<FilterReturn>(_FilterReturn_QNAME, FilterReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", name = "UserDefinedResult")
    public JAXBElement<UserDefinedResult> createUserDefinedResult(UserDefinedResult value) {
        return new JAXBElement<UserDefinedResult>(_UserDefinedResult_QNAME, UserDefinedResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfanityLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", name = "ArrayOfProfanityLevel")
    public JAXBElement<ArrayOfProfanityLevel> createArrayOfProfanityLevel(ArrayOfProfanityLevel value) {
        return new JAXBElement<ArrayOfProfanityLevel>(_ArrayOfProfanityLevel_QNAME, ArrayOfProfanityLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReplaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", name = "ArrayOfReplaceType")
    public JAXBElement<ArrayOfReplaceType> createArrayOfReplaceType(ArrayOfReplaceType value) {
        return new JAXBElement<ArrayOfReplaceType>(_ArrayOfReplaceType_QNAME, ArrayOfReplaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfanityKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", name = "ArrayOfProfanityKey")
    public JAXBElement<ArrayOfProfanityKey> createArrayOfProfanityKey(ArrayOfProfanityKey value) {
        return new JAXBElement<ArrayOfProfanityKey>(_ArrayOfProfanityKey_QNAME, ArrayOfProfanityKey.class, null, value);
    }

}
