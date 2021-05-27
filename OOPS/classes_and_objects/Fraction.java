package classes_and_objects;

public class Fraction {
	private int numerator;
	private int denominator;
	
	
	public Fraction(int numerator,int denominator) {
		this.numerator = numerator;
		if(this.denominator == 0) {
			//TODO error out
		}
		this.denominator = denominator;
		simplify();
	}
	
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setNumerator(int n) {
		this.numerator = n;
		simplify();
	}
	public void setDenominator(int d) {
		if(this.denominator == 0) {
			//TODO error out
		}
		this.denominator = d;
		simplify();
	}
	
	private void simplify() {
		int gcd = 1;
		int smallerOfNrandDr = Math.min(numerator, denominator);
		for(int i=2;i<=smallerOfNrandDr;i++) {
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator /= gcd;
		denominator /= gcd;
	}
	public void print() {
		if(denominator == 1) {
			System.out.println(numerator);
		}
		else {
			System.out.println(numerator + "/" + denominator);
		}
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int newNr = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
		int newDr = (f1.denominator * f2.denominator);
		Fraction f = new Fraction(newNr,newDr);
		return f; 
	}
	public void add(Fraction f) {
		this.numerator = (this.numerator * f.denominator) + (this.denominator * f.numerator);
		this.denominator = this.denominator * f.denominator;
		simplify();
	}
	public void multiply(Fraction f) {
		this.numerator = this.numerator * f.numerator;
		this.denominator = this.denominator * f.denominator;
		simplify();
	}
}
