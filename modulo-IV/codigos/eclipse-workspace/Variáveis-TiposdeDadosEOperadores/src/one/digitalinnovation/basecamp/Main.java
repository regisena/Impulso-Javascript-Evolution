package one.digitalinnovation.basecamp;

public class Main {

	public static void main(String[] args) {

		byte b1 = 10;
		byte b2 = 20;
		
		short s1 = 20000;
		short s2 = (short) 40000;
		
		//int i1 = -10000000000; //fora do limite inferior
		int i2 = 28500;
		
		long l1 = 1000000000000000000L;
		long l2 = 2004005000500055000L;
		
		//decimais
		float f1 = (float) 4.5;
		float f2 = 10.68F;
		
		double d1 = 85.69; // não colocar o d no final infere-se que é double
		double d2 = 99.84D;
		
		char c1 = 'W';
		//char c2 = 'Tw'; // armazena somente um caractere
		char c3 = '\u0057'; // código unicode
		
		String st1 = "Fulano";
		String st2 = "Cicrano";
		String st3 = "Era uma vez uma variável que armazenava poucas lembranças";
		
		boolean bo1 = true;
		boolean bo2 = false; // default
				
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("i2 = "+i2);
		System.out.println("l1 = "+l1);
		System.out.println("l2 = "+l2);
		System.out.println("f1 = "+f1);
		System.out.println("f2 = "+f2);
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("c1 = "+c1);
		System.out.println("c3 = "+c3);
		System.out.println("st1 = "+st1);
		System.out.println("st2 = "+st2);
		System.out.println("st3 = "+st3);
		System.out.println("bo1 = "+bo1);
		System.out.println("bo2 = "+bo2);
	}

}
