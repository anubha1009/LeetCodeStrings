package Problem3;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

/*You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.

 

Example 1:


Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
Output: "this is a secret"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
Example 2:


Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
Output: "the five boxing wizards jump quickly"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "eljuxhpwnyrdgtqkviszcfmabo".
 */
public class Solution {
	public String decodeMessage(String key, String message) {
        String[] strArr = key.split(" ");
        StringBuilder noSpaceKey = new StringBuilder();
        for(String str:strArr) {
        	noSpaceKey.append(str);
        }
        StringBuilder noRepeatKey = new StringBuilder();
        for(char c :noSpaceKey.toString().toCharArray()) {
        	if(noRepeatKey.toString().indexOf(c) ==-1) {
        		noRepeatKey.append(c);
        	}else {
        		noRepeatKey.append("");
        	}
        }
        String noRepeatKeyString = noRepeatKey.toString();
       Map<Character , Character> keyValuePair = new HashMap<>();
        char currentChar = 'a';
        for(char c : noRepeatKeyString.toCharArray()) {
        	keyValuePair.put(c,currentChar);
        	currentChar++;
        }
        StringBuilder resultMessageString = new StringBuilder();
        for(char ch: message.toCharArray()) {
        	if(keyValuePair.containsKey(ch)) {
        		resultMessageString.append(keyValuePair.get(ch));
        	}
        	if(ch == ' ') {
        		resultMessageString.append(" ");
        	}
        }
       return resultMessageString.toString();
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));

	}

}
