public class DadosCliente {
	// aqui basta criar várias variáveis (atributos)
	int numeroConta;
	int digitoVerif;
	String cpfTitular;
	String nomeTitular;
	double saldo;

	void creditar(double valor) {
		saldo = saldo + valor;
	}

	void exibirInfo() {
		System.out.println("Conta: " + numeroConta + digitoVerif);
		System.out.println("CPF: " + cpfTitular);
		System.out.println("Nome: " + nomeTitular);
		System.out.println(" Saldo: R$ " + saldo);
	}

	double consultarSaldo() {
		return saldo;
	}

	boolean debitar(double valor) {
		if (valor <= saldo) {
			saldo = saldo + valor;
			return true;
		} else
			return false;
	}

}