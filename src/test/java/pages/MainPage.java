package pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final ILink linkToClick = getElementFactory().getLink(By.xpath("//a[text()='Sample App']"), "Sample App");

    public MainPage() {
        super(By.className("img-fluid"), "Home Page");
    }
    public void clickLink() {
        linkToClick.click();
    }
}