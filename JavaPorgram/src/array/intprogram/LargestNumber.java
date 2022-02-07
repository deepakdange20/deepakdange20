package array.intprogram;

public class LargestNumber {

	public static void main(String[] args) {
		int [] arr = new int [] {25, 11, 7, 75, 78};  
        
        int max = arr[0];  //25 
       
        for (int i = 0; i < arr.length; i++) 
        {  
           if(arr[i] > max) 
           {                  //25>25 / 25>11/ 7>25 / 75>25 /78>75  
               max = arr[i];  //max=25 max=75 max=78
           } 
        }
        System.out.println("Largest element present in given array: " + max);  
    }  

	

}
