public class SortSolution {

	public int[] arraySort(int minIdx, int maxIdx, int[] targetArray) {
		int[] answer = new int[maxIdx - minIdx + 1];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = targetArray[i + minIdx];
		}
		for (int i = 0; i < answer.length - 1; i++) {
			boolean swap = false;
			for (int j = 0; j < answer.length - i - 1; j++) {
				if(answer[j] > answer[j+1]) {
					int temp = answer[j];
					answer[j] = answer[j+1];
					answer[j + 1] = temp;
					swap = true;
				}
			}
			if(!swap) {
				break;
			}
		}
		return answer;
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] sortedArray = arraySort(commands[i][0] - 1, commands[i][1] - 1, array);
			answer[i] = sortedArray[commands[i][2] - 1];
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] answer = new int[3];
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		SortSolution solution = new SortSolution();
		answer = solution.solution(array, commands);
		
		for (int i : answer) {
			System.out.println(i);
		}
		
	}
}
