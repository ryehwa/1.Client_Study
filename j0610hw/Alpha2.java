package j0610hw;

public class Alpha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Alp='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(Alp);
				Alp++;//문자 출력 후 다음번 문자 아스키 코드값으로 변경
			}
			System.out.println();
		}
	}

}
