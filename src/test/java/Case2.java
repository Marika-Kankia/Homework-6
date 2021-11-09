import StepObject.RegistrationSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class Case2 extends ChromeRunner {
    @Test(retryAnalyzer = com.Facebook.Utils.Retry.class)
    @Severity(SeverityLevel.MINOR)
    @Description("Register a user")
    public void case_2() {
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .CreateAccount()
                .join()
                .email("marikakankia")
                .firstName("marika")
                .EmailError()
                .EmailSendKeys()
                .email("marikakankia72")
                .EmailError()
                .EmailSendKeys()
                .email("marikakankia72@")
                .EmailError()
                .email("marikakankia72@gmail.com")
                .FirstnameSendKeys()
                .FirstNameError()
                .lastName("kankia")
                .LastNameSendkKeys()
                .password("marik")
                .LastNameError()
                .DisabledButton()
                .birthDay()
                .PasswordError()
                .birthMonth()
                .EmptyBirthYear();
//                .BirthDayError();
    }
}
