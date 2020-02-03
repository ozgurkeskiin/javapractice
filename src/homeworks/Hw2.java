package homeworks;

public class Hw2 {
    public void printDiamond() {
        int size;

        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter the size");
        size = Integer.parseInt(kb.nextLine());
        if(size > 0) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= 2 * i - 2; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int m = 0; m < size; m++) {
                for (int n = 0; n < m; n++) {
                    System.out.print(" ");
                }
                for (int z = m * 2; z < size * 2 - 1; z++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid input. You have to enter positive number!");
        }
        kb.close();
    }

    public void homeworkTwoPointTwo(){
        Long number;

        java.util.Scanner kb = new java.util.Scanner(System.in);
        number = Long.getLong(kb.nextLine());
        displayDuration(number);
        kb.close();
    }
    public void displayDuration(Long time) {
        int hour;
        int min;
        int sec;

    }
}
