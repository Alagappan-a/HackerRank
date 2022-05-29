class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
     	List<Integer> result = new ArrayList<>();
	for (int i=0;i<grades.size();i++) {
    		int roundOff = grades.get(i)/5;
    		if(grades.get(i)>37){
        		if((((roundOff+1)*5)-grades.get(i))<3){
            		roundOff=((roundOff+1)*5);
            		result.add(roundOff);
        		}
        		else{
         			result.add(grades.get(i));
    			}
    		}
    		else{
         		result.add(grades.get(i));
    		}

	}
return result;
    }
}