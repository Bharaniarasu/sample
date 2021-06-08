package in.org.bharani.sample;

public class GetSetEx {
	public static void main(String args[]) {
		GetterSetter gs = new GetterSetter();
		gs.SetA(234);
		gs.GetA();
		System.out.println(gs.a);
	}
}
