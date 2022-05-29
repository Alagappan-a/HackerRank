class CountApplesAndOranges{

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
   	int m = apples.size();
    	int n = oranges.size();
   	int applesCount=0,orangeCount=0;
    	for (int i=0;i<m;i++) {
        int temp = apples.get(i)+a; 
        if(temp>= s && temp<=t){
            applesCount++;
        }
    	}
    	for(int i=0;i<n;i++){
        int temp = oranges.get(i)+b;
        if(temp>= s && temp<=t){
            orangeCount++;
        }
    	}
    	System.out.println(applesCount);
    	System.out.println(orangeCount);

    }

}