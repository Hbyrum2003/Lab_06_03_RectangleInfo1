import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        double sideA =0;
        double sideB = 0;
        double area;
        double diagonalA;
        double diagonal;
        String trash="";
        double perimeter;
        Scanner rectangle = new Scanner(System.in);
        System.out.println("What is the value of Side A?");
        if (rectangle.hasNextDouble()){
            sideA = rectangle.nextDouble();
            rectangle.nextLine();

        }
        else {
            trash =rectangle.nextLine();
            System.out.println("Enter a valid input");
            System.exit(0);
        }
        System.out.println("What is the value of side B?");
        if(rectangle.hasNextDouble()){
            sideB = rectangle.nextDouble();
        } else
        {
            trash=rectangle.nextLine();
            System.out.println("Please input a valid response");
            System.exit(0);
        }
        area = sideA * sideB;
        perimeter = 2*sideA + 2*sideB;
        diagonalA = Math.pow(sideA,2) + Math.pow(sideB,2);
        diagonal = Math.sqrt(diagonalA);
        System.out.println("The area is  : " +area);
        System.out.println("The perimeter is : " + perimeter);
        System.out.println("The diagonal length is: " + diagonal);
    }
}
