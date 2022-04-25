package collection_hw;

public class SungJukDTO {
	private String name;
	private double avg;
	private int no, kor, eng, math, tot;
	
	
	public SungJukDTO (int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calc();
	}
	
	public void calc() {
		this.tot = kor+eng+math;
		this.avg = (double)tot/3;
	}

	
	//번호      이름      국어      영어      수학      총점      평균
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		return tot;
	}
	
	public String getAvg() {
		int intAvg = tot/3;
		if(avg == (double)intAvg) {
			return Integer.toString(intAvg);
		} else {
			return String.format("%.2f", avg);
		}
	}
	
}


/*
1. 번호(no), 이름(name), 국어(kor), 영어(eng), 수학(math)점수를 입력하여 총점(tot)과 평균(avg)을 구하시오
번호 no
이름 name
국어 kor
영어 eng
수학 math
총점 tot
평균 avg
*/
