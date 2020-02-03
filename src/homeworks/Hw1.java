package homeworks;

public class Hw1 {
    public static void homeWorkOnePointOne() {
        int []number = new int[3];
        int i = 0;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter three numbers:");
        for(i=0;i<3;i++)
        {
            number[i] = Integer.parseInt(kb.nextLine());
        }
        System.out.println(orderNumber(number));
        kb.close();

    }

    private static StringBuffer orderNumber(int[] array){
        StringBuffer strBuff = new StringBuffer();

        if(array[0]>array[1] && array[0]>array[2]){
            if (array[2]>array[1]) {
                strBuff.append(array[0] + ">" + array[2] + ">" + array[1]);
            }
            else if (array[1]>array[2]) {
                strBuff.append(array[0] + ">" + array[1] + ">" + array[2]);
            }
            else {
                strBuff.append(array[0] + ">" + array[1] + "=" + array[2]);
            }
        }
        else if(array[1]>array[0] && array[1]>array[2]){
            if (array[2]>array[0]) {
                strBuff.append(array[1] + ">" + array[2] + ">" + array[0]);
            }
            else if (array[0]>array[2]) {
                strBuff.append(array[1] + ">" + array[0] + ">" + array[2]);
            }
            else {
                strBuff.append(array[1] + " > " + array[0] +" = " + array[2]);
            }
        }
        else if(array[2] > array[0] && array[2] > array[1]){
            if (array[1]>array[0]) {
                strBuff.append( array[2]+ " > " + array[1] +" > " + array[0]);
            }
            else if(array[0]>array[1]) {
                strBuff.append(array[2] + " > " + array[0] +" > " + array[1]);
            }
            else {
                strBuff.append(array[2] + " > " + array[0] +" = " + array[1]);
            }
        }
        else
        {
            strBuff.append(array[0] + "=" + array[1] + "=" + array[2]);
        }

        return strBuff;
    }
    public static void homeWorkOnePointTwo(){
        int[] x = new int[3];
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i = 0;
        System.out.println("For exit press -1");
        while(true) {
            x[i] = Integer.parseInt(kb.nextLine());
            if(x[i] == -1) {
                break;
            }
            i++;
            if(i == 3) {
                System.out.println("MidVal:" + mid(x));
            }
        }
        kb.close();
    }
    private static int mid(int[] x){
        int temp = 0;

        for(int i = 0; i < x.length - 1; i++) {
            for(int j = 0; j < x.length - i - 1; j++) {
                if(x[j] > x[j + 1]){
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j] = temp;
                }
            }
        }

        return x[1];
    }
    public static void homeWorkOnePointThree(){
        int x;
        int pressCount = 0;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("For exit press twice '-1' ");

        while(true) {
            x = Integer.parseInt(kb.nextLine());
            if(x == -1){
                pressCount++;
                if(pressCount == 2) {
                    break;
                }
            }
            System.out.println("RetVal: " + signum(x));
        }
        kb.close();
    }
    private static int signum(int x){
        int retVal = 0;

        if(x>0) {
            retVal = 1;
        }
        else if (x<0){
            retVal = -1;
        }
        else {
            retVal = 0;
        }
        return retVal;
    }

}
