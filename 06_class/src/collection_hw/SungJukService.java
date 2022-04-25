package collection_hw;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list; //이 문장을 고치지 마세요.
	Scanner scan = new Scanner(System.in);
	boolean init = true;
	
	public void menu() {
		int select;
		boolean reInput=false; //1~6 이외의 수일 때 메뉴 출력 X
		
		while(true) {
			if(!reInput) { //1~6 이외의 숫자를 입력했는지?
				System.out.println("*****************");
				System.out.println("     1. 입력");
				System.out.println("     2. 출력");
				System.out.println("     3. 검색");
				System.out.println("     4. 삭제");
				System.out.println("     5. 몰?루");
				System.out.println("     6. 끝");
				System.out.println("*****************");
			}
			System.out.print("     번호 : ");
			select = scan.nextInt();
			scan.nextLine();
			
			if(select == 1) { //입력
				insertArticle();
			} else if(select == 2) { //출력
				printArticle();
			} else if(select == 3) { //검색
				searchArticle();
			} else if(select == 4) { //삭제
				deleteArticle();
			} else if(select == 5) { //몰?루
				System.out.println("아직 추가되지 않은 기능입니다.");
			} else if(select == 6) { //끝
				break;
			} else {
				System.out.println("1~6중에 선택하세요");
				reInput = true;
				continue;
			}
			reInput = false;
		}
	}
	/*
	menu()
*****************
   1. 입력
   2. 출력
   3. 검색
   4. 삭제
   
   6. 끝
*****************
   번호 : 8
1~6중에 선택하세요
	*/
	public void insertArticle() {
		if(init) {
			list = new ArrayList<SungJukDTO>();
			init = false;
		}
		System.out.print("번호 입력 :");
		int no = scan.nextInt();
		scan.nextLine();
		System.out.print("이름 입력 :");
		String name = scan.nextLine();
		System.out.print("국어 입력 :");
		int kor = scan.nextInt();
		System.out.print("영어 입력 :");
		int eng = scan.nextInt();
		System.out.print("수학 입력 :");
		int math = scan.nextInt();
		list.add(new SungJukDTO(no,name,kor,eng,math));
		System.out.println("\n데이터를 저장했습니다.\n");
	}
	
	//번호      이름      국어      영어      수학      총점      평균
	public void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i).getNo()+"\t");
			System.out.print(list.get(i).getName()+"\t");
			System.out.print(list.get(i).getKor()+"\t");
			System.out.print(list.get(i).getEng()+"\t");
			System.out.print(list.get(i).getMath()+"\t");
			System.out.print(list.get(i).getTotal()+"\t");
			System.out.println(list.get(i).getAvg());
		}
		System.out.println();
	}
	
	
	
	/*
	검색 할 이름 입력 : 코난
	찾고자 하는 이름이 없습니다
	
	검색 할 이름 입력 : 홍길동
	번호      이름      국어      영어      수학      총점      평균
	15      홍길동   90      92      91      xxx      xx.xx
	16      홍길동   89      45      78      xxx      xx.xx
	*/
	public void searchArticle() {
		System.out.print("검색 할 이름 입력 : ");
		String name = scan.nextLine();
		boolean category = true; // 처음만 항목 출력, 항목출력 없을 시 데이터 없음
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				if(category) {
					System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
					category = false;
				}
				System.out.print(list.get(i).getNo()+"\t");
				System.out.print(list.get(i).getName()+"\t");
				System.out.print(list.get(i).getKor()+"\t");
				System.out.print(list.get(i).getEng()+"\t");
				System.out.print(list.get(i).getMath()+"\t");
				System.out.print(list.get(i).getTotal()+"\t");
				System.out.println(list.get(i).getAvg());
			}
		}
		if(category) {
			System.out.println("찾고자 하는 이름이 없습니다.");
		}
		System.out.println();
	}
	/*
	삭제 할 이름 입력 : 홍길동

	데이터를 2건 삭제하였습니다.
	*/
	public void deleteArticle() {
		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.nextLine();
		boolean category = true; //한번이라도 삭제했는지?
		int cnt=0; //데이터 삭제건수 카운팅
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				category = false;
				cnt++;
				list.remove(i); //요소 삭제
			}
		}
		if(category) {
			System.out.println("삭제하고자 하는 이름이 없습니다.");
		} else {
			System.out.println("데이터를 "+cnt+"건 삭제하였습니다.");
		}
		System.out.println();
	}
}
