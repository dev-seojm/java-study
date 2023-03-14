
public class VarEx4 {

	public static void main(String[] args) {
		
		char ch = 'a';
		
//		char ch = 'ab'; 문자가 두개여서 에
		
		String s = "abc"; // 문자열 = 연속된 여러문자 
		
		String str1 = "a"; // 한개여도 ㅇㅋ
		
		String str2 = ""; // 빈 물자열 (empty string)
		
//		char ch = ''; // 에러남
		
		String s1 = "a" + "b" ; // "ab"
		
		String w = ""+7;
		
		String str3 = "abcd";
		
		String str4 = "123";
		
		String str5 = str3 + str4;
		
		System.out.println(str5);
		System.out.println(""+7+7); // 대입 순서에 따라 77 , 14로 출력
		System.out.println(7+7+"");
		
		
	}
}
