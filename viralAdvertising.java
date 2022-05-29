class ViralAdvertising {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
    // Write your code here
    	int cumulative=0;
    	int liked=0;
    	int shared=5;
	for(int i=1;i<=n;i++){
    		liked=shared/2;
    		cumulative+=liked;
    		shared=liked*3;  
    	}
  	return cumulative; 
       }
    }