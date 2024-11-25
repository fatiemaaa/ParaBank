package util;

import java.util.Random;

public class Utility {
    private static final String[] FIRST_NAMES = {
            "Alice", "Bob", "Charlie", "David",
            "Eve", "Frank",
            "Grace", "Henry", "Ivy", "Jack", "Kate", "Leo",
            "Mary", "Noah", "Olivia", "Paul", "Quinn", "Riley",
            "Sarah", "Thomas", "Ursula", "Victor", "Wendy", "Xavier"
    };

    public static String generateRandomFirstName() {
        Random random = new Random();
        int index = random.nextInt(FIRST_NAMES.length);
        return FIRST_NAMES[index];
    }
    private static final String[] LAST_NAMES = {
            "Smith", "Johnson", "Williams", "Jones", "Brown",
            "Davis", "Miller", "Wilson", "Moore", "Anderson",
            "Taylor", "Thomas", "Jackson", "White", "Harris",
            "Martin", "Thompson", "Garcia", "Martinez", "Clark"
    };

    public static String generateRandomLastName() {
        Random random = new Random();
        int index = random.nextInt(LAST_NAMES.length);
        return LAST_NAMES[index];
    }
    private static final String[] CITIES = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "San Diego", "Austin", "Dallas"};


    public static String generatePostalCode(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Postal code length must be positive.");
        }

        Random random = new Random();
        StringBuilder postalCode = new StringBuilder();

        for (int i = 0; i < length; i++) {
            postalCode.append(random.nextInt(10));
        }

        return postalCode.toString();
    }

    private static final String[] areaCodes = {"212", "312", "415", "617", "718", "917", "202", "303", "404", "602", "702", "909"};
    private static final String[] prefixes = {"234", "567", "890", "123", "456", "789"};

    public static String generatePhoneNumber() {
        Random rand = new Random();
        int areaCodeIndex = rand.nextInt(areaCodes.length);
        int prefixIndex = rand.nextInt(prefixes.length);
        String suffix = String.format("%04d", rand.nextInt(10000));

        return areaCodes[areaCodeIndex] + "-" + prefixes[prefixIndex] + "-" + suffix;
    }



    }
