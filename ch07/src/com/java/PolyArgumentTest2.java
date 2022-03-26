package com.java;

class Product2 {
	int price; //제품의 가격
	int bonusPoint; //제품구매 시 제공하는 보너스 점수 
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Product2(){}
}

class Tv3 extends Product2{
	Tv3(){super(100);}
	public String toString() {return "Tv3";}
}
class Computer2 extends Product2{
	Computer2(){super(200);}
	public String toString() {return "Computer2";}
}
class Audio extends Product2{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}
class Buyer2{//고객, 물건을 사는 사람 
	int money = 1000; //소유 금액 
	int bonusPoint = 0;// 보너스 점수 
	Product2[] item = new Product2[10];
	int i=0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"을 구매하였습니다.");
		
	}
	
	void summary() {// 구입한물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;
		String itemList = "";
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<item.length; i++) {
			if(item[i]==null)break;
			sum+=item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은" + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv3());
		b.buy(new Computer2());
		b.buy(new Audio());
		b.summary();
	}

}
