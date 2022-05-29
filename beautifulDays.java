class BeautifulDays {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
    	int beautifulDays=0;
    	for(int start=i;start<=j;start++){
        	int temp=start;
        	int reverse = 0;
        	while(temp>0){
            		reverse*=10;
            		reverse+=(temp%10);
                        temp=temp/10;
        	}
        	if((Math.abs(start-reverse)%k)==0){
            		beautifulDays++;
        	}
    	}
	return beautifulDays;
    }

}