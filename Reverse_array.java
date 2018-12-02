
package reverse_array;

public static void reverse_arr(){
        
        Scanner in=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int n=in.nextInt();
		
		int arr[]=new int[n];
		System.out.println("enter an array");
		
		for(int i=0; i<n ;i++){
			arr[i]= in.nextInt();
	    }
	
		int temp;
		int start=0;
		int end=n-1;
		
		while (start<end) {
			
			temp= arr[start];
			arr[start]=arr[end];
			arr[end]=temp ;
			
			start++;
			end--;
		}
	
		for(int j=0;j<n;j++){
			System.out.print(arr[j]+" ");
		}
        
        
        }
