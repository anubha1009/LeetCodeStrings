package Problem5;
/*You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.

 

Example 1:

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
Example 2:

Input: command = "G()()()()(al)"
Output: "Gooooal"
Example 3:

Input: command = "(al)G(al)()()G"
Output: "alGalooG"*/

public class Solution {
	 public String interpret(String command) {
	        StringBuilder result = new StringBuilder();
	        char[] arr = command.toCharArray();
	       for(int i =0 ; i<=arr.length-1;i++) {
	    	   if(arr[i]=='G') {
		        	result.append("G");
		        }
	    	   if(arr[i]=='(' && arr[i+1]==')' ) {
	    		   result.append("o");
	    	   }
	    	   if(arr[i]=='(' && arr[i+1]=='a' && arr[i+2]=='l' && arr[i+3]==')') {
	    		   result.append("al");
	    	   }
	       }
	        
	        return result.toString();
	    }

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.interpret("(al)G(al)()()G"));
		// TODO Auto-generated method stub

	}

}
