
public class VowelCharCount {

	public static void main(String[] args) {
		int character = 0, constant = 0, space = 0, num = 0;
		String data = "Hello  Weaiulcome Everyo24ne";
		String value = data.toLowerCase();
		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print("  "+ch);
				character++;
			} else if (ch >= 'a' && ch <= 'z') {
				//System.out.println("char values " + ch);
				constant++;
			} else if (ch <= '9' && ch >= '0') {
				num++;
			} else if (ch == ' ') {
				space++;
			}
		}
		System.out.println("\nvowels     "+character);
		System.out.println("constant    "+constant);
		System.out.println("space       "+space);
		System.out.println("num         "+num);
	}
}
