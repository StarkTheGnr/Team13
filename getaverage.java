
public class getaverage {
	public static void main (double []arr){
	double total=0 ;
	double average=0;
	for (int i = 0 ; i < arr.length - 1 ; i++) {
		total += arr[i];
	}
	average=total/arr.length;
	System.out.println(average);
	
	}
}
