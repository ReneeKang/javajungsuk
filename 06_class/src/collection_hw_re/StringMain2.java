package collection_hw_re;


import java.io.IOException;
import java.util.Scanner;


public class StringMain2 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int tmp=0;
		int cnt=0;
		boolean none=false;
		String minus; //문자열의 특정단어를 검색하고 검색한 후 특정단어를 없애줄 문자열

		System.out.print("문자열 입력 : ");
		String s = scan.nextLine();
		System.out.print("현재 문자열 입력 : ");
		String sch_OK = scan.nextLine();
		System.out.print("바꿀 문자열 입력 : ");
		String cng = scan.nextLine();
		
		
		//소문자 변경
		s = s.toLowerCase();
		minus = s.toLowerCase();
		
		//indexOf 먼저 해서 문자열 있는지 몇개 있는지 찾기
		while(true) {
			tmp = minus.indexOf(sch_OK);
			if(tmp ==-1) { //문자열 내에  특정 문자열이 없는경우
				if(cnt==0) { //문자열 내에 특정 문자열이 한번도 없는 경우
					none = true;
				}
				break;
			} else {
				cnt++; //문자열 내에 특정 문자열이 몇개 있는지 카운트
				//문자열 검색 후 해당 문자열을 없애준다.
				minus = minus.substring(0,tmp)+minus.substring(tmp+sch_OK.length(),minus.length());
			}
		}
		
		
		if(none) { //문자열 내에 특정 문자열이 한번도 없는 경우
			if(s.length()<sch_OK.length()) { //입력한 문자보다 바꿀 문자열의 크기가 더 큰 경우
				System.out.println("입력한 문자열의 크기가 작습니다.");
			}
			System.out.println("치환하지 못했습니다.");
		} else {
			for(int i=0; i<cnt; i++) { //문자열이 있는 횟수만큼 replace해줘야함
				s=s.replace(sch_OK, cng);
			}
			System.out.println(s);
			System.out.println(cnt+"번 치환");
		}
	}
}
/*출력 샘플
aabba
aa
dd


*/
/*
[문제] 치환하는 프로그램을 작성하시오. - indexOf(), replace()
 - String 클래스의 메소드를 이용하시오.
 - 대소문자 상관없이 개수를 계산하시오. (대문자 또는 소문자로 모두 통일시켜야함. upperCase 또는 LowerCase
 
 
 [실행결과1]
 문자열 입력 : aabba
 현재 문자열 입력 : aa
 바꿀 문자열 입력 : dd
 ddbba
 1번 치환


[실행결과2]
 문자열 입력 : aAbbA
 현재 문자열 입력 : aa
 바꿀 문자열 입력 : dd
 ddbba
 1번 치환

[실행결과3]
 문자열 입력 : aabbaa
 현재 문자열 입력 : aa
 바꿀 문자열 입력 : dd
 ddbbdd
2번 치환

[실행결과4]
 문자열 입력 : aabb
 현재 문자열 입력 : aaaaa
 바꿀 문자열 입력 : dddddd
입력한 문자열의 크기가 작습니다.
치환하지 못했습니다.

[실행결과5]
문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

*/