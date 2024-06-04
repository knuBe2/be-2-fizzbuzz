package knu.be.team2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    static String three_and_five(int n) {
        if ((n % 3 == 0) && (n % 5 == 0))
            return "fizzbuzz";
        return Integer.toString(n);
    }
}