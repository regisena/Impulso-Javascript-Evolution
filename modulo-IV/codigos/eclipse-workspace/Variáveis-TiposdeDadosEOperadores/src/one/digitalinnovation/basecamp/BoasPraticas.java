package one.digitalinnovation.basecamp;

public class BoasPraticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		//int i; //erro de duplicidade
		int I;
		//int 1a;// n�o se deve iniciar com numeral
		int _1a;// n�o d� erro de compila��o, mas melhor evitar
		int $aq;// n�o d� erro de compila��o, mas melhor evitar
		
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		final int j = 10;// final, quer dizer que � constante
		//j = 15;// j� foi definida como constante
		int asrn24678md;
		//int asrn146 78md;// espa�o no nome da vari�vel
		int asrn2$4678_md = 10;
		//int asrn2546%78_md = 10;
		
		asrn24678md = 100;
		asrn2$4678_md = 10;
		
		int quantidadeProduto = 50;
		//int QuantidadeProduto;//n�o segue as boas pr�ticas
		final int NUMERO_TENTATIVAS = 5;
		//final int numeroTENTATIVAS = 5;
		int NUMERO_OPCOES = 25; //n�o � final, n�o segue boas pr�ticas
		//int qtdProd;
		
		System.out.println("i: "+i);
		System.out.println("I: "+I);
		System.out.println("_1a: "+_1a);
		System.out.println("$aq: "+$aq);
		System.out.println("");
		System.out.println("j: "+j);
		System.out.println("asrn24678md: "+asrn24678md );
		System.out.println("asrn24678md: "+asrn24678md);
		System.out.println("");
		System.out.println("quantidadeProduto: "+quantidadeProduto);
		System.out.println("NUMERO_TENTATIVAS: "+NUMERO_TENTATIVAS);
		System.out.println("NUMERO_OPCOES: "+NUMERO_OPCOES);
		
		
		
	}

}
