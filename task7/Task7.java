public class Task7 {

    public static void main(String[] args) {
        ArithmeticOperations operations = new ArithmeticOperations(10, 5);
        System.out.println(operations.getAdd());
        System.out.println(operations.getSubstract());
        System.out.println(operations.getMultiply());
        System.out.println(operations.getDivide());

    }
    public static class ArithmeticOperations {
    private int num1;
    private int num2;

    public ArithmeticOperations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private int getAdd() { return num1 + num2; }
    private int getSubstract() { return num1 - num2; }
    private int getMultiply() { return num1 * num2; }
    private int getDivide() { return num1 / num2; }
}

}
