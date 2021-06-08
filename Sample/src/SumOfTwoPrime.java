
public class SumOfTwoPrime {
	static boolean createPrime(int value) {
		boolean sum=true;
		for(int i=2;i<=value/2;i++) {
			if(value%i==0) {
			sum=false;
			break;
			}
		}
		return sum;
		
	}

	public static void main(String[] args) {
		int num=34;
		boolean prime=false;
		for(int i=2;i<=num/2;++i) {
			if(createPrime(i)) {
				if(createPrime(num-i)) {
					System.out.println(num +"  =  "+i +"  +  "+ (num-i));
					prime=true;
				}
			}
		}if(!prime) {
			System.out.println("prime not present");
		}

	}

}
