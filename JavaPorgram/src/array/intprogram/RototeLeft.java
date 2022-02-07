package array.intprogram;

public class RototeLeft {

	public static void main(String[] args) {
		int arr[] = new int[]{10,20,30,40,50};
	//	int left=a[0];
		int n=5;
		int j, first;
		for(int i = 0; i < n; i++){  
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){  
              
                arr[j] = arr[j+1];  
            }  
            arr[j] = first;  
        }  
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println(arr[i]);
		}

	}

}
