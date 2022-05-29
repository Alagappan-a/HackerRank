class Birthday {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
	int sum = 0,ways=0;
     	for (int i=0;i<m;i++){
      	sum += s.get(i);
        }
     	for (int i=0;i<s.size()-m+1;i++) {
     		if (sum==d) {
                ways++;
                }
           if (i+m <s.size()){
                sum =sum-s.get(i)+s.get(i+m);
                }
        }
     return ways;
 }

}
