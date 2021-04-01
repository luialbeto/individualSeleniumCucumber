package io.cucumber.luiz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonPage {
	public static WebDriver browser;
    public static void abrir(String url){
        
        if(browser == null){
        	System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            browser = new ChromeDriver(options);
        }
        
        browser.get("http://sampleapp.tricentis.com/101/app.php");
    }

    public static void fechar(){
        browser.close();
        browser = null;
    }
    
}