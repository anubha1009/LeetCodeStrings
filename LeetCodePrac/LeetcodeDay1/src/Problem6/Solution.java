package Problem6;
/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

 

Example 1:

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
Example 2:

Input: sentences = ["please wait", "continue to fight", "continue to win"]
Output: 3
Explanation: It is possible that multiple sentences contain the same number of words. 
In this example, the second and third sentences (underlined) have the same number of words.
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int mostWordsFound(String[] sentences) {
		int count = 0;
		int max = 0;

		List<Integer> result =new ArrayList<>();
		for(String sentence: sentences) {
		
			String[] word = sentence.split(" ");
			count = word.length;
		
			result.add(count);	
		
		}
		for(int i = 0;i<result.size();i++) {
			System.out.println(result);
			if(max < result.get(i)) {
				max = result.get(i);
			}

		}
		return max;
        
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		String[] str = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
		System.out.println(s.mostWordsFound(str));
		
		// TODO Auto-generated method stub

	}

}
