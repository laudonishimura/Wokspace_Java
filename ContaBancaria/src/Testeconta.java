public class Testeconta {
	public static void main(String[] args) {
		
		DadosCliente c1;  // declarei uma variável c1 do tipo Dados
				
		// antes de começar a preencher os dados, preciso criar a área de memória
		c1 = new DadosCliente();
		
		/*
		 * int numeroConta;
			int digitoVerif;
			String cpfTitular;
			String nomeTitular;
			double saldo;
		 */
		c1.numeroConta  = 12345;
		c1.digitoVerif  = 1;
		c1.cpfTitular = "11122233344";
		c1.nomeTitular = "Cliente Abc";
		c1.saldo = 10000.00;

		
		// exibindo os anuncios
		c1.exibirInfo();
		
		System.out.println("Saldo:" + c1.consultarSaldo);
		
		
	}

}