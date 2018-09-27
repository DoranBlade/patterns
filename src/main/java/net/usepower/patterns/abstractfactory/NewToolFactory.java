package net.usepower.patterns.abstractfactory;

public class NewToolFactory implements ToolFactory {

    public Computer createComputer() {
        return new NewComputer();
    }

    public Printer createPrinter() {
        return new NewPrinter();
    }
}
