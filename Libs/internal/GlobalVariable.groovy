package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['url' : 'http://demoaut.katalon.com/', 'username' : 'John Doe', 'password' : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'])
        allVariables.put('QA', allVariables['default'] + ['url' : 'http://demoaut.katalon.com/', 'username' : 'John Doe', 'password' : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'])
        allVariables.put('reg', allVariables['default'] + ['url' : 'http://demoaut.katalon.com/', 'username' : 'John Doe', 'password' : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'])
        allVariables.put('staging', allVariables['default'] + ['url' : 'http://demoaut.katalon.com/', 'username' : 'John Doe', 'password' : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        url = selectedVariables['url']
        username = selectedVariables['username']
        password = selectedVariables['password']
        
    }
}
