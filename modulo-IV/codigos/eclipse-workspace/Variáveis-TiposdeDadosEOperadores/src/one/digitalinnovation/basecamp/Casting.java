package one.digitalinnovation.basecamp;

public class Casting {

	public static void main(String[] args) {
		// byte < short < int < long < float < double
		byte b1;
		short s1 = 1000;
		b1 = (byte) s1; // downcast E

		long l1;
		int i1 = 1000000000;
		l1 = i1; // upcast I

		int i2;
		long l2 = 1000000000000000000L;
		i2 = (int) l2; // downcast E

		int i3;
		long l3 = 10000L;
		i3 = (int) l3; // downcast E

		double d1;
		float f1 = 10.5F;
		d1 = f1; // upcast I

		float f2;
		float f3;
		double d2 = 10000.58D;
		f2 = (float) d2; // downcast E não há perda
		double d3 = 10000.58888888888888888888888888888888d;
		f3 = (float) d3; // downcast E* perda

		int i4;
		float f4 = 11.5697F;
		i4 = (int) f4; // downcast E

		System.out.println("b1:" + b1);
		System.out.println("l1:" + l1);
		System.out.println("i2:" + i2);
		System.out.println("i3:" + i3);
		System.out.println("d1:" + d1);
		System.out.println("f2:" + f2);
		System.out.println("f3:" + f3);
		System.out.println("i4:" + i4);

		b1 = (byte) d3; // downcast E

		System.out.println("b1:" + b1);

	}

}
