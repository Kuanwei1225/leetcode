import java.util.ArrayList;

public class Solution {

	public int[] twoSumII(int[] arr, int target) {
		int[] ans = new int[arr.length];
		for(int i = arr.length - 1, j = 0; target > 0 && i >= 0; i++) {
			if((target - arr[i]) > 0) {
				ans[j] = arr[i];
				target -= arr[i];
				j++;
			} else if (target == 0){
				return ans;				
			}
		}
		return null;
	}
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		
	}
}
