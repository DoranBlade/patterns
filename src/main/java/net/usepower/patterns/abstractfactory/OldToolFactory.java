package net.usepower.patterns.abstractfactory;

public class OldToolFactory implements ToolFactory {

    public Computer createComputer() {
        return new OldComputer();
    }

    public Printer createPrinter() {
        return new OldPrinter();
    }
}
