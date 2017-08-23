package Maclab2;
import java.util.*;

public class NewSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr={3,8,5,1,9};
	int n = arr.length;  
    int temp = 0;  
     for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                      if(arr[j-1] > arr[j]){  
                               
                             temp = arr[j-1];  
                             arr[j-1] = arr[j];  
                             arr[j] = temp;  
		
     
	}
     }
             
     }

}
}
