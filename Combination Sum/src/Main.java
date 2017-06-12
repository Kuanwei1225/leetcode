import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public void calculate(List<List<Integer>> res, List<Integer> tmpList, int[] can, int tar, int num) {
		if(tar < 0)
			return;
		if(tar > 0) {
			for(int i = num; i < can.length; i++) {
				if(i > num && can[i] == can[i-1]) 
					continue;
				tmpList.add(can[i]);
				calculate(res, tmpList, can, tar - can[i], i);
				tmpList.remove(tmpList.size() - 1);
			}
		} else if (tar == 0) {
			res.add(new ArrayList<>(tmpList));
		} 
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> resault = new ArrayList<>();
		Arrays.sort(candidates);
		calculate(resault, new ArrayList<Integer>(), candidates, target, 0);
		return resault;
        
    }
	
	public static void main(String[] args) {
		int[] candidates = {2, 3, 4, 6, 7};
		int target = 7;
		Main MM = new Main();
		List<List<Integer>> printRes = MM.combinationSum(candidates, target);
		System.out.println(printRes);
	}
}
