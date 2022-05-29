class UtopianTree {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
    // Write your code here
    	int sum=0;
	for(int i=0;i<=n;i++){
    		if(i%2==0){
        		sum=sum+1;
    		}
    		else{
        		sum=sum*2;
    		}
	}
	return sum;
    }

}
