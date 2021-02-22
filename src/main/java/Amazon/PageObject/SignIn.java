package Amazon.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignIn {

    protected SelenideElement
            Sign  = $("a-autoid-0-announce"),
            emailField = $("a-autoid-0-announce"),
            next = $("continue"),
            password = $("ap_password"),
            login = $("signInSubmit");

}

