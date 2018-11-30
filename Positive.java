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

     public char[] positive_array(char[] data) 
     {
        for (int i=0 ; i<data.length ; i++)
        {
           Integer u=Integer.valueOf(data[i]);
        
           if (u<0)
           {
               data[i]='0';
           }
        }
            return data ;
      }
   
    
}
