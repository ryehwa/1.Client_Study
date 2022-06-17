package j0610hw;

public class StarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a(행의 수),b(행이 증가할 때마다 별도 증가),공백(c)
		for(int a=1;a<=5;a++) {
			for(int c=1;c<a;c++) {
				//공백을 증가시키면서 출력
				//(첫행만 공백을 안찍어주고 나머지 행은 행마다 공백 증가)
				System.out.print(" ");
			}
			for(int b=5;b>=a;b--) {
				System.out.print("*"); 
			}
			System.out.println();
		}
			
	}

}
