import StepObject.RegistrationSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.RegistrationData.*;
import static DataObject.RegistrationData.password;

public class Case1 extends ChromeRunner {
    @Test
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
