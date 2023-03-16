
public class Arr_av_max {

	public static void main(String[] args) {
		
		int sum = 0;
		float average = 0f; // 평균은 소수점까지 표현해야 함으로 
		
		int[] score = {90, 80, 75, 70, 65};
		
		for(int i = 0; i < score.length; i++) {
			sum = sum + score[i]; // 풀어서 사용했지만 sum += score[i]; 	로 간략하게 사용가능 
		}
		
		average = sum / (float)score.length; // 계산결과를 float type으로 print하기위해 float type change
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
		
		
		int[] Arr = { 25, 23, 52, 63, 64, 82, 38, 92 };
		
		int max = Arr[0]; // 배열의 첫 번째 값으로 초기화 한다 이유는 비교하기위해서 
		int min = Arr[0];

		for(int i = 1; i < Arr.length; i++) { // i = 1 이라고 한 이유는 이미 배열의 첫 번째 값을 넣어서
			if(Arr[i] > max) {
				max = Arr[i];
			}else if(Arr[i] < min)
				min = Arr[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
