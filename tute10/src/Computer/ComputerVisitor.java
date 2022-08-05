package Computer;

public class ComputerVisitor {
    private boolean validated = false;
    // public void visit(ComputerComponent component) {
    //     if (component instanceof Computer) {
    //         System.out.println("Looking at computer Corelli with memory 500 GB.");
    //     }
    // }

    public void validate() {
        this.validated = true;
    }

    public boolean isValidated() {
        return this.validated;
    }

    public void visit(Computer component) {
        System.out.println("Looking at computer Corelli with memory 500 GB.");
    }

    public void visit(Keyboard component) {
        System.out.println("Looking at keyboard Mechanical keyboard which has 36 keys.");
    }

    public void visit(Mouse component) {
        System.out.println("Looking at mouse Bluetooth mouse.");
    }

    public static void main(String[] args) {
        ComputerComponent computer = new Computer("Corelli", 500);
        ComputerComponent keyboard = new Keyboard("Mechanical keyboard");
        ComputerComponent mouse = new Mouse("Bluetooth mouse");
        ComputerVisitor visitor = new ComputerVisitor();
        computer.accept(visitor);
        visitor.validate();
        computer.accept(visitor);
        keyboard.accept(visitor);
        mouse.accept(visitor);
        // computer.accept(visitor);

    }

}