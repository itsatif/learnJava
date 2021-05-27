package classes_and_objects;

public class ComplexNumberUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComplexNumber c1 = new ComplexNumber(3,2);
		c1.print();
		ComplexNumber c2 = new ComplexNumber(5,6);
		c2.print();
		c1.setImaginaryNumber(8);
		c2.setRealNumber(5);
		int im = c1.getImaginaryNumber();
		System.out.println(im);
		int rl = c2.getRealNumber();
		System.out.println(rl);
		c1.print();
		c2.print();
		c1.add(c2);
		c1.print();
		ComplexNumber c3 = ComplexNumber.add(c1, c2);
		c3.print();
		c1.subtract(c3);
		c1.print();
		c2.multiply(c3);
		c2.print();
		c1.setImaginaryNumber(3);
		c1.setRealNumber(23);
		c3.multiply(c1);
		c3.print();
 
	}

}
