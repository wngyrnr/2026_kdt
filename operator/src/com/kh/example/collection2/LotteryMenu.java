package com.kh.example.collection2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class LotteryMenu {
    private final Scanner sc = new Scanner(System.in);
    private final LotteryController lc = new LotteryController();

    
    public void mainMenu() {
        System.out.println("========== KH 추첨 프로그램 ==========");
        System.out.println("1. 추첨 대상 추가");
        System.out.println("2. 추첨 대상 삭제");
        System.out.println("3. 당첨 대상 확인");
        System.out.println("4. 정렬된 당첨 대상 확인");
        System.out.println("5. 당첨 대상 검색");
        System.out.println("9. 종료");
        int num = sc.nextInt();
        while(true) {
        	switch(num) {
        	case 1:
        		this.insertObject();
        		break;
        	case 2:
        		this.deleteObject();
        		break;
        	case 3:
        		this.winObject();
        		break;
        	case 4:
        		this.sortedWinObject();
        		break;
        	case 5:
        		this.searchWinner();
        		break;
        	case 9:
        		return;
        	default :
        		
        	}
        	
        		
        }
        // ***** 메인 메뉴 *****
        // 1. 추첨 대상 추가       -> insertObject()
        // 2. 추첨 대상 삭제       -> deleteObject()
        // 3. 당첨 대상 확인       -> winObject()
        // 4. 정렬된 당첨 대상 확인 -> sortedWinObject()
        // 5. 당첨 대상 검색       -> searchWinner()
        // 9. 종료                 -> "프로그램 종료."
        // 잘못 입력 시 재입력 유도, 반복
    }

    public void insertObject() {
	     /*
	      삭제할 대상의 이름과 핸드폰 번호를 받고 매개변수 있는 Lottery 생성자를 이용해 
				객체에 정보를 담아 lc에 객체를 보냄. 
				받은 결과에 따라 true면 “삭제 완료 되었습니다.”, 
					false면 “존재하지 않는 대상입니다.” 출력 
	     */
    }

    public void deleteObject() {
        // 이름/번호 입력 → lc.deleteObject()
        // true: "삭제 완료되었습니다."
        // false: "존재하지 않는 대상입니다."
    }

    public void winObject() {
        // lc.winObject() 반환 Set을 println으로 출력
    }

    public void sortedWinObject() {
        // lc.sortedWinObject() 반환 TreeSet을 Iterator로 순회 출력
    }

    public void searchWinner() {
			/*
			  검색할 대상의 이름과 핸드폰 번호를 받고 매개변수 있는 Lottery 생성자를 이용해 
			  객체에 정보를 담아 lc에 객체를 보냄. 
			  받은 결과에 따라 true면 “축하합니다. 당첨 목록에 존재합니다.”, 
			  false면 “안타깝지만 당첨 목록에 존재하지 않습니다.” 출력
			*/
    }
}
public class LotteryController{ 
	 // 추첨 대상을 담을 HashSet 객체 생성(lottery) 
	 // 당첨 대상을 담을 HashSet 객체 생성(win) 
public boolean insertObject(Lottery l){ 
	  // 전달 받은 l을 lottery에 추가 후, 추가 결과인 boolean 값 반환 
} 
public boolean deleteObject(Lottery l){ 
	  // 전달 받은 l을 lottery에서 삭제 
	  // 당첨자 목록(win) 중에 삭제된 추첨 대상자가 존재할 수 있으니 
	  // 삭제 결과인 boolean 값과 win객체가 null이 아닐 때에만  
	  // win에도 해당 추첨 대상자 삭제 
} 

public HashSet winObject(){ 
	  // 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드 
	  // 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,  
	  // 인덱스를 이용해 win에 당첨자 저장 
	  // 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함 
	  // 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면  
	  // 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움 
	} 

public TreeSet sortedWinObject(){ 
	  // 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는 
	  // 정렬기준을 가지고 정렬된 결과를 반환 
	  // 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에 
	  // 당첨 대상 확인을 꼭 먼저 해야함 
} 
 
public boolean searchWinner(Lottery l){ 
	  // 전달 받은 l을 win에서 찾고 찾은 결과인 boolean 값 반환 
} 
} 

public class SortedLottery implements Comparator {
    public int compare(Object o1, Object o2) {
        // 이름 오름차순, 이름 같으면 번호 오름차순
    }
}

