class FindDigits {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
    // Write your code here
    	int count=0;
    	int temp=n;
    	while(temp>0){
        	int temp1=temp%10;
        	if(temp1!=0){
        		if(n%temp1==0){
            			count++;
        		}   
    		}
    		temp/=10;
    	}
	return count;
    }

}