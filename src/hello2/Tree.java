package hello2;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tree = 5;
		
		int[] odds = {2, 3, 1, 5, 10};
		
		int treeNo = 0;
		
		while(true) {
			for(int i = 1; i <= odds[treeNo]; i++) {
				System.out.println((treeNo + 1) + "번 나무를 도끼로 " + i + "회 찍었다");
				
				if(i == odds[treeNo]) {
					System.out.println("나무가 쓰러진다");
					tree = tree -1;
				} else {
					System.out.println("나무가 쓰러지지 않는다");
				}
			}
			treeNo++;
			System.out.println("남아있는 나무는? ");
			System.out.println(tree);
			System.out.println();
			
			if(tree == 0) {
				break;
			}
		}
		System.out.println("나무베기 성공");
		
	}

}
