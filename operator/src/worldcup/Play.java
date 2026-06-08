package worldcup;

import java.util.List;
import java.util.Scanner;

public class Play extends PlayerManager{
	PlayerManager pm = new PlayerManager();
	private Scanner sc = new Scanner(System.in);
		
	public Play() {
	super();
	pm.PlayerAddFirst(new Player("김승규", "GK", 1));
	pm.PlayerAddFirst(new Player("이한범", "DF", 2));
	pm.PlayerAddFirst(new Player("김태현", "DF", 3));
	pm.PlayerAddFirst(new Player("김민재", "DF", 4));
	pm.PlayerAddFirst(new Player("김진규", "MF", 5));
	pm.PlayerAddFirst(new Player("황인범", "MF", 6));
	pm.PlayerAddFirst(new Player("손흥민", "FW", 7));
	pm.PlayerAddFirst(new Player("백승호", "MF", 8));
	pm.PlayerAddFirst(new Player("조규성", "FW", 9));
	pm.PlayerAddFirst(new Player("이재성", "MF", 10));
	pm.PlayerAddFirst(new Player("황희찬", "MF", 11));
	
	}



		
		
		
		
		public void PrintPlayer() {
			while(true) {
			System.out.println("=======2026 월드컵 대한민국 선수명단=======");
			System.out.println("1.선수 추가");
			System.out.println("2.선수 삭제(등번호 입력)");
			System.out.println("3. 선수 이름으로 검색");
			System.out.println("4. 선수 명단 출력");
			System.out.println("9. 종료");
			System.out.println("입력 : ");
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1:
			
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.println("포지션(GK / DF / MF / FW) : ");
				String position = sc.next();
				System.out.println("등번호 : ");
				int bn = sc.nextInt();
				pm.PlayerAdd(new Player(name,position,bn));
				break;
				
			case 2:
				System.out.print("선수 삭제 (등번호 입력) : ");
				int numd = sc.nextInt();
				pm.PlayerDelete(numd);
				break;
				
			case 3:
				System.out.println("선수 검색 : ");
				String Pname = sc.next();
				pm.PlayerSearch(Pname);
				break;
			case 4:
				pm.PlayerAll();
				break;
			case 9:
				System.out.println("종료되었습니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시입력해주세요");
					
			}
			
			}

		}	
		
}

