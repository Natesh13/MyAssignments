package week2.day2;

public class Arr_sort {

	public static void main(String[] args) {

		int arr []= {9,7,5,3,1};
		
		int l = arr.length;
		//arr[0]=9
		for (int i = 0; i < arr.length; i++)   
		{  
			//arr[9+1]=10
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp; 
		
     	} 
		
      } 
	
		System.out.println(arr[i]);
    }
		System.out.println(arr[arr.length-2]);
   }
 }