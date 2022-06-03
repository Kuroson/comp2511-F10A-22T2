package example;

/**
 * Write a program that stores a message and has methods for getting the message,
 * updating the message and printing it out in all caps. Write a `main()` method
 * for testing this class.
 *
 * Create a:
 * - Getter
 * - Setter
 * - Constructor
 * - printMe
 * - shout
 * - toString
 */

public class Shouter {
    private String message;

    public Shouter(String msg) {
        this.message = msg;
    }

    // Setter
    public void setMessage(String message) {
        // this.message = newMessage;
        // message = newMessage;
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return this.message;
    }

    public void shout() {
        System.out.println(this.message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("This is my message");
        System.out.println(s.getMessage());
        // s.setMessage("1234");
        // System.out.println(s.getMessage());
        s.shout();
    }
}
