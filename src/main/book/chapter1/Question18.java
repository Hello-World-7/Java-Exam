package main.book.chapter1;


public class Question18 {
    static int start = 2;
    final int end;
    public Question18(int x) {
        x = 4;
        end = x;
    }
    public void fly(int distance) {
        System.out.print(end - start + " ");
        System.out.print(distance);
    }
    public static void main(String...start) {
        new Question18(10).fly(5);
    }
}