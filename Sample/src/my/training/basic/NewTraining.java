package my.training.basic;

public class NewTraining {
//static int value=1		;
	public static void main(String args[]) {
		/*
		 * do { System.out.println(value); value++; }while(value<=50);
		 */
		/*
		 * for(int value=1;value<=9;value++) { System.out.println(value*value*value);}
		 */

		/*
		 * for(int value=2;value<=10;value++) { System.out.println(value);
		 * value++;//value++;
		 */
//int num=1;
		// int total=0;
		/*
		 * while( num<=5) { total=total+num; num++;System.out.println(total);
		 * }System.out.println("total is =" +total);
		 */
		/*
		 * while(num<=20) { if((num%3==0)|| (num%5==0)) { System.out.println(num); }
		 * num++;
		 */

		/*
		 * while(num<=5) { System.out.println(num*(num+1)); num++; }
		 */
		/*
		 * int i=0; int j=1;
		 */
		/*
		 * while(i<=j) { System.out.println(i*j); i++; j--; }
		 */
		/*
		 * while(i<=5) { j=j+i; System.out.println(j); i++; //j++; }
		 */
		/*
		 * int [] arr= {10,20,30,40,50}; for(i=0;i<arr.length-1+1;i++) {
		 * System.out.println("array inputs are"+arr[i]); }
		 */
//long num=343456545;
		/*
		 * while(num>0){ int rem=num%10; //System.out.println("reminder is  "+rem);
		 * System.out.print(rem); num=num/10; //System.out.println("number is   "+ num);
		 * }
		 */
		/*
		 * int count=0; while(num>0) {
		 * 
		 * num=num/10; count++;
		 * 
		 * }System.out.println("total count is"+count);
		 * 
		 * }
		 */
		/*
		 * int first=0,second=1,third=0; for(int i=0;i<13;i++) { if(i==5) {
		 * 
		 * System.out.println("continue"); break; }
		 * System.out.println("fibonacci value is"+first); third=first+second;
		 * first=second; second=third; //System.out.println(first); }
		 */
		/*
		 * int num1=4,num2=23,max; max=num1>num2?num1:num2;
		 * 
		 * for(int i=0;i<max;max++) { if((max%num1==0)&&(max%num2==0)) { int lcm=max;
		 * System.out.println("lcm value is  ="+lcm); break; }
		 * 
		 * 
		 * }
		 */
		/*
		 * int num1=12,num2=30,min; min=num1<num2?num1:num2; while(min>2) {
		 * if((num1%min==0)&&(num2%min==0)) { int gcd=min;
		 * System.out.println("gcd value is  "+gcd); break; }min--;
		 */
		/*
		 * int n=81,i; for(i=8;i<=n;i++) { if(n/i==i) {
		 * System.out.println("square root is ...." +i); break; } }
		 */
		/*
		 * int a=5; int fact=a; while(a>1) { a--; fact=fact*a;
		 * 
		 * System.out.println("factorial num is" +fact); }
		 */
		/*
		 * int num=1214,rem=0,i; i=num; while(num>0) { rem=(rem*10)+num%10;
		 * 
		 * num=num/10; }System.out.println(rem); if(i==rem) {
		 * System.out.println("palindrome"); } else {
		 * System.out.println("not palindrome");
		 */
		/*
		 * int num=1; while(num<8) { System.out.println(Math.pow(num, num)); num++;
		 * 
		 * }
		 */
		/*
		 * System.out.println(2); int count = 0;int num = 3; while (count < 20) { int i
		 * = 2;boolean prime = true;
		 * 
		 * while (i<num) { if (num % i == 0) { System.out.println(num + "  not prime");
		 * prime = false; } i++; } if (prime == true) { System.out.println(num +
		 * "   is a prime"); count++; } num = num + 2; }
		 */
		/*
		 * int dec=46; String binary=""; while(dec>0) { int rem=dec%2;
		 * //System.out.println(rem); binary=rem+binary; dec=dec/2;
		 * }System.out.println(binary); }
		 */
		/*
		 * int binary=1110; double dec=0;int i=0; while(binary>0) { int rem=binary%10;
		 * dec=dec+(rem*Math.pow(2, i)); binary=binary/10; i++;
		 * }System.out.println(binary); System.out.println(dec); }
		 */
		/*
		 * int num=43786; int total=num; while (total>9) { num=total; total=0;
		 * while(num>0) { int rem=num%10; total=rem+total;
		 * num=num/10;//System.out.print( "total is " +total); }}
		 * System.out.println(total); }
		 */
		/*
		 * int num=153; int no=num; int arm=0; for(num=153;num>0;num=num/10) { int
		 * rem=num%10; arm=arm+(rem*rem*rem);
		 * 
		 * System.out.println(arm); }if(arm==no) {
		 * System.out.println("it is a armstrong");
		 * 
		 * }else { System.out.println("not a amstrong"); }
		 */
		/*
		 * int num=541; int fact=1;int no=1,rem=num,sum=0;
		 * 
		 * 
		 * 
		 * while(num>0) { while(rem>0) { rem=num%10; fact=fact*rem; num=num/10;
		 * //fact=fact1*no; }} System.out.println(fact); sum=sum+fact;
		 * num=num/10;System.out.println(sum);
		 */

		/*
		 * int num=546; int sum=0;int rem=1; while(num>0) {int fact=1; rem=num%10;
		 * 
		 * while(rem>1) { fact=fact*rem; rem--;
		 * 
		 * }//System.out.print(fact + "  +  "); sum=sum+fact; num=num/10; }
		 * 
		 * System.out.println(sum);
		 */

		/*
		 * int no=9,sum=0; int sq,dig; sq=no*no; while(sq>0) { dig=sq%10; sum=sum+dig;
		 * sq=sq/10; }System.out.println(sum); if(sum==no) {
		 * System.out.println("it is a neon number"); }else {
		 * System.out.println("it was not a neon number"); }
		 */

		/*
		 * int newarr[]=new int[(arr.length/2)]; int i=0; for(int j=1;j<arr.length;j+=2)
		 * { newarr[i]=arr[j]; i++; }for(Integer o:newarr) { System.out.println(o); }
		 */

		/*
		 * int bigger=Integer.MAX_VALUE; int i=0; int e[]=new int[1];
		 * while(i<arr.length) { if(arr[i]<bigger) { bigger=arr[i]; e[0]=bigger; }i++;
		 * }System.out.println(bigger); System.out.println( e[0]);
		 */
		/*
		 * int arr[]= {132,20,30,70,50,60,3,4,5,7 }; int i=1; int total=0;
		 * while(i<arr.length) { total=total+arr[i]; i+=2; } System.out.println(total);
		 */
		int[] a = { 10, 20, 30, 10, 20, 30, 40, 50, 10 };
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (num == a[j]) {
					count++;
					b[j] = -1;
				}
			}
			if (b[i] != -1) {
				b[i] = count;
			}
		}

		int[] c = new int[b.length];
		int i = 0;
		for (int k = 0; k < b.length; k++) {
			if (b[k] > 1) {
				c[k] = b[k];

				// System.out.println(" " +c[i]);
				System.out.println(a[k] + "appears " + b[k]);
				System.out.println("values ina array  " + c[i]);
			}
			i++;
		}

	}
}
