package packZad5;

import java.util.Scanner;

public class ScannerWork {
    Scanner scanner = new Scanner(System.in);

    public char yourChoise() {
        System.out.println();
        System.out.println("Wybierz:\n a) sortowanie wg imion\n b) sortowanie wg wyniku gry" +
                "\n c) sortowanie po dacie\n w) wyjście");

        boolean flag = false;
        char znak = 'a';
        do {
            System.out.println();
            System.out.println("wybierz a/b/c/w ?");
            znak = scanner.next().charAt(0);
            if (znak == 'a' || znak == 'b' || znak == 'c' || znak == 'w') {
                flag = true;
            }
        } while (!flag);
        return znak;
    }
}
