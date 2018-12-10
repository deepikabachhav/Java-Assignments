class RemoveDuplicate{
	static int removeDuplicate(int array[], int n){
		if(n==0 || n==1 )
		return n;
		int [] arr= new int[n];
		int j=0;
		for(int i=0; i<n-1; i++){
			if(array[i]!= array[i+1])
			arr[j++]=array[i];
			arr[j++]=array[n-1];
			for( i=0; i<j; i++){
				array[i]=arr[i];
				return j;
			}
		}

	}	
	public static void main(String[] args){
		int array[]={4,5,2,1,4,5,2,6,9,87,5,3,5,4,9,42,15,5};
		int n=array.length;
		n= removeDuplicate(array,n);
		for(int i=0;i<n;i++){
		System.out.println(array[i]+ " ");
		}
	}
}