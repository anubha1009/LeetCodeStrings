package Problem8;

public class Solution {
	public String restoreString(String s, int[] indices) {
		StringBuilder result = new StringBuilder();
       for(int i =0 ; i<s.length() ; i++) {
    	   for(int j = 0;j<indices.length ; j++) {
    		   if(indices[j] == i) {
    			   result.append(s.charAt(j));
    		   }
    	   }
       }
       return result.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] arr = {4,5,6,7,0,2,1,3};
		System.out.println(s.restoreString("codeleet",arr));

	}

}
