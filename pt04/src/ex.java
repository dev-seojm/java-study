import java.util.*;

public class ex {

	public static void main(String[] args) {
		
		int[] score = {0,10,20};
		
		for (int i = 0; i < score.length; i++) {
			score[i] *= 1000;
			System.out.println("score = "+score[i]); // ������ �̻ڰ�
		}
	}
}
