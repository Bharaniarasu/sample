/**
 * 
 */

/**
 * @author BharAni
 *
 */
public class SortingName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name[] = { "john", "natasha", "buckey", "thor", "walkwer", "sam", "tony", "steve", "bruce banner" };
		int i = 0;
		String temp = "";
		while (i < name.length) {
			int j = i + 1;
			while (j < name.length) {
				if (name[i].compareTo(name[j]) > 0) {
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
					System.out.println(name[i].compareTo(name[j]));
				}
				j++;
			}
			i++;
		}
		for (int l = 0; l < name.length; l++) {
			System.out.println(name[l]);
		}
	}

}
