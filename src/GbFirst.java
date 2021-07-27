public class GbFirst {
    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign () {
        int a, b;
        a = 5;
        b = -7;
        int value = a + b;
        if (value >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }
    public static void printColor () {
        int min = -100;
        int max = 200;
        int value;
        value = (int) (Math.random()*(max-min))+min;
        if (value <= 0) {
            System.out.println("Красный " + value);
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый " + value);
        } else if (value > 100) {
            System.out.println("Зеленый " + value);
        }
    }
    public static void compareNumbers () {
        int max, min, a, b;
        min = 1;
        max = 10;
        a = (int) (Math.random()*(max-min+1))+min;
        b = (int) (Math.random()*(max-min+1))+min;
        if (a>=b){
            System.out.println(a + " >= " +b);
        } else
            System.out.println(a+ " < " + b);
    }
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }

    }

