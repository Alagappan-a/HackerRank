class BreakingRecords {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
	int highest, lowest,maxCount=0,minCount=0;
   	highest = lowest = scores.get(0);
    
  	List <Integer> result = new ArrayList<>();
    
    	for (int i = 1; i < scores.size(); i++)
    	{
        if (scores.get(i) > highest)
        {
            highest = scores.get(i);
            maxCount++;
            
        }
        else if (scores.get(i) < lowest)
        {
            lowest = scores.get(i);
            minCount++;
            
        }
    }
    result.add(0,maxCount );
    result.add(1,minCount );
    return result;
    
    }

}
