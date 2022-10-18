package session_9thOctober2022;

public class IncrementOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;//latest value of i is 1
		int j = i++;// j got some value from i, now j is 1 and i is 2
		int k = j++;//k got some value from j ,now k is 1  and j is 2
		int l = k++;//l got some value from k , now l=1 and k = 2
		
	    System.out.println(i);//2
		System.out.println(j);//2
		System.out.println(k);//2
		System.out.println(l);//1
	
		
		
		int m = 1;//latest value of m is 1
		int n = ++m;//n = 2 , m = 2
		int o = ++n;//o = 3 , n = 3
		int p = ++o;//p = 4 , o = 4
		System.out.println(m);//2
		System.out.println(n);//3
		System.out.println(o);//4
		System.out.println(p);//4
	}

}
