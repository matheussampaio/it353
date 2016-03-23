
package com.cdyne.ws.profanityws.profanity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProfanitySoap", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProfanitySoap {


    /**
     * Basic Profanity Filter, which replaces curse words with the world [Explicit]. CDYNE uses a proprietary database of words. To suggest a new word, please email info@cdyne.com
     * 
     * @param text
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.FilterReturn
     */
    @WebMethod(operationName = "SimpleProfanityFilter", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/SimpleProfanityFilter")
    @WebResult(name = "SimpleProfanityFilterResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "SimpleProfanityFilter", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.SimpleProfanityFilter")
    @ResponseWrapper(localName = "SimpleProfanityFilterResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.SimpleProfanityFilterResponse")
    public FilterReturn simpleProfanityFilter(
        @WebParam(name = "Text", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String text);

    /**
     * Regular Profanity Filter, Allows you to specify the level you wish to clean, and this also goes through a number filter to help find cleanse more profanity.
     * 
     * @param text
     * @param useNumberFilter
     * @param levelToClean
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.FilterReturn
     */
    @WebMethod(operationName = "ProfanityFilter", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/ProfanityFilter")
    @WebResult(name = "ProfanityFilterResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "ProfanityFilter", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.ProfanityFilter")
    @ResponseWrapper(localName = "ProfanityFilterResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.ProfanityFilterResponse")
    public FilterReturn profanityFilter(
        @WebParam(name = "Text", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String text,
        @WebParam(name = "LevelToClean", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int levelToClean,
        @WebParam(name = "UseNumberFilter", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        boolean useNumberFilter);

    /**
     * This allows you to access to the more advanced functions which allow you to create your own lists, and levels of profanity, and the use of Phonetics(Sounds Like)
     * 
     * @param request
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.FilterReturn
     */
    @WebMethod(operationName = "AdvancedProfanityFilter", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/AdvancedProfanityFilter")
    @WebResult(name = "AdvancedProfanityFilterResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "AdvancedProfanityFilter", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.AdvancedProfanityFilter")
    @ResponseWrapper(localName = "AdvancedProfanityFilterResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.AdvancedProfanityFilterResponse")
    public FilterReturn advancedProfanityFilter(
        @WebParam(name = "Request", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        FilterRequest request);

    /**
     * Gets all the Types of Replacement values you are allowed to use
     * 
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.ArrayOfReplaceType
     */
    @WebMethod(operationName = "GetReplaceTypes", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/GetReplaceTypes")
    @WebResult(name = "GetReplaceTypesResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "GetReplaceTypes", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetReplaceTypes")
    @ResponseWrapper(localName = "GetReplaceTypesResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetReplaceTypesResponse")
    public ArrayOfReplaceType getReplaceTypes();

    /**
     * This will create a new User Defined Levels Identification Code for you when you want to create your own Profanity Levels.
     * 
     * @param alias
     * @param useDefaultDatabase
     * @param licenseKey
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.UserDefinedResult
     */
    @WebMethod(operationName = "CreateUserDefinedKey", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/CreateUserDefinedKey")
    @WebResult(name = "CreateUserDefinedKeyResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "CreateUserDefinedKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.CreateUserDefinedKey")
    @ResponseWrapper(localName = "CreateUserDefinedKeyResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.CreateUserDefinedKeyResponse")
    public UserDefinedResult createUserDefinedKey(
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey,
        @WebParam(name = "Alias", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String alias,
        @WebParam(name = "UseDefaultDatabase", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        boolean useDefaultDatabase);

    /**
     * Creates a profanity level within a key. Use 0 For DefaultWordsLevel paramter if you do not wish to include words from default database.
     * 
     * @param level
     * @param description
     * @param defaultWordsLevel
     * @param licenseKey
     * @param key
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.UserDefinedResult
     */
    @WebMethod(operationName = "CreateProfanityLevel", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/CreateProfanityLevel")
    @WebResult(name = "CreateProfanityLevelResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "CreateProfanityLevel", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.CreateProfanityLevel")
    @ResponseWrapper(localName = "CreateProfanityLevelResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.CreateProfanityLevelResponse")
    public UserDefinedResult createProfanityLevel(
        @WebParam(name = "Level", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int level,
        @WebParam(name = "Description", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String description,
        @WebParam(name = "DefaultWordsLevel", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int defaultWordsLevel,
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey,
        @WebParam(name = "Key", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int key);

    /**
     * Gets all the profanity level.
     * 
     * @param licenseKey
     * @param key
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.ArrayOfProfanityLevel
     */
    @WebMethod(operationName = "GetProfanityLevels", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/GetProfanityLevels")
    @WebResult(name = "GetProfanityLevelsResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "GetProfanityLevels", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetProfanityLevels")
    @ResponseWrapper(localName = "GetProfanityLevelsResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetProfanityLevelsResponse")
    public ArrayOfProfanityLevel getProfanityLevels(
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey,
        @WebParam(name = "Key", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int key);

    /**
     * Adds a profanity word to a profanity level.
     * 
     * @param level
     * @param word
     * @param licenseKey
     * @param key
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.UserDefinedResult
     */
    @WebMethod(operationName = "AddProfanityWordToLevelByKey", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/AddProfanityWordToLevelByKey")
    @WebResult(name = "AddProfanityWordToLevelByKeyResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "AddProfanityWordToLevelByKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.AddProfanityWordToLevelByKey")
    @ResponseWrapper(localName = "AddProfanityWordToLevelByKeyResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.AddProfanityWordToLevelByKeyResponse")
    public UserDefinedResult addProfanityWordToLevelByKey(
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey,
        @WebParam(name = "Key", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int key,
        @WebParam(name = "Level", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int level,
        @WebParam(name = "Word", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String word);

    /**
     * Deletes a profanity word from a level.
     * 
     * @param level
     * @param word
     * @param licenseKey
     * @param key
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.UserDefinedResult
     */
    @WebMethod(operationName = "DeleteProfanityWordFromLevelByKey", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/DeleteProfanityWordFromLevelByKey")
    @WebResult(name = "DeleteProfanityWordFromLevelByKeyResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "DeleteProfanityWordFromLevelByKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.DeleteProfanityWordFromLevelByKey")
    @ResponseWrapper(localName = "DeleteProfanityWordFromLevelByKeyResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.DeleteProfanityWordFromLevelByKeyResponse")
    public UserDefinedResult deleteProfanityWordFromLevelByKey(
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey,
        @WebParam(name = "Key", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int key,
        @WebParam(name = "Level", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int level,
        @WebParam(name = "Word", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String word);

    /**
     * This will retrieve a list of all the keys based on a LicenseKey.
     * 
     * @param licenseKey
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.ArrayOfProfanityKey
     */
    @WebMethod(operationName = "GetKeysByLicenseKey", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/GetKeysByLicenseKey")
    @WebResult(name = "GetKeysByLicenseKeyResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "GetKeysByLicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetKeysByLicenseKey")
    @ResponseWrapper(localName = "GetKeysByLicenseKeyResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetKeysByLicenseKeyResponse")
    public ArrayOfProfanityKey getKeysByLicenseKey(
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey);

    /**
     * This will get all the words in a specific level.
     * 
     * @param level
     * @param licenseKey
     * @param key
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.ArrayOfString
     */
    @WebMethod(operationName = "GetWordsByLevel", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/GetWordsByLevel")
    @WebResult(name = "GetWordsByLevelResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "GetWordsByLevel", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetWordsByLevel")
    @ResponseWrapper(localName = "GetWordsByLevelResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetWordsByLevelResponse")
    public ArrayOfString getWordsByLevel(
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey,
        @WebParam(name = "Key", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int key,
        @WebParam(name = "Level", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int level);

    /**
     * This will delete a profanity level from a key
     * 
     * @param level
     * @param licenseKey
     * @param key
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.UserDefinedResult
     */
    @WebMethod(operationName = "DeleteProfanityLevelByKey", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/DeleteProfanityLevelByKey")
    @WebResult(name = "DeleteProfanityLevelByKeyResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "DeleteProfanityLevelByKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.DeleteProfanityLevelByKey")
    @ResponseWrapper(localName = "DeleteProfanityLevelByKeyResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.DeleteProfanityLevelByKeyResponse")
    public UserDefinedResult deleteProfanityLevelByKey(
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey,
        @WebParam(name = "Key", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int key,
        @WebParam(name = "Level", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int level);

    /**
     * This will delete your key.
     * 
     * @param licenseKey
     * @param key
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.UserDefinedResult
     */
    @WebMethod(operationName = "DeleteKeyByLicenseKey", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/DeleteKeyByLicenseKey")
    @WebResult(name = "DeleteKeyByLicenseKeyResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "DeleteKeyByLicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.DeleteKeyByLicenseKey")
    @ResponseWrapper(localName = "DeleteKeyByLicenseKeyResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.DeleteKeyByLicenseKeyResponse")
    public UserDefinedResult deleteKeyByLicenseKey(
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey,
        @WebParam(name = "Key", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int key);

    /**
     * This will add a word to our Non Profanity List, incase our Profanity Filter mistakens a word.
     * 
     * @param word
     * @param licenseKey
     * @param key
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.UserDefinedResult
     */
    @WebMethod(operationName = "AddWordToNonProfanityListByKey", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/AddWordToNonProfanityListByKey")
    @WebResult(name = "AddWordToNonProfanityListByKeyResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "AddWordToNonProfanityListByKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.AddWordToNonProfanityListByKey")
    @ResponseWrapper(localName = "AddWordToNonProfanityListByKeyResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.AddWordToNonProfanityListByKeyResponse")
    public UserDefinedResult addWordToNonProfanityListByKey(
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey,
        @WebParam(name = "Key", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int key,
        @WebParam(name = "Word", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String word);

    /**
     * This will delete a non-profane word from our Non Profanity Database.
     * 
     * @param word
     * @param licenseKey
     * @param key
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.UserDefinedResult
     */
    @WebMethod(operationName = "DeleteWordFromNonProfanityListByKey", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/DeleteWordFromNonProfanityListByKey")
    @WebResult(name = "DeleteWordFromNonProfanityListByKeyResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "DeleteWordFromNonProfanityListByKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.DeleteWordFromNonProfanityListByKey")
    @ResponseWrapper(localName = "DeleteWordFromNonProfanityListByKeyResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.DeleteWordFromNonProfanityListByKeyResponse")
    public UserDefinedResult deleteWordFromNonProfanityListByKey(
        @WebParam(name = "LicenseKey", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String licenseKey,
        @WebParam(name = "Key", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int key,
        @WebParam(name = "Word", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        String word);

    /**
     * 
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.ArrayOfProfanityLevel
     */
    @WebMethod(operationName = "GetDefaultLevels", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/GetDefaultLevels")
    @WebResult(name = "GetDefaultLevelsResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "GetDefaultLevels", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetDefaultLevels")
    @ResponseWrapper(localName = "GetDefaultLevelsResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetDefaultLevelsResponse")
    public ArrayOfProfanityLevel getDefaultLevels();

    /**
     * 
     * @param level
     * @return
     *     returns com.cdyne.ws.profanityws.profanity.ArrayOfString
     */
    @WebMethod(operationName = "GetDefaultWordsByLevel", action = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx/GetDefaultWordsByLevel")
    @WebResult(name = "GetDefaultWordsByLevelResult", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
    @RequestWrapper(localName = "GetDefaultWordsByLevel", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetDefaultWordsByLevel")
    @ResponseWrapper(localName = "GetDefaultWordsByLevelResponse", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx", className = "com.cdyne.ws.profanityws.profanity.GetDefaultWordsByLevelResponse")
    public ArrayOfString getDefaultWordsByLevel(
        @WebParam(name = "Level", targetNamespace = "http://ws.cdyne.com/ProfanityWS/Profanity.asmx")
        int level);

}