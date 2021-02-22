package Amazon.PageObject;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ChangeCurrency {
    protected SelenideElement flagIcon = $(".icp-nav-flag"),
            currency = $(".icp-flyout-change"),
            checkLanguageChangeHeader = $("#lop-heading"),
            currencyList = $("#a-autoid-0-announce"),
            emirates = $(byText("AED - Arab Emirates Dirham")),
            saveData = $("#icp-btn-save");


}
