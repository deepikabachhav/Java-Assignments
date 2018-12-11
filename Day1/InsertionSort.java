
class InsertionSort { 
	void sort(int arr[]){ 
        	int n = arr.length; 
        	for (int i=1; i<n; ++i){ 
            		int key = arr[i]; 
            		int j = i-1; 
  			while (j>=0 && arr[j] > key){ 
                		arr[j+1] = arr[j]; 
                		j = j-1; 
           		} 
            		arr[j+1] = key; 
      		} 
   	 } 
	static void printArray(int arr[]){ 
        	int n = arr.length; 
        	for (int i=0; i<n; ++i) 
            	System.out.print(arr[i] + " "); 
  		System.out.println(); 
    	} 
	public static void main(String args[]) {         
        	int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}; 
  		InsertionSort ob = new InsertionSort();         
        	ob.sort(arr); 
         	printArray(arr); 
    	} 
} 