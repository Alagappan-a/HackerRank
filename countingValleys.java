class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
    	int count=0,valley=0;
    
	char [] paths=path.toCharArray();
	for(int i=0;i<steps;i++){
    		if(paths[i]=='U'){
        		count++;
    		}
    		else if(paths[i]=='D'){
        		count--;
        
    		}
    		if(count==0 && paths[i]=='U'){
            	valley++;
    		} 
	}
	return valley;
    }

}
