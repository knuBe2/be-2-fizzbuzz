package knu.be.team2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=15; i++) {
            System.out.println(fizzbuzz(i));
        }
    }
    static String fizzbuzz(int n) {
        if ((n % 3 == 0) && (n % 5 == 0))
            return "fizzbuzz";
        return Integer.toString(n);
    }
}