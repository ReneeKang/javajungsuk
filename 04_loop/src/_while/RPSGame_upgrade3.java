package _while;

import java.io.IOException;
import java.util.Scanner;

public class RPSGame_upgrade3 {
	public static void main(String[] args) throws IOException{
		
//		com=1~3 사이의 난수가 발생; //1.가위 2.바위 3.보
		int user;
		int bet;
		int money = 1000; //보유금액 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			int com = (int)(Math.random()*3+1);
//			System.out.println(com); //com 출력확인
			System.out.printf("[보유게임머니] :%d원%n",money);
			System.out.print("가위(1),바위(2),보(3)중 번호 입력 : ");
			user = scanner.nextInt();
			if(1<=user && user<=3) {
				
			//배팅금액이 보유금보다 초과됐을때 막아주기 - for문 이용 *******
				
			do {
				
				System.out.print("배팅 금액 입력 : ");
				bet = scanner.nextInt();
			
				if(bet>money) {System.out.println("배팅금액이 보유금을 초과합니다.\n");
							System.out.printf("당신의 보유금은 %d원 입니다.\n",money);
				}
				
			}while(bet>money);
			
			
			//결과를 보시려면 Enter를 치세요... 
			System.out.print("결과를 보시려면 Enter를 치세요... ");
			System.in.read();
			
			if(com==1) {//가위
				
				switch(user){
					case 1: System.out.println("컴:가위 나:가위");System.out.println("You Draw!!");
							break;
					case 2: System.out.println("컴:가위 나:바위");System.out.println("You Win!!");
							money+=bet;break;
					case 3: System.out.println("컴:가위 나:보자기");System.out.println("You Lose");
							money-=bet;break;
				}	
				System.out.printf("당신의 금액은 %d원 입니다%n%n",money);
			}
				
			else if(com==2) {//바위
				switch(user){
					case 1: System.out.println("컴:바위 나:가위"); System.out.println("You Lose!!");
							money-=bet;break;
					case 2: System.out.println("컴:바위 나:바위");System.out.println("You Draw!!");
							break;
					case 3: System.out.println("컴:바위 나:보자기");System.out.println("You Win");
							money+=bet;break;
				}	
				System.out.printf("당신의 금액은 %d원 입니다%n%n",money);
			}
				
			else if(com==3) {//보
				switch(user){
					case 1: System.out.println("컴:보자기 나:가위");System.out.println("You Win!!");
							money+=bet;break;
					case 2: System.out.println("컴:보자기 나:바위");System.out.println("You Lose!!");
							money-=bet;break;
					case 3: System.out.println("컴:보자기 나:보자기");System.out.println("You Draw");
							break;
				}	
				System.out.printf("당신의 금액은 %d원 입니다%n%n",money);
			}
				
			
			
			if(money<=0) { //잔액부족할때
				System.out.print("잔액이 부족합니다. 또 하시겠습니까(y/n)? : ");
				// int yn = System.in.read();  
				String yn = scanner.next();
				char c = yn.charAt(0);
				//또 하겠다
				if(c=='y' || c=='Y') {
					System.out.printf("%ninsert coin :");
					money = scanner.nextInt();
					if(money == 0) {System.out.println("잔액이 부족함으로 게임을 종료합니다.");break;}
//					System.out.printf("보유금 : %d원%n%n",money);
				}
				//안하겠다
				else if(c=='n' || c=='N') {System.out.println("게임을 종료합니다."); break;}//while문을 벗어나라
				else {System.out.println("잘못입력하셨습니다. 게임을 종료합니다.");break;}
			}
			
			
		}else System.out.printf("다시입력해주세요(1~3)%n%n");
			
		
			
			
			
		}
		
		
		
				
	}
}
//
//[문제] 가위, 바위, 보 게임 - while, if
//- 가위(1), 바위(2), 보자기(3) 지정한다.
//- 돈이 떨어지면 다시 게임할거냐고 물어보세요
//- money=1000원을 무조건 가지고 시작한다.
//- 현금이 마이너스이면 [또 할래(y/n)]
//- 만약 또 한다면 insert coin ? 현금을 입력받는다.
//
//[실행결과]
//가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
//배팅 금액 입력 : 200
//결과를 보시려면 Enter를 치세요... (선택)
//컴퓨터 : 바위   나 : 보자기
//You Win!!
//당신의 금액 1200원 입니다.
//
//가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
//배팅 금액 입력 : 500
//결과를 보시려면 Enter를 치세요... (선택)
//컴퓨터 : 가위   나 : 보자기
//You Lose!!
//당신의 금액 700원 입니다.
//
//가위(1),바위(2),보(3) 중 번호 입력 : 1 (user)
//배팅 금액 입력 : 500
//결과를 보시려면 Enter를 치세요... (선택)
//컴퓨터 : 가위   나 : 가위
//You Draw!!
//당신의 금액 -700원 입니다.
//
//또 할래(y/n)? 
//
//insert coin ?