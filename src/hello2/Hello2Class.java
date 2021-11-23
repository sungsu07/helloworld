package hello2;

public class Hello2Class {

	public static void main(String[] args) {
		
		int st; // 변수명은 숫자로 시작할 수 없다.
		int a = 30; // 변수명에는 특수문자를 사용할 수 없다.
		int b = 50;
		int c = 50;
		
		int aa = 14;
		int bb = 5;
		int cc = 16;
		
		int classa; // 키워드를 변수명으로 사용할 수 없다.
		
		// 안녕하세요 
		// 저는 이성수 입니다 
		// 잘부탁드립니다
		
		String ke = "캐터피"; // 문자열 변수 선언
		String BU = "브케인";
		String g = "구구"; // 문자열 변수 선언
		
		String A = "몸통박치기";
		String B = "불꽃세례";
		
		System.out.println("앗! 야생의 " + ke + "(이)가 튀어나왔다! ");
		System.out.println("가랏! " + BU + "!"); 
		System.out.println(ke + "의 체력은 " + a + "이다");
		System.out.println(BU + "의 체력은 " + b + "이다");
		System.out.println();
		
		System.out.println(BU + "의 " + B + " 공격");
		System.out.println("효과는 굉장했다!");
		System.out.println(ke + "의 체력이 " + aa + "감소했다!");
		System.out.println();
		System.out.println(ke + "의 " + A + " 공격");
		System.out.println(BU + "의 체력이 " + bb + " 감소했다");
		System.out.println();
		System.out.println(BU + "의 " + B + " 공격");
		System.out.println("효과는 굉장했다!");
		System.out.println(ke + "의 체력이 " + cc + "감소했다!");
		System.out.println("적의 " + ke + "는(은) 쓰러졌다!");
		System.out.println();
		System.out.println(BU + "은(는) " + bb*2 + "의 경험치를 얻었다!");
		
		
	}

}
