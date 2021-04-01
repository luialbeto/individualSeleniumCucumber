package io.cucumber.luiz.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.luiz.pages.CommonPage;
import io.cucumber.luiz.pages.SitePageElementsMap;

public class CommonSteps {
	@Dado("que eu estou no {string} da Tricentis")
	public void que_eu_estou_no_site_da_Tricentis(String string) {
		CommonPage.abrir(string);
	}

	@Dado("que eu estou no formulario {string}")
	public void que_eu_estou_no_site_da_Tricentis_no_formulario(String string) throws InterruptedException {
		String formSelecionado = SitePageElementsMap.browser
				.findElement(By.cssSelector("li[class='idealsteps-step-active']")).getText();
		assertTrue(formSelecionado.contains(string));
	}

	@E("seleciono {string}: {string}")
	public void seleciono(String string, String string2) {
		Select dropdown = new Select(SitePageElementsMap.browser.findElement(By.name(string)));
		dropdown.selectByValue(string2);
	}

	@E("preencho {string}: {string}")
	public void preencho(String string, String string2) {
		WebElement input = SitePageElementsMap.browser.findElement(By.name(string));
		input.sendKeys(string2);
	}

	@Entao("devo clicar em Next para o formulario {string}")
	public void devo_clicar_em_Next_para_o_formulario(String string) {
		SitePageElementsMap.browser.findElement(By.cssSelector("button[id='next" + string.replace(" ", "") + "']"))
				.click();
	}

}
