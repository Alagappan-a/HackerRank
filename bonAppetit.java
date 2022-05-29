class BonAppetit {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
      int anna=0,money=0;
	for(int i=0;i<bill.size();i++){
    		if(k==i){
        		continue;
    		}
   		 anna+=bill.get(i);
	}
	money=anna/2;
	if(money==b){
    		System.out.println("Bon Appetit");
	}
	else{
    		System.out.println(b-money);
		}
   }

}
