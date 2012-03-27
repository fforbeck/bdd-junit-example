package story;

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
public class PesquisandoNoGoogleStory {

	private FirefoxDriver firefox;
	private GoogleSearchPage googleSearchPage;

	public PesquisandoNoGoogleStory dadoQueOUsuarioAbraONavegador() {
		firefox = new FirefoxDriver();
		firefox.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		return this;
	}

	public PesquisandoNoGoogleStory eAcessarAPaginaDoGoogle() {
		googleSearchPage = initElements(firefox, GoogleSearchPage.class);
		googleSearchPage.open("http://www.google.com");
		return this;
	}

	public PesquisandoNoGoogleStory quandoDigitarAPalavraGroovy() {
		googleSearchPage.type("groovy");
		return this;
	}

	public PesquisandoNoGoogleStory eClicarNoBotaoPesquisar() {
		googleSearchPage.clickOnSearchButton();
		return this;
	}

	public PesquisandoNoGoogleStory entaoGarantirOTituloDaPagina() {
		Assert.assertEquals("Google", googleSearchPage.getTitle());
		return this;
	}

	public PesquisandoNoGoogleStory depoisDaPesquisaOUsuarioFechaAPagina() {
		googleSearchPage.close();
		return this;
	}

}