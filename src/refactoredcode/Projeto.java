package refactoredcode;

import java.util.List;

public class Projeto {

	public int d;

	public boolean isEntregue() {
		return false;
	}

	public List<Cliente> getClientes() {
		return null;
	}
	
	public String verificaAndamento() {

		if (this.d < 90) {
			return this.verificaPrazo();
		} else {

			this.avisaCliente();
			return "Projeto atrasado";
		}
	}

	public String verificaPrazo() {

		if (!isEntregue()) {
			// projeto ainda em andamento e com prazo curto para entrega
			return "Projeto está apertado";
		} else {
			return "Projeto entregue";
		}
	}

	public void avisaCliente() {
		List<Cliente> clients = this.getClientes();
		for (Cliente c : clients) {
			c.avisaAtraso(this.d);
		}
	}

}
