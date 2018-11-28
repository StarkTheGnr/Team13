public static char most_repeated_value(char []array){
		  int counter = 1 , tempCount  ;
		  char Temp  , most_repeated = array[0];
		  
		  for (int i = 0 ; i < array.length - 1 ; i++) {
		    Temp = array[i];
		    tempCount = 0;
		    for (int j = 1 ; j < array.length; j++) {
		      if (Temp == array[j])
		        tempCount++;
		    }
		    	if (tempCount > counter){
		    		most_repeated = Temp;
		    		counter = tempCount;
		    	}
		  }
		  return most_repeated;
	}
	