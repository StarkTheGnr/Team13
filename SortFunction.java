package sort.function;
public class SortFunction 
{
    public static int[] Sort ( int[] x,int s)
    {        
        for(int i =1; i < s;i++)
        {
            for(int k = i ; k > 0 && x[k-1] > x[k];k--)
            {    int temp = x[k] ;
                 x[k] = x[k-1];
                 x[k-1] = temp;
            }
        }
        return x;
    }
    public static void main(String[] args) 
    { 
    }
}