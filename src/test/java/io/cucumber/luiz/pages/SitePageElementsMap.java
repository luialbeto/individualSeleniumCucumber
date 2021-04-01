package io.cucumber.luiz.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SitePageElementsMap {

    public static WebDriver browser;

    public void seleciono(String string, String string2) {
        Select selectDropdown = new Select(CommonPage.browser.findElement(By.name(string)));
        selectDropdown.selectByValue(string2);
    }

    public void preencho(String string, String string2) {
        WebElement input = CommonPage.browser.findElement(By.name(string));
        input.sendKeys(string2);
    }

    public void pressiono_next(String string) {
        CommonPage.browser.findElement(By.cssSelector("button[id='next" + string.replace(" ", "") + "']")).click();
    }

    public void formulario(String string) throws InterruptedException {
        String formularios = CommonPage.browser.findElement(By.cssSelector("li[class='idealsteps-step-active']"))
                .getText();
        assertTrue(formularios.contains(string));
    }
}
