package com.test;
//문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Book {
		String title;
		String writer;
		String publisher;
		int price;
		
		Book(String title,String writer, String publisher, int price){
			this.title = title;
			this.writer = writer;
			this.publisher = publisher;
			this.price = price;
		}
		
		public String toString() {
			return "책제목:"+title+", "+"저자:"+ writer +", "+ "출판사:"+publisher + ", "+"가격:"+price;
		}
}
