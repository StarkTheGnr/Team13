
 class LargestPrime {
// this array is the OnlyPrime array 
    public int  getLargest(char arr[])
    {
        if (arr.length==0)
        {
            return -1 ;
        }
        int larest = arr[0] ;
        for (int i=0 ; i < arr.length ; ++i)
        {
            if (larest<arr[i])
            {
                larest = arr[i] ;
            }
        }
        return larest ;
    }
}
    