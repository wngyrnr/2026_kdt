package worldcup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	

public class PlayerManager{
		private List<Player> PlayerList; //play리스트를 먼저 선언
		private Scanner sc = new Scanner(System.in);
		
	
	public PlayerManager() {//생성자로 PlayerList초기화
			super();
			PlayerList = new ArrayList<>();
		}
	
	public void PlayerAdd(Player player) {//선수 추가 메서드
		for(int i = 0; i<PlayerList.size(); i++) {
			if(PlayerList.get(i).getBacknumber()==player.getBacknumber()) {
				//리스트에 등번호와 입력받는 선수의 등번호 비교 후 같은 선수가 있다면 메서드 종료
				System.out.println("중복된 등번호의 선수가 있습니다.");
			return;
			}
		}
		PlayerList.add(player);
		System.out.println(player.getName() + "선수가 명단에 추가되었습니다.");
	}
	
	public void PlayerAddFirst(Player player) {//초기 선수 추가용 출력 메세지x
		PlayerList.add(player);
	}
	
	public boolean PlayerDelete(int number) {//선수를 리스트에서 삭제하는 메서드
		for(int i = 0; i<PlayerList.size(); i++) {//리스트의 크기만큼 읽음
			if(PlayerList.get(i).getBacknumber()==(number)){//같은 번호의 선수 찾기
				PlayerList.remove(i);//선수 삭제
				System.out.println("선수가 삭제되었습니다.");//메세지 출력
				return true;
			}
		}System.out.println("해당 선수를 찾을 수 없습니다.");
		return false;
		
	}

	public void PlayerSearch(String name) {//선수를 이름으로 검색
		for(Player player : PlayerList) {
			if(player.getName().equals(name)) {
				System.out.print("검색 결과 :" + player.toString());
				return;
			}
		}System.out.println("찾을 수 없습니다.");
	}
	
	public void PositionSearch(String position) {//포지션별 총 인원수
		int num = 0;
		for(Player player : PlayerList) {
			
			if(player.getPosition().equals(position)) {
				num++;
			}
		}
		System.out.println(position+"인원 : " + num);
	}
	
	
	
	public void PlayerUpdate(int num) {//등번호로 선수 검색 후 수정
		for(Player player : PlayerList) {
			if(player.getBacknumber()==(num)) {
		System.out.print("이름 : ");
		String nm = sc.next();
		System.out.print("포지션 : ");
		String position = sc.next();
		System.out.print("등번호 : ");
		int num1 = sc.nextInt();
		player.setName(nm);
		player.setBacknumber(num1);
		player.setPosition(position);
		System.out.println("수정되었습니다.");
		return;
			}
		}System.out.println("찾을 수 없습니다.");
	}
	
	
	public void PlayerAll() {//명단 전체 출력하는 메서드
		for(Player player : PlayerList) {
			if(PlayerList.isEmpty()) {
			System.out.println("등록된 선수가 없습니다.");//리스트에 값이 없다면 출력
		}
		}
			System.out.println("======선수명단=======");
			for(Player player : PlayerList) {
			System.out.println(player.toString());
			}
			System.out.println("현재 등록된 선수 : "+PlayerList.size()+ "명");
			
	}
	

	
	

}
