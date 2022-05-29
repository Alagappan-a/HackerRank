public class CatAndMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
         String result="";
         int catA=z-x,catB=z-y;
         if(catA<0){
             catA=catA*-1;
         }
         if(catB<0){
             catB=catB*-1;
         }
		if(catA==catB){
   			return result="Mouse C";
		}
		else if(catA<catB){
    			return result="Cat A";
		}
		else{
    	 		return result="Cat B";
		}

    }
