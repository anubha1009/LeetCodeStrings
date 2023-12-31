package Problem1;
/*Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

 

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 */
public class Solution {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		boolean answer;
		for(String s:word1) {
			str1.append(s);
		}
		for(String s: word2) {
			str2.append(s);
		}
		answer = str1.toString().equals(str2.toString())?true:false;
		return answer;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String[] word1 = {"abghbf", "c"};
		String[] word2 = {"a", "bc"}	;
		System.out.println(s.arrayStringsAreEqual(word1, word2));

	}

}
