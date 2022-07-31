import java.util.Scanner;

public class Excerise1 {
    public static void main(String[] args) {
        // WAP to calculated the percenteage in CBSE broad and in java
        System.out.println("You have to calculate your percentage for given exam marks");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Subject Marks");
        float num1 = s.nextFloat();
        System.out.println("Enter Second Subject Marks");
        float num2 = s.nextFloat();
        System.out.println("Enter Third Subject Marks");
        float num3 = s.nextFloat();
        System.out.println("Enter Fourth Subject Marks");
        float num4 = s.nextFloat();
        System.out.println("Enter fifth Subject Marks");
        float num5 = s.nextFloat();
        float sum = num1 + num2 + num3 + num4 + num5;
        System.out.print("Total Number is: ");
        System.out.println(sum);
        float Average = sum * 100 / 500;
        System.out.println(Average);
    }

}


