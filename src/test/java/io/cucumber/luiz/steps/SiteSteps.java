package io.cucumber.luiz.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.luiz.pages.CommonPage;
import io.cucumber.luiz.pages.SitePageElementsMap;

public class SiteSteps {	


	@Dado("seleciono em Hobbies Other")
	public void seleciono_em_Hobbies_Other() {
		SitePageElementsMap.browser.findElement(By.xpath("//following-sibling::span[@class='ideal-check']")).click();
	}
	
	@Dado("anexo foto")
	public void anexo_foto() {
		WebElement add = SitePageElementsMap.browser.findElement(By.xpath("//*[@id=\"picturecontainer\"]"));
		String dir = new String();
		dir = "Home"; 
		add.sendKeys(dir);
	}
	
	@Dado("seleciono em Optional Products Euro Protection")
	public void seleciono_em_Optional_Products_Euro_Protection() {
		SitePageElementsMap.browser.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
	}
	
	@Dado("seleciono em Select Option o plano Platinum")
	public void seleciono_em_Select_Option_o_plano_Platinum() {
		SitePageElementsMap.browser.findElement(By.xpath("//*#priceTable > tfoot > tr > th.group > label:nth-child(4) > span")).click();
	}
	
	@Dado("clico em Send")
	public void clico_em_Send() throws InterruptedException{
		Thread.sleep(1000);
		SitePageElementsMap.browser.findElement(By.cssSelector("button[id='sendemail']")).click();
	}
	
	@E("seleciono em Gender Male")
	public void seleciono_em_Gender_Male() {
		SitePageElementsMap.browser.findElement(By.xpath("//*#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1)")).click();
	}
	
	@Entao("devo ver a mensagem {string}")
	public void devo_ver_a_mensagem(String string) throws InterruptedException {
		WebElement input = SitePageElementsMap.browser.findElement(By.cssSelector("div[class='sweet-alert showSweetAlert visible']"));
		WebElement mensagem = SitePageElementsMap.browser.findElement(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>h2"));
	    assertTrue(input.isDisplayed());
	    assertEquals(string, mensagem.getText());
	    CommonPage.fechar();
	}
}