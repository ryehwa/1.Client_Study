package j0617.sub;

//RepeatChar <----- PrintTest (charPrint)
public class PrintTest {
	//내가 만든 메서드를 나만 사용->public X 외부에 공개 -> public O
	public static void charPrint(String str,int n) {
		for(int i=1;i<=n;i++)
			System.out.print(str);
	}
}
