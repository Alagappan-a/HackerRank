class Kangaroo {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
	int firstKangaroo =x1+v1,secondKangaroo =x2+v2,count=0;
	String yes = "YES";
	String no="NO";
    	for(int i=1;i<(firstKangaroo*secondKangaroo);i++){
        if((x1+(v1*i))==(x2+(v2*i))){
           count++;
           break;
        }
        
    	}
    	if(count>0){
        return yes;
    	}
    	else
    		return no;
    }

}