package packZad5;

import java.io.*;

public class Utilities {

    public static String getStringFromFile(String file) {
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
}