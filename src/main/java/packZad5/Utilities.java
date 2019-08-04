package packZad5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilities {

    public String getStringFromFile(String file) {
        String result;
        String linia;
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((linia = bufferedReader.readLine()) != null) {
                stringBuilder.append(linia);
                stringBuilder.append(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        result = stringBuilder.toString();
        return result;
    }

    public String[] createStringTable(String textToChange) {
        String[] tab = textToChange.split(",");
        return tab;
    }

    public List<GameResults> createGameResultsList(String[] tabString) {
        List<GameResults> gameResultsList = new ArrayList<>();
        for (int i = 0; i < tabString.length; i+=3) {
            GameResults gameResults = new GameResults();
            gameResults.setTimestamp(tabString[i]);
            gameResults.setScore(Integer.valueOf(tabString[i + 1]));
            gameResults.setName(tabString[i + 2]);
            gameResultsList.add(gameResults);
        }
        return gameResultsList;
    }

    public void printList(List<GameResults> gameResults) {
        gameResults.forEach(System.out::println);
    }

    public void mainWork(List<GameResults> gameResultsList) {
        Utilities utilities = new Utilities();
        ScannerWork scannerWork = new ScannerWork();

        boolean flag = false;
        do {
//            System.out.println("a/b/c ?");
            char znak = scannerWork.yourChoise();
            switch (znak) {
                case 'a':
                    GameResultsComparator gameResultsComparatorA = new GameResultsComparator("name");
                    Collections.sort(gameResultsList, gameResultsComparatorA);
                    utilities.printList(gameResultsList);
                    break;
                case 'b':
                    GameResultsComparator gameResultsComparatorB = new GameResultsComparator("score");
                    Collections.sort(gameResultsList, gameResultsComparatorB);
                    utilities.printList(gameResultsList);
                    break;
                case 'c':
                    GameResultsComparator gameResultsComparatorC = new GameResultsComparator("timestamp");
                    Collections.sort(gameResultsList, gameResultsComparatorC);
                    utilities.printList(gameResultsList);
                    break;
                case 'w':
                    flag = true;
                    break;
            }
        } while (!flag);
    }
}