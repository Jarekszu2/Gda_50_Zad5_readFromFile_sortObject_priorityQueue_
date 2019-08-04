package packZad5;

import java.util.Collections;
import java.util.List;

/*
5 Zadanie:
W pliku dane_zad.txt znajdują się historyczne wyniki gry w mario użytkowników.

1. załaduj dane z pliku do aplikacji, umieść dane w kolekcji swojego wyboru.
2. posortuj dane używając:
    a) metody sort
    b) kolejki priorytetowej

3. stwórz maina z parserem. Parser powinien pozwalać na sortowanie danych (dowolną metodą z powyższych) po:
    a) nazwach użytkowników
    b) wyniku
    c) dacie zapisu wpisu

 */
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Utilities utilities = new Utilities();
        ScannerWork scannerWork = new ScannerWork();

        System.out.println("Program wczytuje wyniki gry w Mario i umożliwia przeglądanie ich posortowanych.");
        String stringFromFile = utilities.getStringFromFile("src/main/java/packZad5/dane_zad.csv");
        String[] tab = utilities.createStringTable(stringFromFile);
        List<GameResults> gameResultsList = utilities.createGameResultsList(tab);

//        char znak = scannerWork.yourChoise();
        utilities.mainWork(gameResultsList);

//        Collections.sort(gameResultsList, new GameResultsComparator("timestamp"));
//        System.out.println();
//        utilities.printList(gameResultsList);
    }
}
