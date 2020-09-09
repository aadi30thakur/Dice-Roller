import java.util.*;

public class main {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        char a = 'y';
        while (a == 'y') {
            int b = (int) Math.round(Math.random() * 5 + 1);

            switch (b) {
                case 1:
                    System.out.printf("------------%n|          |%n|    0     |%n|          |%n------------%n");
                    break;
                case 2:
                    System.out.printf("------------%n|0         |%n|          |%n|         0|%n------------%n");
                    break;
                case 3:
                    System.out.printf("------------%n|0         |%n|    0     |%n|         0|%n------------%n");
                    break;
                case 4:
                    System.out.printf("------------%n|0        0|%n|          |%n|0        0|%n------------%n");
                    break;
                case 5:
                    System.out.printf("------------%n|0        0|%n|    0     |%n|0        0|%n------------%n");
                    break;
                case 6:
                    System.out.printf("------------%n|0        0|%n|0        0|%n|0        0|%n------------%n");
                    break;

            }
            System.out.println("Roll dice again(y,n)");
            char res = sc.next().charAt(0);
            if (res == 'y' || res == 'Y')
                a = 'y';
            else
                break;

        }
    }
}
