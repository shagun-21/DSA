public class OddOrEven {
    public static void main(String[] args) {
        int a=66;
        System.out.println(idOdd(a));
    }

    private static boolean idOdd(int a) {
        return (a&1)==1;
    }
}
