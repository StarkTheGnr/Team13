 public static char[] shift(char[] s)                                                                   
 {                                                                                                      
     Scanner read = new Scanner(System.in);                                                             
                                                                                                        
     char[] in1 = s;                                                                                    
     char[] in2 = new char[s.length];                                                                   
                                                                                                        
     System.out.println("Enter Shift \nPositive number Shift to Right \nNegative number Shift to Left");
     int shift = 0;                                                                                     
                                                                                                        
     shift = read.nextInt();                                                                            
                                                                                                        
     if (shift >= 0) {                                                                                  
         for (int i = 0; i < shift; i++)                                                                
             in2[i] = in1[in1.length - shift + i];                                                      
                                                                                                        
         for (int i = 0; i < in1.length - shift; i++) {                                                 
             if (i + shift > in1.length - 1) {                                                          
                 break;                                                                                 
             } else                                                                                     
                 in2[i + shift] = in1[i];                                                               
         }                                                                                              
                                                                                                        
     }                                                                                                  
                                                                                                        
     else if (shift < 0) {                                                                              
         shift *= -1 ;                                                                                  
         for (int i = 0 ; i < shift ; i++)                                                              
             in2[in1.length - shift + i] = in1[i];                                                      
                                                                                                        
         for (int i = 0 ; i < in1.length - 1 ; i++) {                                                   
             if (i + shift > in1.length - 1) {                                                          
                 break;                                                                                 
             } else                                                                                     
                 in2[i] = in1[i+shift];                                                                 
         }                                                                                              
     }                                                                                                  
                                                                                                        
                                                                                                        
                                                                                                        
 return in2;                                                                                            
 }                                                                                                      