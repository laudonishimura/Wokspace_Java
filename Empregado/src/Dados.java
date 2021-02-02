public class Dados {
	// aqui basta criar várias variáveis (atributos)
	String nome;
	String cargo;
	double salario;
	
	void imprimir(){
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println(" Salário: R$ " + salario);
	}
			
	void calcularNovoSalario(double percentual) {
		salario = salario + salario * percentual / 100;
		}
}