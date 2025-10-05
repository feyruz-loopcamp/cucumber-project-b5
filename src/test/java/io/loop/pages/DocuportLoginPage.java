package io.loop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.loop.utilities.Driver;

public class DocuportLoginPage {

    public DocuportLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "input-14")
    public WebElement input14Textinput;

    @FindBy(id = "input-15")
    public WebElement input15Passwordinput;

    @FindBy(xpath = "//button[@aria-label='append icon']")
    public WebElement appendIconButton;

}
