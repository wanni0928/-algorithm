import java.util.HashMap;

public class FindPrimeNumber {
	public int solution(String numbers) {

		int answer = 0;
		String prefix = "";
		HashMap hm = new HashMap<Integer, Integer>();
		answer = find(numbers, prefix, hm);

		return answer;

	}

	public int find(String numbers, String prefix, HashMap<Integer, Integer> hm) {
		int result = 0;
		StringBuilder numbersStringBuilder = new StringBuilder(numbers);
		StringBuilder temp;
		String nextNm = "";
		String nextPrefix = "";
		
		System.out.println("prefix length : " + prefix.length());
		
		if (prefix.length() >= 1) {
			int checkNum = Integer.parseInt(prefix);
			System.out.println(checkNum);
			if (checkNum > 1) {
				if (hm.get(checkNum) == null) {
					if (checkSosu(checkNum)) {
//						System.out.println("sosu : " + checkNum);
						hm.put(checkNum, 1);
					}
				}
			}
		}

		if (numbers.length() >= 1) {
			for (int i = 0; i < numbers.length(); i++) {
				System.out.println("index : " + i);
				temp = new StringBuilder(numbers);
				System.out.println("temp : " + temp);
				nextPrefix = prefix + numbersStringBuilder.charAt(i);
				nextNm = temp.deleteCharAt(i).toString();
				System.out.println("nextPrefix : " + nextPrefix);
				System.out.println("nextNm : " + nextNm);
				System.out.println("이번 반복 끝 다음꺼");
				find(nextNm, nextPrefix, hm);
			}
		}
		result = hm.keySet().size();
		
		return result;
	}

	public boolean checkSosu(int num) {
		boolean flag = true;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			return flag;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		String numbers = "123";
		findSosu s = new findSosu();
		System.out.println("result : " + s.solution(numbers));
	}
}

