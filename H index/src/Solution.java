import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public int hIndex(int[] citation) {
		Arrays.sort(citation);
		for(int i = citation.length - 1; i >= 0; i--) {
			if(citation[i] <= (citation.length - i)) {
				if(citation[i + 1] > (citation.length - i - 1))
					return (citation.length - i - 1);
				else
					return citation[i - 1];
			}
		}
		return 0;
	}
	 public int hIndex2(int[] citations) {
		 // check error
	        int length = citations.length;
	        if (length == 0) {
	        	return 0;
	        }
	        
	        int[] array2 = new int[length + 1];
	        for (int i = 0; i < length; i++) {
	        	if (citations[i] > length) {
	        		array2[length] += 1;
	        	} else {
	        		array2[citations[i]] += 1;
	        	}
	        }
	        int t = 0;
	        int result = 0;

	        for (int i = length; i >= 0; i--) {
	        	t = t + array2[i];
	        	if (t >= i) {
	        		return i;
	        	}
	        }
	        return 0;
	    }
	public static void main(String[] args) {
		int[] citation = {4, 0, 6, 1, 5};
		//System.out.println(citation.);
		System.out.println(new Solution().hIndex
				(citation));
	}
}
