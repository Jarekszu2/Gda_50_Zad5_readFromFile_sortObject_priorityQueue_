package packZad5;
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

        Utilities importData = new Utilities();
        System.out.println(Utilities.getStringFromFile("src/main/java/packZad5/dane_zad.csv"));
    }
}
