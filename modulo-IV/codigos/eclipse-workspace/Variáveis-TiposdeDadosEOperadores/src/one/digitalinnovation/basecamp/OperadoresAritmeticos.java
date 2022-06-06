package one.digitalinnovation.basecamp;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		System.out.println("PrePos");
		prePos();
		System.out.println("Aritmético");
		aritmetico();
		System.out.println("Atribuição");
		atribuicao();
		System.out.println("Precedência");
		precedencia();
	}

	private static void aritmetico() {

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		int r1 = a + b;
		int r2 = c - a;
		int r3 = d * b;
		int r4 = e / a;
		int r5 = c % b;

	}

	private static void prePos() {

		int k = 10;

		int i = ++k;
		int j = k--;
		int x = k;

		System.out.println("i:" + i);
		System.out.println("j:" + j);
		System.out.println("x:" + x);

	}

}
