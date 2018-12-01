/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positive;

import java.util.*;


/**
 *
 * @author الشرقاوى
 */
public class Positive 
{

       public static ArrayList<String> positiveArray(ArrayList<String> data1)
    {
        ArrayList<String> data2 = new ArrayList<String>();
        for (int i=0 ; i < data1.size() ; i++)
        {   
            Integer u=Integer.valueOf(data1.get(i)); 
            if( u < 0 )    	 
            {  
               data2.add("0");  	
            }
            else
            {
               data2.add(data1.get(i));
            }
        }
	       
	return data2 ;		
    }

}
