package day7_windows;

import base.TestBase;
import org.testng.annotations.Test;
import utilities.DocuportConstants;
import utilities.DocuportUtils;
import static utilities.DocuportConstants.USERNAME_CLIENT;

public class T00_login_docuport extends TestBase {

    @Test
    public void test_login_docuport() throws InterruptedException{
        DocuportUtils.login(driver, DocuportConstants.CLIENT);
        DocuportUtils.logOut(driver);
    }
}
