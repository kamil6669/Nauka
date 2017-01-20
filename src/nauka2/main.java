package nauka2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
/*
    	String a[] = new String[]{ "arp", "live", "strong" };
    	String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
    String c[] = inArray(a,b);
    for (int i =0;i<c.length;i++)
	  {
    	System.out.println(c[i]);
	  }
*/
    	String[] strarr = new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
	  String g = null;
	  System.out.println(longestConsec(strarr,2));
	  }
    

public static String[] inArray(String[] array1, String[] array2) {
	int x;
	  String odp[] =new String[array1.length];
	  for (int i =0;i<array1.length;i++)
	  {
	  for(int j=0;j<array2.length;j++)
	  {
	  if( array2[j].contains(array1[i]))
	  {
		

	  odp[i]=array1[i];
	//  System.out.println(odp[i]);
		  
	  }
	  }
	  }
			 return odp;
		}

public static String longestConsec(String[] strarr, int k) {
	String odp = "";
String temp =null;

String[] strarr2 = new String[strarr.length];
for (int i=0;i<strarr2.length;i++){
	strarr2[i]="";
}

int x=0;
for (int i=0;i<strarr.length;i++){
	for (int j=0;j<strarr.length;j++)
	{
		if(strarr2[j].equals(strarr[i])){
			x++;
		
		}	
	}

	if(x==0){
		strarr2[i] = strarr[i];	
	}
	
	x=0;
}
int zmiana = 1;
while(zmiana > 0){
zmiana = 0;
	for(int i=0; i<strarr2.length-1; i++){
		if((strarr2[i].length())<(strarr2[i+1].length())){
		temp = strarr2[i];
		strarr2[i] = strarr2[i+1];
		strarr2[i+1] = temp;
		zmiana++;
		}		 
}
}

System.out.println("");
for(int i=0; i<strarr2.length; i++){
System.out.println(strarr2[i]);
}

for (int d =0; d<k;d++){
	odp+=strarr2[d];
}
    return odp;
}
}