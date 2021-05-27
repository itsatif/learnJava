package classes_and_objects;

public class Fractionuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(20,50);
		f1.print();
		Fraction f2 = new Fraction(30,65);
		f2.add(f1);
		f1.multiply(f2);
		f1.print();
		f2.print();
		f1.setNumerator(97);
		int d = f1.getDenominator();
		int n = f1.getNumerator();
		System.out.println(n + "\t" + d);
		f1.setNumerator(805);
		f1.setDenominator(11);
		f1.print();
		Fraction f3 = Fraction.add(f1, f2);
		f3.print();
		f3.multiply(f1);
		int l = f3.getDenominator();
		System.out.println(l);
		f3.setNumerator(45);
		f3.print();
		

	}

}
