package array_2;

import java.util.Scanner;///////////////삽질삽질삽질

//int [][] ar = new int[3][]; // 가변길이
//
//ar[0] = new int[2];
//ar[1] = new int[3];
//ar[2] = new int[4];

public class SungJuk2 {
	public static void main(String[] args) {
		int stuNum, subjectCnt;
		String name, subject,jumsu;
		String[][] student = new String[5][];
		int sum= 0; double avg=0;
		
		// 인원수입력
		System.out.print("인원수 입력:");
		stuNum = new Scanner(System.in).nextInt();
		
		student[0] = new String[stuNum]; //명수만큼 이름방 잡아주기//*****************
		
		
		for(int i=0; i<stuNum; i++) {//명수만큼 입력받기
			System.out.printf("%d번째 이름입력 :",i+1);
			student[0][i] = new Scanner(System.in).nextLine();
			
			
			// 과목수 입력
			System.out.print("과목수 입력:");
			subjectCnt = new Scanner(System.in).nextInt();
			student[1] = new String[subjectCnt]; //과목수만큼 방잡아주기//**************
			
			for(int j=0; j<subjectCnt; j++) {//과목입력받기
				System.out.print("과목명 입력:");
				student[1][j] = new Scanner(System.in).nextLine();	
			}//for j
			
			//성적입력
			student[2] = new String[subjectCnt]; //과목수만큼 방잡아주기//**************
			for(int j=0; j<subjectCnt; j++) {//성적입력받기
				System.out.print("성적 입력:");
				student[2][j] = new Scanner(System.in).nextLine();//**********
				sum += Integer.parseInt(student[2][j]);
			}//for j	
			
//			
////			student[4] = new String[stuNum]; //인원수만금 총점 방잡기
////			student[5] = new String[stuNum]; //인원수만큼 평균 방잡기
//			
			
		}//for i //한명씩 입력 반복
		
	
	
		
		//총점
		for(int k=0; k<student[2].length; k++) {
//			student[4][k] += Integer.parseInt(student[2][k]);
		}

		
		
		
		System.out.println("************************************************");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 학점\t");
		System.out.println("************************************************");
		
		// 출력
		for (int i = 0; i < student.length; i++) {

			for (int j = 0; j < student[i].length; j++) {
				System.out.printf(student[i][j]+"\t");
			}
			
			
		}
		
		

	}
}
//
//[문제]
//
//인원수를 입력하여
//인원수만큼 데이터를
//입력받고 총점과
//평균을 구하시오
//평균은 소수이하 2 째자리까지 출력
//
//[실행결과]인원수:2
//
//1
//번째 이름입력:
//
//홍길동 (name)
// 과목수 입력 : 2   (subjectCnt)
// 과목명 입력 : 국어 (subject)
// 과목명 입력 : 영어
// 국어 점수 입력 : 95 (jumsu)
// 영어 점수 입력 : 100
// 
// 2번째
// 이름입력 : 이기자 (name)
// 과목수 입력 : 3   (subjectCnt)
// 과목명 입력 : 국어 (subject)
// 과목명 입력 : 영어
// 과목명 입력 : 자바
// 국어 점수 입력 : 95 (jumsu)
// 영어 점수 입력 : 100
// 자바 점수 입력 : 100
// 
// 이름     국어     영어    총점     평균
//홍길동    95        100      xxx    xx.xx
//
// 이름      국어      영어     자바    총점      평균
//이기자       95       100     100    xxx      xx.xx