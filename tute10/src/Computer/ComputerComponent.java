package Computer;

// Visitable
interface ComputerComponent {
    public void accept(ComputerVisitor visitor);
}