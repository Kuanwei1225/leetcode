
public class Solution {

	public boolean isValid(String s) {
		int len = s.length();
		boolean a, b, c;
		a = b = c = true;
		for(int i = 0; i < len; i++) {
			switch (s.charAt(i)) 
			{
				case '[' :
					a = !a;
					break;
				case '{' :
					b = !b;
					break;
				case '(' :
					c = !c;
					break;	
				case ']' :
					a = !a & b & c;
					break;
				case '}' :
					b = !b & a & c;
					break;
				case ')' :
					c = !c & a & b;
					break;			
			}
		}
		return a & b & c;
	}
	public static void main(String[] args) {
		String myStr = "()[()]";
		System.out.println(myStr);
		System.out.println(new Solution().isValid(myStr));		
	}
}
