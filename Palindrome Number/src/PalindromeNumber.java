
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		int len = 1, order = 1;
		for(int t = x; t > 10; len++) {
			t /= 10;
			order *= 10;
		}
		for(int i = 0; i < len/2; i++) {
			if((x/order) != (x%10)) {
				return false;
			}
			x = x%order;
			x /= 10;
			order /= 100;
		}
		return true;
	}
	public boolean isPalindrome2(int x) {
		if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    return (x==rev || x==rev/10);
	}
	public static void main(String[] argss) {
		System.out.println(new PalindromeNumber().isPalindrome2(12321));
	}
}
