
public class Main {

	public int reverseInt(int tar) {
		int sign = tar < 0 ? 1 : -1;
		boolean flag = false;
		int ans = 0;
		if (tar > 0) {
			sign = 1;
		} else {
			sign = -1;
			tar *= -1;
		}
		for (int i = 10000, j = 1; i > 0; i /= 10) {
			int tmp = tar / i;
			if (tmp != 0 || flag) {
				ans += tmp * j;
				tar -= tmp * i;
				j *= 10;
				flag = true;
			}
		}
		if(ans > 65535)
			return 0;
		return ans * sign;
	}

	public int reverseInt2(int x) {
		int ans = 0;
		while(x > 0) {
			int t = x%10;
			int newAns = ans*10 + t;
			if(((newAns - t)/10) != ans) {
				// overflow
				return 0;
			}
			ans = newAns;
			x /= 10;
		}
		return ans;
	}
	public static void main(String[] args) {
		Main test = new Main();
		System.out.println(test.reverseInt2(23454));
	}
}
