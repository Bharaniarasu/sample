
public class AddTwoComplex {
	double real;
	double image;

	public AddTwoComplex(double n1, double n2) {
		this.real = n1;
		this.image = n2;
	}

	public static void main(String[] args) {
		AddTwoComplex m1 = new AddTwoComplex(2.4, 5.3);
		AddTwoComplex m2 = new AddTwoComplex(3.4, 4.6);
		AddTwoComplex temp;
		temp = add(m1, m2);
		System.out.println("Real =" + temp.real + "\nimage =" + temp.image);
	}

	private static AddTwoComplex add(AddTwoComplex m1, AddTwoComplex m2) {
		AddTwoComplex temp = new AddTwoComplex(0.0, 0.0);
		temp.real = m1.real + m2.real;
		temp.image = m1.image + m2.image;
		return temp;
	}

}
