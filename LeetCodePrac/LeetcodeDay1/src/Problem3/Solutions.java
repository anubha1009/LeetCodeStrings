package Problem3;

public class Solutions {
	public int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for(String operation : operations) {
			if(operation.equals("X++") || operation.equals("++X")) {
				x= x+1;
			}else {
				x= x-1;
			}
		}
		return x;
        
    }

	public static void main(String[] args) {
		Solutions s = new Solutions();
		String[] str = {"--X","X++","X++"};
		System.out.println(s.finalValueAfterOperations(str));
		// TODO Auto-generated method stub

	}

}
