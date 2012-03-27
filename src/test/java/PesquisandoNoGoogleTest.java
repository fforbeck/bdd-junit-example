import org.junit.Test;

import story.PesquisandoNoGoogleStory;

public class PesquisandoNoGoogleTest {

	@Test
	public void cenarioPesquisandoPelaPalavraGroovy() throws Exception {
		new PesquisandoNoGoogleStory()
		.dadoQueOUsuarioAbraONavegador()
		.eAcessarAPaginaDoGoogle()
		.quandoDigitarAPalavraGroovy()
		.eClicarNoBotaoPesquisar()
		.entaoGarantirOTituloDaPagina()
		.depoisDaPesquisaOUsuarioFechaAPagina();
	}
}
