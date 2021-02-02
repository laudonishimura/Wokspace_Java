import java.util.Scanner;

public class TesteCartao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CartaoPrePago c1  = new CartaoPrePago(10012,"Professor Isidro",2022,10,200.00);
				
		//System.out.println(c1.exibirInfo());
		
		int opcao;
		double valor;
		
//		c1.setNumeroConta(100123);
//		c1.setDigitoVerif(4);  
//		c1.setCpfTitular("987.654.321-00");		
//		c1.setNomeTitular("Professor Isidro");
//		c1.setSaldo(0.0);
		
		do {
			System.out.println("Cartao Pre Pag ");
			System.out.println("Digite 1 - Adicionar / 2 - Comprar / 3 - Info / 0 - Encerrar");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor do crédito:");
				valor = teclado.nextDouble();
				c1.adicionarCredito(valor);
				break;				
			case 2:
				System.out.println("Digite o valor da compra:");
				valor = teclado.nextDouble();				
				if (c1.comprar(valor)) {
					System.out.println("Compra efetuada"); 
				}
				else {
					System.out.println("Compra não autorizado");
				}
				break;
			case 3:
				System.out.println(c1.exibirInfo());
				break;
			case 0:
				System.out.println("Obrigado pela preferencia");
				break;
			default:	
				System.out.println("Opcao invalida! Tente novamente");
			}
			
			
		} while (opcao  != 0);
		
		
				
		
		teclado.close();
	}

}