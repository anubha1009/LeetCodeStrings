package Problem4;

public class Solutions {
	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
//        for(char jewel: jewels.toCharArray()) {
//        	for(char stone: stones.toCharArray()) {
//        		if(jewel ==stone) {
//        			count = count+1;
//        		}
//        	}
//        }
//        return count;
		for(char stone: stones.toCharArray()) {
			if(jewels.indexOf(stone) !=-1) {
				count = count+1;
			}
		}
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solutions s =  new Solutions();
		System.out.println(s.numJewelsInStones("aA", "aAAbbbb"));

	}

}
