package Problem9;

import java.util.List;

public class Solution {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		int rule = 0;
		switch(ruleKey) {
		case "type":
			rule=0;
			break;
		case "color":
			rule=1;
			break;
		case "name":
			rule=2;
			break;
		
		}
		for(List<String> item : items) {
			if(item.get(rule).equals(ruleValue)) {
					count = count+1;			
			}
		}
		return count; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
