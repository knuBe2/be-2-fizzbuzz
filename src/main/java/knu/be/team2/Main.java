package knu.be.team2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      
        for (int i = 1; i <= 15; i++) {
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}