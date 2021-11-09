import StepObject.RegistrationSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.internal.Utils;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.RegistrationData.*;
import static DataObject.RegistrationData.*;
public class Case1 extends ChromeRunner {
    @Test(retryAnalyzer = com.Facebook.Utils.Retry.class)
    @Severity(SeverityLevel.MINOR)
    @Description("Register a user")
    public void case_1() {
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .CreateAccount()
                .join()
                .email(emailAddress)
                .firstName(firstName)
                .lastName(lastName)
                .password(password)
                .birthDay()
                .birthMonth()
                .birthYear()
                .SelectGender()
                .SelectAllCheckBox()
                .DeleteCheckBox()
                .CheckMark1()
                .CheckMark2()
                .CheckMark3()
                .CheckMark4()
                .ModalButton()
                .CloseButton()
                .EnabledButton();

    }
}
