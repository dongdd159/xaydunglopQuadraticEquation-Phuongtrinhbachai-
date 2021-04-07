import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class xaydunglopquadratic {
    public static void main(String[] args) {
        double delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = scanner.nextDouble();
        System.out.print("Enter b:");
        double b = scanner.nextDouble();
        System.out.print("Enter c:");
        double c = scanner.nextDouble();
        QuadraticEquation expression = new QuadraticEquation(a,b,c);
        if (expression.getDiscriminant()<0){
            System.out.println("The equation has no real roots");
        }else if (expression.getDiscriminant()==0){
            System.out.println("The equation has 1 root");
            System.out.println("x="+expression.doubleroot());
        }else {
            System.out.println("The equation has 2 roots ");
            System.out.println("x1="+expression.getRoot1());
            System.out.println("x2="+expression.getRoot2());
        }


    }
}
