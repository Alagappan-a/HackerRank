class PickingNumbers {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
   	int count=1;
    	Collections.sort(a);
    	int i=0;
    	int max=0;
    	int[] arr=new int[a.size()];
    	for(i=0;i<a.size();i++)
    	{
       for(int j=i+1;j<a.size();j++)
       {
           int store=Math.abs(a.get(i)-a.get(j));
           if(store<=1)
           {
               count++;
           }
       }
       arr[i]=count;
       count=0;
    	}
   	Arrays.sort(arr);
    
    	return (arr[arr.length-1]);
    }   
  }
