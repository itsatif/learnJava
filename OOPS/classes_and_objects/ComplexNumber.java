package classes_and_objects;

public class ComplexNumber {
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real,int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public int getRealNumber() {
		return real;
	}
	
	public int getImaginaryNumber() {
		return imaginary;
	}
	
	public void setRealNumber(int rl) {
		this.real = rl;
	}
	
	public void setImaginaryNumber(int img) {
		this.imaginary = img;
	}
	
	public void print() {
		if(imaginary == 0) {
			System.out.println(real);
		}
		System.out.println(real +" " + "+" + " " + imaginary + "i");
	}
	
	public void add(ComplexNumber c) {
		this.real = this.real + c.real;
		this.imaginary = this.imaginary + c.imaginary;
	}
	
	public void multiply(ComplexNumber c) {
		int temp = this.real;
		this.real = (this.real * c.real) - (this.imaginary * c.imaginary);
		this.imaginary = (this.imaginary * c.real) + (temp * c.imaginary);
	}
	
	public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2) {
		int rl = c1.real + c2.real;
		int img = c1.imaginary + c2.imaginary;
		ComplexNumber c = new ComplexNumber(rl,img);
		return c;
	}
	
	public void subtract(ComplexNumber c) {
		if(this.imaginary == 0) {
			//TODO error out
		}
		this.real = this.real > c.real ? this.real - c.real : c.real - this.real;
		this.imaginary = this.imaginary > c.imaginary ? this.imaginary - c.imaginary : c.imaginary - this.imaginary;
	}
	
}
