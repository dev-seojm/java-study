import java.util.*;
// 로또방 오
public class ex2 {

	public static void main(String[] args) {
		
		int[] numArr = new int[45];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
		System.out.println(numArr);
		System.out.println(Arrays.toString(numArr));
		
		int tmp = 0;
		int j = 0;
		
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			tmp = numArr[i];
			numArr[i] = numArr[j];
			numArr[j] = tmp;
//			System.out.println("바뀐 값 : " + numArr[i]);
		}
	}
}	
