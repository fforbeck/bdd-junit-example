package test;
import org.junit.Test;

import story.PesquisandoNoGoogleStory;

public class PesquisandoNoGoogleTest {

	@Test
	public void testStoryPesquisandoNoGoogle() throws Exception {
		new PesquisandoNoGoogleStory()
		.dadoQueOUsuarioAbraONavegador()
		.eAcessaAPaginaDoGoogle()
		.quandoDigitarAPalavraGroovy()
		.eClicarNoBotaoPesquisar()
		.entaoValidarOTituloDaPagina() // TODO validar o resultado da busca
		.depoisDaPesquisaOUsuarioFechaAPagina();
	}
}
