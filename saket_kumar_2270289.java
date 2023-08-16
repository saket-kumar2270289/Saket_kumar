public class Spacecraft {
    private int x; // East/West
    private int y; // North/South
    private int z; // Up/Down
    private String direction; // N, S, E, W, Up, Down

    public Spacecraft(int initialX, int initialY, int initialZ, String initialDirection) {
        x = initialX;
        y = initialY;
        z = initialZ;
        direction = initialDirection;
    }

    public void moveForward() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "S":
                y--;
                break;
            case "E":
                x++;
                break;
            case "W":
                x--;
                break;
            case "U":
                z++;
                break;
            case "D":
                z--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case "N":
                y--;
                break;
            case "S":
                y++;
                break;
            case "E":
                x--;
                break;
            case "W":
                x++;
                break;
            case "U":
                z--;
                break;
            case "D":
                z++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "S":
                direction = "E";
                break;
            case "E" :
                direction = "N";
                break;
            case "W":
                direction = "S";
                break;
            case "U":
               direction="N";
               break;    
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "S":
                direction = "W";
                break;
            case "E":
                direction = "S";
                break;
            case "W":
                direction = "N";
                break;
             case "D":
                direction="S";
                break;   

        }
    }

    public void turnUp() {
        if (direction.equals("N") || direction.equals("S") || direction.equals("E") || direction.equals("W")) {
            direction = "U";
        }
    }
    public void turnDown() {
        if (direction.equals("N") || direction.equals("S") || direction.equals("E") || direction.equals("W")) {
            direction = "D";
        }
    }
    // Implement the turnDown() method similarly to turnUp()

    public void executeCommands(char[] commands) {
        for (char command : commands) {
            switch (command) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'u':
                    turnUp();
                    break;
                case 'd':
                    turnDown();
                    break;
                default:
                    // Handle invalid command or do nothing
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String getDirection() {
        return direction;
    }

    // Example usage
    public static void main(String[] args) {
        Spacecraft craft = new Spacecraft(0, 0, 0, "N");
        char[] commands = {'f', 'r', 'u', 'b', 'l'};
        craft.executeCommands(commands);
        System.out.println("Final Position: (" + craft.getX() + ", " + craft.getY() + ", " + craft.getZ() + ")");
        System.out.println("Final Direction: " + craft.getDirection());
    }
}
