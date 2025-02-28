
public class Calc {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calc calculator = new Calc();
        System.out.println("Addition: " + calculator.add(5, 4)); 
        System.out.println("Subtraction: " + calculator.subtract(5, 4)); 
    }
}
