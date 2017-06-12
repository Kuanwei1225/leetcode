import java.util.StringTokenizer;

public class Solution {

	public boolean wordPattern(String pattern, String str) {
		StringTokenizer st = new StringTokenizer(str);
		String[] list = new String[pattern.length()]; 
		
		for(int i = 0; st.hasMoreTokens(); i++) {
			String c = pattern.substring(i, i+1);
			String tok = st.nextToken();
			int in  = pattern.indexOf(c);
			if(in == i) {
				for(int j = 0; j < in; j++) {
					if(list[j].compareTo(tok) == 0)
						return false;
				}
				list[in] = tok;
			} else {
				if(list[in].compareTo(tok) != 0)
					return false;
			}
		}
        return true;
    }
	public static void main(String[] args) {
		String pattern = "abbb";
		String str = "dog cat cat dog";
		System.out.println(pattern);
		System.out.println(str);
		System.out.println(new Solution().wordPattern(pattern, str));
	}
}
