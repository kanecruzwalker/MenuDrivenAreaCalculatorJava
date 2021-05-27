import java.util.Scanner;

public class Main {

    public static void getTriangle(int b  , int h){
        double area = b * h * .5;
        System.out.println("With a base of " + b + " & a height of " + h);
        System.out.println("The triangle has an area of " + area);
    }

    public static void getRectangle(int l  , int w){
        double area = l * w ;
        System.out.println("With a lenght of " + l + " & a width of " + w);
        System.out.println("The rectangle has an area of " + area);
    }

    public static void getCircle(int radius){
        double area = 3.14 * radius * radius ;
        System.out.println("With a radius of " + radius);
        System.out.println("The circle has an area of " + area);
    }

    public static int getRadius(){
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt();

        while (userInput < 0){
            System.out.println("Please enter a radius greater than 0");
            userInput = scnr.nextInt();
        }
        return userInput;
    }


    public static int userIntInput(){
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt();

        while (userInput < 1 || userInput > 4){
            System.out.println("Please enter a number 1-4");
            userInput = userIntInput();
        }
        return userInput;
    }

    public static void mainMenu(){
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit");
    }

    public static void main(String[] args) {
        System.out.println("        Geometry Calculator");
        mainMenu();

        int menu1choice = userIntInput();

        int radius;
        int length;
        int width;
        int base;
        int height;

        switch (menu1choice){
            case 1 :
                System.out.println("You would like to calculate the area of a Circle");
                System.out.println("The following equation will be used area = pi * r * r");
                System.out.println("Please enter the radius of the circle");
                Scanner scnr = new Scanner(System.in);
                radius = scnr.nextInt();

                while (radius < 0){
                    System.out.println("Please enter a radius greater than 0");
                    radius = scnr.nextInt();
                }
                getCircle(radius);
                break;
            case 2 :
                Scanner recScnr = new Scanner(System.in);
                System.out.println("2 was selected");
                System.out.println("You would like to calculate the area of a Rectangle");
                System.out.println("The following equation will be used area = length * width");
                System.out.println("Please enter the length of the rectangle");
                length = recScnr.nextInt();

                while (length < 0){
                    System.out.println("Please enter a length greater than 0");
                    length = recScnr.nextInt();
                }

                System.out.println("Please enter the width of the rectangle");
                width = recScnr.nextInt();


                while (width < 0){
                    System.out.println("Please enter width greater than 0");
                    width = recScnr.nextInt();
                }

                getRectangle(length , width);
                break;
            case 3 :
                Scanner triScnr = new Scanner(System.in);
                System.out.println("You would like to calculate the area of a Triangle");
                System.out.println("The following equation will be used area = base * height * .5");
                System.out.println("Please enter the base of the triangle");
                base = triScnr.nextInt();

                while (base < 0){
                    System.out.println("Please enter a length greater than 0");
                    base = triScnr.nextInt();
                }

                System.out.println("Please enter the width of the rectangle");
                height = triScnr.nextInt();


                while (height < 0){
                    System.out.println("Please enter width greater than 0");
                    height = triScnr.nextInt();
                }

                getTriangle(base , height);
                break;
            case 4 :
                System.exit(0);
                System.out.println("End of  program");
            default :
                System.out.println("I'm sorry, something went wrong. Please restart the program");
        }
    }
}
