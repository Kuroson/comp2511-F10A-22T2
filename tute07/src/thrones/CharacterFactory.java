package thrones;

import java.util.Random;

public class CharacterFactory {
    private static Random random = new Random();

    public static Character createSatellite(String type) {
        // Example as BlackoutController
        if (type.equals("StandardSatellite")) {
            // return new StandardSatellite(...);
        } else if (type.equals("RelaySatellite")) {
            // return new RelaySatellite(...);
        }
        return null;
    }

    public static King createKing() {
        return new King(random.nextInt(), random.nextInt());
    }
}