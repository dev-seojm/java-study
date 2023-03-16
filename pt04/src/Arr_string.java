
public class Arr_string {

	public static void main(String[] args) {

		String[] name = { "kim", "park", "lee" };
		
		name[0] = "jang"; // 배열의 첫 번째 요소를 kim > jang으로 변
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		for(int i = 0; i < 5; i++) {            // name.length; = 3번 , 5는 5번 실행한다 
			int tmp = (int)(Math.random() *3 ); // tmp 안에 0~2 인트값 랜덤으로 넣고 
			System.out.println(name[tmp]);      // tmp는 0~2지만 name	배열안에서는 tmp는 
		}                                       // 0 = jang, 1 = park, 2 = lee로 출력된다.
	}

}
