
public class Arr_string {

	public static void main(String[] args) {

		String[] name = { "kim", "park", "lee" };
		
		name[0] = "jang"; // �迭�� ù ��° ��Ҹ� kim > jang���� ��
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		for(int i = 0; i < 5; i++) {            // name.length; = 3�� , 5�� 5�� �����Ѵ� 
			int tmp = (int)(Math.random() *3 ); // tmp �ȿ� 0~2 ��Ʈ�� �������� �ְ� 
			System.out.println(name[tmp]);      // tmp�� 0~2���� name	�迭�ȿ����� tmp�� 
		}                                       // 0 = jang, 1 = park, 2 = lee�� ��µȴ�.
	}

}
