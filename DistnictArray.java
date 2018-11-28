import java.util.ArrayList;

public class DistnictArray {

	public ArrayList<String> DistnictArray(String[] a){
			ArrayList<String> Arr = new ArrayList<String>();
			for( int i = 0; i < a.length; i++){
		    	 if( !Arr.contains( a[i]))
		    	 {  Arr.add(a[i]);
		    	 }
			}
			 return Arr;
			 
		}
}
