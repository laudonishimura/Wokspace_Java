public class Salario {
	public static void main(String[] args) {
		
		Dados c1;  // declarei uma variável c1 do tipo Dados
				
		// antes de começar a preencher os dados, preciso criar a área de memória
		c1 = new Dados();
		
		
		c1.nome   = "Antonio";
		c1.cargo  = "Analista";
		c1.salario = 10000.00;
		
		// exibindo os anuncios
		c1.imprimir();
		
		c1.calcularNovoSalario(10.0);			
		
		c1.imprimir();
		
		
	}

}