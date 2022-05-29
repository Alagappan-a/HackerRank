class GetTotalX {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
	int lenA=a.size();
	int lenB=b.size();

	int count=0;
	for(int j=a.get(lenA-1);j<=b.get(0);j++){
    		int countB=0;
		int countA=0;
    		for(int i=0;i<lenB;i++){
      		if(b.get(i)%j==0){
          			++countB;
          
          		if(countB==lenB){
          			for(int k=0;k<lenA;k++){
              			if(j%a.get(k)==0){
                  			++countA;
                  			System.out.println(j);
                  			if(countA==lenA){
                      			count++
                                 }
              			}
          			}
      		}
    			}
    		}
    	}
    
    return count;
    }
}
