package maxthreenumber;
import java.util.*;
public class MaxThreeNumber {
static void Max_three_number(char[] Array)
    {   
        int len =Array.length;
        char[] B = new char[len];
        for(int i=0;i<len;i++)
        {
            B[i]=Array[i];
        }
        Arrays.sort(B);
        int x;
        if(len==0||len==1)
        {
            x=1;
        }
        else
        {
            int k = 0;
        for (int i=0; i < len-1; i++){  
            if (B[i] != B[i+1]){  
                B[k++] = B[i];  
            }  
        }  
        B[k++] = B[len-1];  
        x=k;
        }
        char[] C = new char[x];
        for(int i=0;i<x;i++)
        {
            C[i]=B[i];
        }
        System.out.println(C[C.length-1]+"\n"+C[C.length-2]+"\n"+C[C.length-3]);
    }
    
}
