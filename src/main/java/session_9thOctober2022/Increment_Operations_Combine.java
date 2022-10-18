package session_9thOctober2022;

public class Increment_Operations_Combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;//latest value of i = 1
		
		//i=2        i=3
		int j = i++  + ++i;
		    //j= 1   + 3 = 4
		int k = ++j  + j++;
		//j=5     j=6
		   //k= 5  + 5=10
		int l = k++  + ++k  + k++  + i++;
		//k=11  k=12   k=13  i=4
		//l = 10  + 12  + 12  + 3 =37
		System.out.println(i);//4
		System.out.println(j);//6
		System.out.println(k);//13
		System.out.println(l);//37
		
	}

}
