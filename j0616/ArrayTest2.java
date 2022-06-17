package j0616;

//1차원 배열의 문제
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {58,38,12,36,41,27,26,32,59,16,18,28,17};//14명
		//10~50대 나이->20대 몇명?(20~29)
		int count=0;//20대 저장
		
		for(int i=0;i<b.length;i++) {
			if(b[i]>=20 && b[i]<=29){
				count++; //찾은 갯수만큼 증가
				System.out.println("b["+i+"]=>"+b[i]);//출력
			}//if
		}//for
		System.out.println("20대 인원수(count)=>"+count);
	}
	

}
