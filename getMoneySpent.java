public class GetMoneySpent{

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
         	int temp=0,result=-1;
		for(int i=0;i<keyboards.length;i++){
    			for(int j=0;j<drives.length;j++){
       			if(keyboards[i]+drives[j]>b) {
           			continue;
       			}
       			temp=keyboards[i]+drives[j];
       			if(result<temp){
           			result=temp;
       			}
      
    			}
		}
	return result;
    }
