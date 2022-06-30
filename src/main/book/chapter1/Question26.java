package main.book.chapter1;

public class Question26 {
	
	public static void main(String[] args) {
		var sb = new StringBuilder();
		sb.append("red");
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
	}

}
