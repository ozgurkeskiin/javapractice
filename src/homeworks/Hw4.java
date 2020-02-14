package homeworks;

public class Hw4 {

    public static void specialNumber(){
        for(int i = 100; i < 1000; i++) {
            if(checkIsSpecialNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkIsSpecialNumber(int number){
        boolean retVal = false;
        int reverseNum = changeDigitsNumber(number);
        int firstTwoDigit = takeOnlyTwoDigits(3,number);
        int lastTwoDigit =  takeOnlyTwoDigits(1,number);
        if(     (reverseNum > number) &&
                isPrime(number) &&
                isPrime(reverseNum) &&
                isPrime(firstTwoDigit) &&
                isPrime(lastTwoDigit) &&
                isPrime(changeDigitsNumber(firstTwoDigit)) &&
                isPrime(changeDigitsNumber(lastTwoDigit)) ) {

            retVal = true;
        }
        return retVal;
    }

    private static int changeDigitsNumber(int i){
        int reverseNum = 0;
        int temp=i;

        for(;i != 0; i /= 10) {
            int digits = i % 10;
            reverseNum = reverseNum * 10 + digits;
        }

        return reverseNum;
    }

    private static int takeOnlyTwoDigits(int outDigit , int number){
        int retNum = 0;
        if(outDigit == 3)
        {
            retNum = number / 10;
        }
        else
        {
            retNum = (number%100);
        }

        return retNum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
