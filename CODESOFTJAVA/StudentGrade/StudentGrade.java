import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        float avg;
        int total;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained in English:");
        int English = sc.nextInt();
        System.out.println("Enter marks obtained in DBMS:");
        int DBMS = sc.nextInt();
        System.out.println("Enter marks obtained in Java Programming:");
        int Java = sc.nextInt();
        System.out.println("Enter marks obtained in Mathematics:");
        int Maths = sc.nextInt();
        System.out.println("Enter marks obtained in Physics:");
        int Physics = sc.nextInt();
        System.out.println("Enter marks obtained in Graphics:");
        int Graphics = sc.nextInt();

        total = English + DBMS + Java + Maths + Physics + Graphics;
        avg = (float) total / 6;

        if (avg < 100 && avg >= 90) {
            System.out.println("Your grade : O ");
        } else if (avg < 90 && avg >= 80) {
            System.out.println("Your grade : A+ ");
        } else if (avg < 80 && avg >= 70) {
            System.out.println("Your grade : A ");
        } else if (avg < 70 && avg >= 60) {
            System.out.println("Your grade : B+ ");
        } else if (avg < 60 && avg >= 50) {
            System.out.println("Your grade : B ");
        } else if (avg < 50 && avg >= 40) {
            System.out.println("Your grade : C ");
        } else if (avg < 40 && avg >= 30) {
            System.out.println("Your grade : D ");
        } else {
            System.out.println("Your grade : F ");
        }
        
        System.out.println("Your total is: " +total);
        System.out.println("Your average is: " +avg); 

        sc.close();
    }
}