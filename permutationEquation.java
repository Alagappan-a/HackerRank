class PermutationEquation {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
    	List<Integer> result=new ArrayList<>();
    	for(int k=1;k<=p.size();k++){
		for(int i=1;i<=p.size();i++){
    			if(p.get(i-1)==(k)){
        			for(int j=1;j<=p.size();j++){
            				if(i==p.get(j-1)){
             					result.add(j) ;  
             
            				}
           			}			
        		}
    		}
    
	}
	return result;
    }

}
