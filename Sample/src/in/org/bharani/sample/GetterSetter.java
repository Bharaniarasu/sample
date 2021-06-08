package in.org.bharani.sample;

public class GetterSetter {
	public static void main(String args[]) {
		GetterSetter gs1 = new GetterSetter();
		gs1.SetA(10);
		gs1.GetA();
	}
	public int a, b = 4;

	int c = 4;

	public int GetA() {
		System.out.println(a);

		return this.a;

	}

	public void SetA(int h) {
		this.a = h;
	}

}
