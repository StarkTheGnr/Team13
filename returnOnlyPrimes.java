package returnOnlyPrimes;

public class returnOnlyPrimes{
    int i,m=0,n,flag,counter=0,c=0;

    public char[] ROP(char arr[]){
        for (int k=0;k<arr.length;k++){
            n = Character.getNumericValue(arr[k]);
            flag=0;
            m=n/2;
            if(n==0||n==1){
                continue;
            }else{
                for(i=2;i<=m;i++){
                    if(n%i==0){
                        flag=1;
                        continue;
                    }
                }
                if(flag==0)  {counter++; }
            }//end of else
        }
        char[]out = new char[counter];
        for (int k=0;k<arr.length;k++){
            flag=0;
            n = Character.getNumericValue(arr[k]);
            m=n/2;
            if(n==0||n==1){
                continue;
            }else{
                for(i=2;i<=m;i++){
                    if(n%i==0){
                        flag=1;
                        continue;
                    }
                }
                if(flag==0)  {out[c++]=arr[k];}
            }
        }

        return out;
    }
}
