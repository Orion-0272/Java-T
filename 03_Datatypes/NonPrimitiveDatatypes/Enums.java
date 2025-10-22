/*
Enum is a special type that gives you the options for values. Apart from these values you cannot have any other values.
You can’t assign a value that’s not defined in the enum.

Example:
Directions (NORTH, SOUTH, EAST, WEST)
Order status (PENDING, SHIPPED, DELIVERED)
*/

package NonPrimitiveDatatypes;

// Basic enums
enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

// Advance enums
enum Color {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");
    private final String hexCode;

    // Constructor
    Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }

}

public class Enums {
    public static void main(String[] args) {
        Direction currentDirection = Direction.NORTH;

        if (currentDirection == Direction.NORTH) {
            System.out.println("We are heading towards north.");
        }
        else if (currentDirection == Direction.SOUTH) {
            System.out.println("We are heading towards south.");
        }
        else if (currentDirection == Direction.EAST) {
            System.out.println("We are heading towards south.");
        }
        else if (currentDirection == Direction.WEST) {
            System.out.println("We are heading towards south.");
        }

        // -----------------------------------------------------
        Color color = Color.RED;
        System.out.println("HEX Code of " + color + ": " + color.getHexCode());
    }
}
