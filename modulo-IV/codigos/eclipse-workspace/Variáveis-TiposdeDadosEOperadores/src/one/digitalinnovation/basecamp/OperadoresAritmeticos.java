package one.digitalinnovation.basecamp;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		System.out.println("..:: PrePos ::..\n");
		prePos();
		System.out.println("\n..:: Aritmético ::..\n");
		aritmetico();
		System.out.println("\n..:: Atribuição ::..\n");
		atribuicao();
		System.out.println("\n..:: Precedência ::..\n");
		precedencia();
	}

	private static void precedencia() {

		int i = 10;
		int j = 20;
		int k = 30;

		int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580

		System.out.println("i++ + --j: " + a);

		System.out.println("i: " + i); // 11

		int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1

		System.out.println("k / --i % 3 + 1: " + b);

		System.out.println("i: " + i); // 10

		int c = 2;

		c *= i += 5; // c = 2 * i -> i = i + 5 -> c = 2 * i; i = 10 + 5; -> c = 2 * 15; -> c = 2 *
						// 15; c = 30

		System.out.println("c *= i += 5: " + c);

	}

	private static void atribuicao() {

		int i = 1500;
		short j = 15;
		long l = 500L;
		int k = 35;
		float f = 3.5F;
		double d = f;

		System.out.println("d: " + d);

		i += 5; // i = i + 5
		j -= 3; // j = j - 3
		d /= 2.7d; // d = d / 2.7d ~ d = 3.5f / 2.7d
		l *= 3; // l = l * 3
		k %= 2; // k = k % 2

		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("d: " + d);
		System.out.println("l: " + l);
		System.out.println("k: " + k);

		i = k = j;

		System.out.println("k: " + k);
		System.out.println("i: " + i);
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
		
		System.out.println("r1: "+r1);
		System.out.println("r2: "+r2);
		System.out.println("r3: "+r3);
		System.out.println("r4: "+r4);
		System.out.println("r5: "+r5);

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
