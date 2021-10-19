import java.util.Scanner;


public class Marsgame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is Your Name ?: ");

        String name = input.nextLine();
        System.out.println("Your name is: " + name);


        System.out.println("What is Your Age ?: ");
        String age = input.nextLine();
        System.out.println("Your age is: " + age);


        System.out.println("What color would your spacesuit be ?");
        String color = input.nextLine();
        System.out.println("Your spacesuit is of "+ color + " color");

        System.out.println("Who would you bring with you? ");
        String company = input.nextLine();
        System.out.println("Your Would bring your  "+ company);

        System.out.println("What Food Will you bring ?");
        String food = input.nextLine();
        System.out.println("You will bring " + food);
    }
    
}
