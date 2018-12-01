public static char[]shift(char[]s)
      {
            char[]in2=new char[s.length];
            int shift=1;

      for(int i=0;i<shift; i++)
            in2[s.length-shift+i]=s[i];

      for(int i=0;i<s.length-1;i++){
          if(i+shift>s.length-1){
                break;
        }
          else
                in2[i]=s[i+shift];
        }
      return in2;
        }
}