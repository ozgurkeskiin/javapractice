package homeworks;
/**
 *@author ozgur
 *@since 15.02.2020
 */
public class Hw6 {
    private static int factoriel(int num){
        if(num > 1) {
            return num * factoriel(num - 1 );
        } else{
            return num;
        }
    }

    public static void eCalculate(){
        float e = 1;
        int maxCountTry = 10;
        for(int i = 1; i < maxCountTry; i++) {
            e  +=  1/factoriel(i);
        }
        System.out.println("e:" + e);
    }

    public static int sumFactor(int number){
        int sum = 0;
        for(int i = 1; i < number ; i++ ){
            if(number % i == 0){
                sum += i;
            }
        }
       // System.out.println("Sum of the factors "+ sum);
        return sum;
    }

    public static int inputIntNumber(){
        int intNumber;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter an integer num");
        intNumber = Integer.parseInt(kb.nextLine());
        kb.close();
        return intNumber;
    }

    public static void areFriendNumber(int num1, int num2){
        if(sumFactor(num1) == sumFactor(num2)){
            System.out.println("These numbers are friend " + num1 + " " + num2 );
        } else{
           // System.out.println("Sorry.. They aren't friend");
        }
    }

    public static void testAreFriendNumber(){
        for(int i = 1000; i <= 9999 ; i++ ){
            for(int j = 1000; j <= 9999; j++){
                areFriendNumber(i,j);
            }
        }
    }

    public static boolean isPerfectNum(int num){
        if(num == sumFactor(num)){
            return true;
        } else{
            return false;
        }
    }

    public static void findFourDigitsPerfectNum(){
        for (int i = 1000 ; i <= 9999 ; i ++){
            if(isPerfectNum(i)){
                System.out.println("PerfectNumFourDigit " + i);
            }
        }
    }
}
