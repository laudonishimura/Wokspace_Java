public class Dados {
	// aqui basta criar v�rias vari�veis (atributos)
	String nome;
	String cargo;
	double salario;
	
	void imprimir(){
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println(" Sal�rio: R$ " + salario);
	}
			
	void calcularNovoSalario(double percentual) {
		salario = salario + salario * percentual / 100;
		}
}