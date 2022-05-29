public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int energy=100;
	for(int i=0;i<c.length;i=i+k){
    		if(c[i]==1){
        		energy-=2;
            		energy-=1; 
    		}
    		else{
        		energy-=1;
    		}
    		if(c.length-i<k){
       	 		i=c.length-i;
    		}
	}
	return energy;

    }
