package Amazon.PageObject;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Covid19 {

    protected SelenideElement
            AllList = $("#nav-hamburger-menu"),
            HelpButton = $("#hmenu-content").$(byLinkText("Help")),
            Covid = $(byText("Amazon and COVID-19"));

}





