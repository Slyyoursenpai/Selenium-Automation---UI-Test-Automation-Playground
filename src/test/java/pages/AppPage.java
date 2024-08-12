package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class AppPage extends Form {
    private final ITextBox NAME_INPUT = getElementFactory().getTextBox(By.xpath("//input[@type='text' and @placeholder='User Name']"), "Username Input");
    private final ITextBox PASSWORD_INPUT = getElementFactory().getTextBox(By.xpath("//input[@type='password']"), "Password Input");
    private final IButton LOGIN = getElementFactory().getButton(By.id("login"),"Login Button");
    private final ILabel successLbl = getElementFactory().getLabel(By.id("loginstatus"),"Log In Successful");

    public AppPage() {
        super(By.className("container"), "Sample App");
    }

    public void enterUserName(String name) {
        NAME_INPUT.clearAndType(name);
    }
    public void enterPass(String pass) {
        PASSWORD_INPUT.clearAndType(pass);
    }
    public void loginPress() {
        LOGIN.click();
    }
    public String getWelcomeMessage() {
        return successLbl.getText();
    }
}
