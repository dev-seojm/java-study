
public class Arr_av_max {

	public static void main(String[] args) {
		
		int sum = 0;
		float average = 0f; // ����� �Ҽ������� ǥ���ؾ� ������ 
		
		int[] score = {90, 80, 75, 70, 65};
		
		for(int i = 0; i < score.length; i++) {
			sum = sum + score[i]; // Ǯ� ��������� sum += score[i]; 	�� �����ϰ� ��밡�� 
		}
		
		average = sum / (float)score.length; // ������� float type���� print�ϱ����� float type change
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
		
		
		int[] Arr = { 25, 23, 52, 63, 64, 82, 38, 92 };
		
		int max = Arr[0]; // �迭�� ù ��° ������ �ʱ�ȭ �Ѵ� ������ ���ϱ����ؼ� 
		int min = Arr[0];

		for(int i = 1; i < Arr.length; i++) { // i = 1 �̶�� �� ������ �̹� �迭�� ù ��° ���� �־
			if(Arr[i] > max) {
				max = Arr[i];
			}else if(Arr[i] < min)
				min = Arr[i];
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}

}
