package HackerEarth;

import java.util.HashMap;
import java.util.Map;

public class IceCreamPalour {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 6, 7, 2 };
		int total = 4;
		int n = 5;
		int res[] = twoSum(arr, total, n);
		System.out.println(res[0] + " " + res[1]);
	}

	private static int[] twoSum(int[] arr, int total, int n) {
		int result[] = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(total - arr[i])) {
				result[0] = i;
				result[1] = map.get(total - arr[i]);
				break;
			}
			map.put(arr[i], i);
		}
		return result;

	}

}
