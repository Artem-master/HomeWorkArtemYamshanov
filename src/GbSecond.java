public class GbSecond {
    public static void main(String[] args) {
        System.out.println(OneHomeWork(0,5));
        TwoHomeWork (-1);
        System.out.println(ThreeHomeWork(-1));
        FourHomeWork(4, "Четвертое задание");
        System.out.println(Five(400));
    }
    public static boolean OneHomeWork (int a, int b) {
        if (a+b >= 10 && a+b <= 20) {
            return true;
        } else return false;
    }
    public static void TwoHomeWork (int a) {
        if ((a%2)>=0) {
            System.out.println("Положительное");
        } else if ((a%2)<= 0) {
            System.out.println("Отрицательное");
        }
    }
    public static boolean ThreeHomeWork (int a) {
        if (a >= 0) {
            return true;
        } else return false;
    }
    public static void FourHomeWork (int a, String b) {
        int c;
        for (c = 1; c <= a; c++) {
            System.out.println(b);
        }
    }
    public static boolean Five (int a) {
        if ((a%100) == 0 && (a%=400) != 0) {
            return false;
        } else if ((a%4) == 0) {
            return true;
        } else return false;
    }
}
