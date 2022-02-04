package StringProgram;

public class ArrayMarged {

	 public static void main (String[] args) {
		 int a[]= {1,3,5,7,9};
	      int n1 = a.length;
	      
	      int b[] = {2,4,6,8};
	      int n2 = b.length;
	      
	      int[] c = new int[n1 + n2];
	      int i = 0, j = 0, k = 0, x;
	      
	      while (i < n1 && j < n2) {
	         if (a[i] < b[j])
	            c[k++] = a[i++]; //
	         else
	            c[k++] = b[j++];
	      }
	      
	      while (i < n1)
	    	  c[k++] = a[i++];
	      
	      while (j < n2)
	    	  c[k++] = b[j++];
	      
	      System.out.print("\nArray after merging: ");
	      
	      for (x = 0; x < n1 + n2; x++)
	      System.out.print(c[x] + " ");
	   }
}