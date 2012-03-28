package scenario;

import static org.openqa.selenium.support.PageFactory.initElements;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.firefox.FirefoxDriver;

import page.GoogleSearchPage;

/**
 * Narrativa: Pesquisando no google a palavra 'Groovy'.
 * 
 * Como um: Usuário.
 * 
 * Eu quero: Encontrar no google o link para o site oficial da linguagem de
 * programação Groovy.
 * 
 * Então: Após encontrar o link poderei consultar a página para mais
 * informações.
 * 
 * @author felipeforbeck
 * 
 */
public class PesquisandoAPalavraGroovyNoGoogleScenario {

	private FirefoxDriver firefox;
	private GoogleSearchPage googleSearchPage;

	public PesquisandoAPalavraGroovyNoGoogleScenario dadoQueOUsuarioAbraONavegador() {
		firefox = new FirefoxDriver();
		firefox.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		return this;
	}

	public PesquisandoAPalavraGroovyNoGoogleScenario eAcessaAPaginaDoGoogle() {
		googleSearchPage = initElements(firefox, GoogleSearchPage.class);
		googleSearchPage.open("http://www.google.com");
		return this;
	}

	public PesquisandoAPalavraGroovyNoGoogleScenario quandoDigitarAPalavraGroovy() {
		googleSearchPage.type("groovy");
		return this;
	}

	public PesquisandoAPalavraGroovyNoGoogleScenario eClicarNoBotaoPesquisar() {
		googleSearchPage.clickOnSearchButton();
		return this;
	}

	public PesquisandoAPalavraGroovyNoGoogleScenario entaoValidarOTituloDaPagina() {
		Assert.assertEquals("Google", googleSearchPage.getTitle());
		return this;
	}

	public PesquisandoAPalavraGroovyNoGoogleScenario depoisDaPesquisaOUsuarioFechaAPagina() {
		googleSearchPage.close();
		return this;
	}

}