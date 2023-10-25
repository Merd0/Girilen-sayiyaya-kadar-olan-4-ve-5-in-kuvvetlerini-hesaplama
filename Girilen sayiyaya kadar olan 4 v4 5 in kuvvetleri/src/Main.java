import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int dört, beş, us, uss;

        System.out.print("4'lerin katı için sınır giriniz :");
        dört = inp.nextInt();
        System.out.print("5'lerin katı için sınır giriniz :");
        beş = inp.nextInt();

        System.out.println("4'lerin Katı");

        for (us = 1 ; us <= dört ; us*=4) {
            System.out.println(us);
        }
        System.out.println("-----------------------------------------------");

        System.out.println("5'lerin Katı");

        for (uss = 1; uss <= beş; uss *= 5) {
            System.out.println(uss);
        }
    }
}