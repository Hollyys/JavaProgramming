package Assignment07;

// 2017110157 신성한

import java.util.*;

class Card{
	String suit;
	String numString;
	
	@Override
	public String toString() {
		return "(" + suit + " " + numString + ")";
	}
	
	public Card(String suit, String numString) {
		this.suit = suit;
		this.numString = numString;
	}
	
}

class CardDealer{
	String[] suit = {"♣", "♠", "◆", "♥"};
	String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	ArrayList<Card> initialCard = new ArrayList<>();
	
	public void print_card() {
		int cnt = 0;
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
            	System.out.print(initialCard.get(cnt).toString());
            	cnt++;
            }
            System.out.println();
        }
		System.out.println("\n");
	}
	
	public void shuffle() {
		Collections.shuffle(initialCard);
	}
	
	public void initialDeal(Player p1, Player p2, Player p3) {
		 for (int i = 0; i < 8; i++) {
			 p1.holdingCardList.add(initialCard.remove(0));
		 }
		 //openCardDeal(p1);
		 
		 for (int i = 0; i < 8; i++) {
			 p2.holdingCardList.add(initialCard.remove(0));
		 }
		 //openCardDeal(p2);
		 
		 for (int i = 0; i < 8; i++) {
			 p3.holdingCardList.add(initialCard.remove(0));
		 }
		 //openCardDeal(p3);
	}
	
	public void deal(Player p1, Player p2, Player p3) {

		for (int i = 0; i < 2; i++) {
			p1.holdingCardList.add(initialCard.remove(0));
			p2.holdingCardList.add(initialCard.remove(0));
			p3.holdingCardList.add(initialCard.remove(0));
		}
		// 세 번씩 두 세트 총 6장의 카드 나눠줌
	}
	
	public void print_status(Player p1, Player p2, Player p3) {
		// Enter키를 입력 받으면 다음 단계로 진행하고, 각 선수들의 카드 현황을 화면에 출력함
		// 각 선수 별 가지고 있는 카드 목록(숨겨진 카드 목록)과 공개한 카드 목록 (숫자가 같은 카드를 뽑아낸 목록)을 화면에 출력
		// 각 선수들의 동일한 카드 검사 기능 호출 및 카드 목록 화면 출력 기능 호출
		System.out.println("[" + p1.name + "]");
		p1.print_oCard();
		System.out.println();
		p1.print_hCard();

		System.out.println("[" + p2.name + "]");
		p2.print_oCard();
		System.out.println();
		p2.print_hCard();
		
		System.out.println("[" + p3.name + "]");
		p3.print_oCard();
		System.out.println();
		p3.print_hCard();
	}
	
	public CardDealer() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                initialCard.add(new Card(suit[i], number[j]));
            }
        }
    }
	
}

class Player{
	String name = "";
	int score;
	
	ArrayList<Card> holdingCardList = new ArrayList<>();
	ArrayList<Card> openCardList = new ArrayList<>();
	
	public void generateOpenCard() {
		
		Card card = new Card("null", "null");
		
		for (int i = 0; i < holdingCardList.size()-1; i++) {
			
			Card card1 = holdingCardList.get(i);
			
			for(int j = i+1; j < holdingCardList.size();j++) {
				Card card2 = holdingCardList.get(j);
				if(card1.numString.equals(card2.numString) && !card1.numString.equals("null")){
					openCardList.add(card1);
					openCardList.add(card2);
					
					holdingCardList.set(i, card);
					holdingCardList.set(j, card);
					break;
				}
			}
		}
		
		int i = 0;
		while(i < holdingCardList.size()) {
			Card card1 = holdingCardList.get(i);
			if(card1.numString.equals("null"))
				holdingCardList.remove(i);
			else
				i++;
		}
	}
	
	public void print_oCard() {
		System.out.printf("짝이 맞는 카드: %2d장\n", openCardList.size());
		for (int i = 0; i < openCardList.size(); i++) {
			System.out.print(openCardList.get(i).toString());
		}
		System.out.println();
	}
	
	public void print_hCard() {
		System.out.printf("가지고 있는 카드: %2d장\n", holdingCardList.size());
		for (int i = 0; i < holdingCardList.size(); i++) {
			System.out.print(holdingCardList.get(i).toString());
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
	}
	
	public Player(String name) {
		this.name = name;
	}
}

public class CardGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input;
		
		Map<String, Integer> rank = new HashMap<>();
		
		Player p1 = new Player("봉다리");
		Player p2 = new Player("새롱");
		Player p3 = new Player("몽실");
		
		CardDealer cardDealer = new CardDealer();
		
		System.out.println("<< 카드 생성 및 섞기 >>");
		cardDealer.print_card();
		cardDealer.shuffle();
		
		cardDealer.initialDeal(p1, p2, p3);
		System.out.println("<< 처음 딜러가 나누어 준 카드 >>");
		cardDealer.print_status(p1, p2, p3);
		
		int cnt = 1;
		
		System.out.printf("<< %2d 단계 >>  숫자가 같은 카드 공개(2 장씩 허용)\n\n",cnt);
		p1.generateOpenCard();
		p2.generateOpenCard();
		p3.generateOpenCard();
		cardDealer.print_status(p1, p2, p3);
		
		while(true) {
			cnt++;
			System.out.printf("<< %2d 단계 >> 숫자가 같은 카드공개 (2장씩 허용)\n",cnt);
			System.out.println(" - 딜러로부터 2 장씩 새로운 카드를 받습니다.\n");
			
			cardDealer.deal(p1, p2, p3);
			p1.generateOpenCard();
			p2.generateOpenCard();
			p3.generateOpenCard();
			cardDealer.print_status(p1, p2, p3);
			
			if(cardDealer.initialCard.size() < 6) {
				 // 게임 종료조건 1
				 break;
			 }
			
			if(p1.holdingCardList.size() == 0
					|| p2.holdingCardList.size() == 0
						|| p3.holdingCardList.size() == 0) {
				// 게임 종료조건 2
				break;
			}
			
			System.out.println("다음 단계 게임 진행을 위해 Enter 키를 누르세요!\n");
			input = scanner.nextLine();
			
			if(input.equals("q"))
				break;
		}
		
		System.out.printf("경기 종료 (Dealer가 가진 카드수: %2d)\n", cardDealer.initialCard.size());
		System.out.printf("짝을 맞춘 개수 (%s: %3d), (%s: %3d), (%s: %3d)\n"
													, p1.name, p1.openCardList.size()
													, p2.name, p2.openCardList.size()
													, p3.name, p3.openCardList.size());
		rank.put(p1.name,p1.openCardList.size());
		rank.put(p2.name,p2.openCardList.size());
		rank.put(p3.name,p3.openCardList.size());
		
		List<String> rankArray = new ArrayList<>(rank.keySet());
		Collections.sort(rankArray, (v2, v1) -> (rank.get(v1).compareTo(rank.get(v2))));
		
		System.out.println();
		System.out.println(rankArray.get(0) + " Win!");
		System.out.println(rankArray.get(2) + " Loose!");
		
		scanner.close();

	}

}
