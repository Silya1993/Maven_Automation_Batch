package session_9thOctober2022;

public class In_Dec_combined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
//latest value of i is 1
		int j = ++i - --i;
		// i = 2    i=1
//j  =  1+1    -    1-2 = -1
		int k = j-- - --i + i-- - --j;
// j= -2   i=0  i=-1  j=-1
		// k= -1 - 0 + 0 - -3= 2 
		int l = --k - k-- + i-- - --i + j++ - --j;
//k=1 k=0  i= -2 i=-3  j=0 
		//l= 1 - 1 + -1 - -3 + -1 - -1 =1
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
