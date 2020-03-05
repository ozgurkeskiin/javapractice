package homeworks;

import java.util.Scanner;

/**
 *@author ozgur
 *@since 15.02.2020
 *
 * 1-)Calculate e number
 * 2-)Please enter a number. Returns the sum of the multipliers, excluding the number itself.
 * 3-)Find friends number.
 * 4-)Find a perfect Number.
 */
public class HomeworkSix {
    private static final Integer MAX_VALUE_FOUR_DIGIT_NUMBER = 9999;
    private static final Integer MIN_VALUE_FOUR_DIGIT_NUMBER = 1000;

    public static void main(String[] args) {
        int selection = -1;
        int index = 0;

        while(selection != 0)
        {
            System.out.println(++index +"-)"+ Messages.E_CALCULATE);
            System.out.println(++index +"-)"+ Messages.FIND_SUM_OF_FACTOR);
            System.out.println(++index +"-)"+ Messages.FIND_FRIEND_NUMBERS);
            System.out.println(++index +"-)"+ Messages.FIND_4_DIGIT_PERFECT_NUMBER);
            System.out.println(Messages.EXIT);
            System.out.println(Messages.SELECT_MENU);

            selection = inputIntNumber();

            switch (selection){
                case 0:
                    break;
                case 1:
                    eCalculate();
                    break;
                case 2:
                    int num = 0;
                    System.out.println(Messages.GET_NEW_INT_VALUE);
                    num = inputIntNumber();
                    sumFactor(num,true);
                    break;
                case 3:
                    int prmFrst = 0;
                    int prmSec = 0;
                    System.out.println(Messages.FIRST_PARAM);
                    prmFrst = inputIntNumber();
                    System.out.println(Messages.SECOND_PARAM);
                    prmSec = inputIntNumber();
                    areFriendNumber(prmFrst,prmSec);
                    break;
                case 4:
                    findFourDigitsPerfectNum();
                    break;
                default:
                    break;
            }
            index = 0;
        }

    }
    private static int inputIntNumber(){
        int intNumber = 0;
        
        Scanner kb = new Scanner(System.in);
        intNumber = kb.nextInt();

        if(intNumber == 0)
        {
            kb.close();
        }

        return intNumber;
    }

    private static int factorial(int num){
        if(num > 1) {
            return num * factorial(num - 1 );
        } else{
            return num;
        }
    }

    private static void eCalculate(){
        float e = 1;
        int maxCountTry = 10;
        for(int i = 1; i < maxCountTry; i++) {
            e  +=  1/ factorial(i);
        }
        System.out.println(Messages.E_RESULT + e);
    }

    private static int sumFactor(int number, boolean showMessage){
        int sum = 0;
        for(int i = 1; i < number ; i++ ){
            if(number % i == 0){
                sum += i;
            }
        }
        if(showMessage) {
            System.out.println(Messages.SUM_OF_FACTOR + sum);
        }
        return sum;
    }

    private static void areFriendNumber(int num1, int num2){
        if(sumFactor(num1,false) == num2 && num1 == sumFactor(num2,false)){
            System.out.println(Messages.FRIEND_NUMBER + num1 + " " + num2 );
        } else{
            System.out.println(num1 + " " + num2 + " " + Messages.NOT_FRIEND_NUMBER);
        }
    }

    private static void testAreFriendNumber(){
        for(int i = MIN_VALUE_FOUR_DIGIT_NUMBER; i <= MAX_VALUE_FOUR_DIGIT_NUMBER ; i++ ){
            for(int j = MIN_VALUE_FOUR_DIGIT_NUMBER; j <= MAX_VALUE_FOUR_DIGIT_NUMBER; j++){
                areFriendNumber(i,j);
            }
        }
    }

    private static boolean isPerfectNum(int num){
        return num == sumFactor(num,false);
    }

    private static void findFourDigitsPerfectNum(){
        for (int i = MIN_VALUE_FOUR_DIGIT_NUMBER; i <= MAX_VALUE_FOUR_DIGIT_NUMBER ; i ++){
            if(isPerfectNum(i)){
                System.out.println(Messages.PERFECT_NUMBER + i);
            }
        }
    }
}
