package odd;

public class OddTask {
    public static void main(String[] args) {
        System.out.println(isOdd(0));
    }

    public static boolean isOdd(int number){
        return number%2==0 ? false : true;
    }
}
