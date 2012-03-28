package test;

import org.junit.Test;

import scenario.PesquisandoAPalavraGroovyNoGoogleScenario;

/**
 * Narrativa: Pesquisando no google.
 * 
 * Como um: Usuário.
 * 
 * Eu quero: Realizar uma pesquisa no site do google.
 * 
 * Então: Após encontrar o resultado esperado posso obter mais informações para
 * minha pesquisa.
 * 
 * @author felipeforbeck
 */
public class PesquisandoNoGoogleStoryTest {

	@Test
	public void testScenarioPesquisandoAPalavraGroovyNoGoogle() throws Exception {
		new PesquisandoAPalavraGroovyNoGoogleScenario()
				.dadoQueOUsuarioAbraONavegador()
				.eAcessaAPaginaDoGoogle()
				.quandoDigitarAPalavraGroovy()
				.eClicarNoBotaoPesquisar()
				.entaoValidarOTituloDaPagina() // TODO validar o resultado da busca
				.depoisDaPesquisaOUsuarioFechaAPagina();
	}
}
