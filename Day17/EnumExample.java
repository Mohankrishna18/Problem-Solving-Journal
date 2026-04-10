

// Enum definition
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        // Test with all days
        for (Day day : Day.values()) {
            printMessage(day);
        }
    }

    // Method to print message depending on the day
    public static void printMessage(Day day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println(day + " → Weekend");
                break;
            default:
                System.out.println(day + " → Workday");
        }
    }
}
