package packZad5;

import lombok.Data;

import java.util.Comparator;
@Data
public class GameResultsComparator implements Comparator<GameResults> {
    private String choose;

    public GameResultsComparator(String choose) {
        this.choose = choose;
    }

    @Override
    public int compare(GameResults o1, GameResults o2) {
        if (choose.equalsIgnoreCase("name")) {
            return o1.getName().compareTo(o2.getName());
        }
        else
        if (choose.equalsIgnoreCase("score")) {
            return Integer.compare(o1.getScore(), o2.getScore());
        } else
        if (choose.equalsIgnoreCase("timestamp")) {
            return o1.getTimestamp().compareTo(o2.getTimestamp());
        } else
        return 0;
    }
}
