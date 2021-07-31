public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(intervalOfNum(10,11));
        System.out.println(polOfNum(0));
        System.out.println(polOfNum2(0));
        cycle("Сигнал", 3);
        System.out.println(year(2105));
    }

    public static boolean intervalOfNum (int a, int b) {
        int c = a + b;
        if (c < 10 || c > 20) {
            return false;
        } else return true;
    }

    public static String polOfNum (int a) {
        if (a<0) {
            return "Число отрицательное";
        } else return "Число положительное";
    }

    public static boolean polOfNum2 (int a) {
        if (a<0) {
            return true;
        } else return false;
    }

    public static void cycle (String a,int  b) {
        for (int i = b; i > 0; i--) {
            System.out.println(a);
        }
    }

    public static boolean year (int a) {
        if ((a % 4) == 0 && !((a % 100) ==0) || (a % 400) == 0) {
            return true;
        } else return false;

    }

}


//...