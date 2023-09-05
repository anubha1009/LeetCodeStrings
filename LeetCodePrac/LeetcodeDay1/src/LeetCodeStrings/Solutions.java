package LeetCodeStrings;

public class Solutions {
	//defanging the input string
	public String defangIPaddr(String address) {
	 String result = address.replace(".","[.]");
	 return result;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solutions s = new Solutions();
		System.out.println(s.defangIPaddr("1.1.1.1"));

	}

}
