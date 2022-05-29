class MigratoryBirds {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
   	int max=0,index=0;
    	int[] numberOfOccurance = new int[5];
	for (Integer integer : arr) {
    		if(integer==1){
        		numberOfOccurance[0]++;
    		}
     		if(integer==2){
        		numberOfOccurance[1]++;
    		}
     		if(integer==3){
        		numberOfOccurance[2]++;
    		}
     		if(integer==4){
         		numberOfOccurance[3]++;
    		}
     		if(integer==5){
         		numberOfOccurance[4]++;
    		}
	}
	for(int i=0;i<5;i++){
    		if(numberOfOccurance[i]>max){
        		max=numberOfOccurance[i];
        		index=i+1;
    		}
	}
	return index;
    }

}
