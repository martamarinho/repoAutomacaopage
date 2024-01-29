package Steps;

import Elementos.ElementosdeTela;
import Metodos.MetodosdeTela;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class Steps {
	
	 MetodosdeTela m =  new  MetodosdeTela();
	 ElementosdeTela e = new ElementosdeTela();

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
	    m.abrirNavegador(string);
	}

	@Quando("eu clicar no icon de logar")
	public void eu_clicar_no_icon_de_logar() throws InterruptedException {
	   m.pausar(5000);
	   m.clicar(e.getBtnLogar());
	}

	@Quando("preencher usuario e senha validos")
	public void preencher_usuario_e_senha_validos() throws InterruptedException {
	    m.preencher(e.getCmpUserName(), "mariaisabel");
	    m.pausar(2000);
	    m.preencher(e.getCmpUserSenha(), "Teste123");
	}

	@Quando("clicar no botao logar")
	public void clicar_no_botao_logar() {
		m.clicar(e.getBtnLogin());
	}

	@Entao("devo logar com sucesso")
	public void devo_logar_com_sucesso() throws InterruptedException {
	   m.pausar(3000);
	   m.fecharNavegador();
	}
	
	
}
