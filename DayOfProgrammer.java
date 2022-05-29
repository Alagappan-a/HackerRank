class DayOfProgrammer {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
    String date ="";
    	if(year==1918){
        date = "26.09."+year;
    	}
	else if (year>1918){
    	if(year%4==0){
        if(year%100==0){
            if(year%400==0){
               date="12.09."+year ; 
            }
            else{
           date="13.09."+year ; }
        }
        else{
        date="12.09."+year ;}
    	}
    
    	else{
        date="13.09."+year ;
    	}
	}
	if(year<1918){
    		if(year%4==0){
         		date="12.09."+year ; 
            }
           else{
               date="13.09."+year ;  
            }
	}
return date;
    }

}
