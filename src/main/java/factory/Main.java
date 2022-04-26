package factory;

import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        printAreaFormula("Circle");
    }
    public static void printAreaFormula(String shape) {
        switch (shape) {
            case "Circle" :
                new Circle().printAreaFormula();
                break;
            case "Rectangle" :
                new Rectangle().printAreaFormula();
                break;
            case "Square" :
                new Square().printAreaFormula();
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
