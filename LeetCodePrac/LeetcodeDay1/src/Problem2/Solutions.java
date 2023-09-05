package Problem2;
import java.math.BigInteger;
public class Solutions {
	public int minPartitions(String n) {
		int a=0;
		int max=0;
	    for(int i =0;i<n.length();i++){
				a = n.charAt(i) -'0';
				max = Math.max(max, a);

			}
	    return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solutions s = new Solutions();
		System.out.println(s.minPartitions("56"));

	}

}
