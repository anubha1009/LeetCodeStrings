package Problem7;

public class Solution {
	public int balancedStringSplit(String s) {
/*		char[] charArr = s.toCharArray();
		int count =0;
		for(int i = 0 ; i <charArr.length ; i++) {
			if(charArr[i] =='R' && charArr[i+1] =='L') {
				count=count+1;
			}
		
		}
		return count;*/
		int cR =0;
		int cL =0;
		int count =0;
		char[] charArr = s.toCharArray();
		for(char c: charArr) {
			if(c =='R') {
				cR = cR+1;
			}
			else if(c == 'L') {
				cL = cL+1;
			}
			if(cR == cL) {
				count = count+1;
				cR=0;
				cL=0;
			}
		}
		
		
		return count;
     
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.balancedStringSplit("LLLLRRRR"));

	}

}
