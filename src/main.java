import java.util.ArrayList;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
/*
	int liczba1 = 10;
	int liczba2 = liczba1 < 11 ? 1:-1;
	System.out.println(liczba2);
	
	  ArrayList<String> arrlistobj = new ArrayList<String>();
      arrlistobj.add("Alive is awesome");
      arrlistobj.add("Love yourself");
      Iterator it = arrlistobj.iterator();
      System.out.print("ArrayList object output :");  
      while(it.hasNext())         
        System.out.print(it.next() + " ");
		*/
		
	int[] aw = new int[] {1,2,3};
	int d=  4;
	int w=  2;

	System.out.println(sum2(w,d));
	}

	  public static long sum(int[] args) {
		    long sum = 0;
		    for (int n : args) {
		      sum += n;
		    }
		    return sum;
		  }
	  public static long sum2(int ... args) {
		    long sum = 0;
		    for (int n : args) {
		      sum += n;
		    }
		    return sum;
		  }

}

