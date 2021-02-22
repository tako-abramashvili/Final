package Amazon.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class ChangeLanguage {
    protected SelenideElement flagIcon = $(".icp-nav-flag-us"),
            checkLanguageChangeHeader = $("#lop-heading"),
            portuge = $(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[5]")),
            saveData = $("#icp-btn-save");


}
