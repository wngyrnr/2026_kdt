package worldcup;

import java.util.ArrayList;
import java.util.List;

	

public class PlayerManager{//Player객체 상속
		private List<Player> PlayerList; //play리스트를 먼저 생성
		
		
	
	public PlayerManager() {
			super();
			PlayerList = new ArrayList<>();
		}
	
	public void PlayerAdd(Player player) {//선수 추가 메서드
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

	public void PlayerSearch(String name) {
		for(Player player : PlayerList) {
			if(player.getName().equals(name)) {
				System.out.println("검색 결과 :" + player.toString());
				return;
			}
		}System.out.println("찾을 수 없습니다.");
	}
	
	public void PlayerAll() {
		for(Player player : PlayerList) {
			if(PlayerList.isEmpty()) {
			System.out.println("등록된 선수가 없습니다.");
		}
		}
			System.out.println("======선수명단=======");
			for(Player player : PlayerList) {
			System.out.println(player.toString());
			}
			
	}

	
	

}
