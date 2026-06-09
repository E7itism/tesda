<<<<<<< HEAD
package task6;

public class Task6 {
  public static void main(String[] args) {
    int[] numbers = { 951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
        615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
        386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
        399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
        815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
        958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470, 743, 527
    };

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 237) {
        break;
      }
      if (numbers[i] % 2 == 0) {
        System.out.println(numbers[i]);
      }

    }
  }
=======
public class Task6 {

    public static void main(String[] args) {
        ArithmeticOperations operations = new ArithmeticOperations(10, 5);
        

        System.out.println(operations.getSum());
        System.out.println(operations.getMinus());
        System.out.println(operations.getMultiplication());
        System.out.println(operations.getDivision());
    }

    private static class ArithmeticOperations {
        private int num1;
        private int num2;

        public ArithmeticOperations(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        private int getSum() {
            return num1 + num2;
        }

        private int getMinus() {
            return num1 - num2;
        }

        private int getMultiplication() {
            return num1 * num2;
        }

        private int getDivision() {
            return num1 / num2;
        }
    }
>>>>>>> e0faeb0 (feat: modify task5 and add task6)
}
