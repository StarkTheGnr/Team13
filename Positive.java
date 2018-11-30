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

    public ArrayList<String> positiveArray(ArrayList<String> data)
    {
        for (int i=0 ; i < data.size() ; i++)
        {   
            Integer u=Integer.valueOf(data.get(i)); 
            if( u < 0 )    	 
            {  
               data.set(i , "0");  	
            }
			
        }
	    return data ;
			 
    }
    
}
