public class Salario {
	public static void main(String[] args) {
		
		Dados c1;  // declarei uma vari�vel c1 do tipo Dados
				
		// antes de come�ar a preencher os dados, preciso criar a �rea de mem�ria
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