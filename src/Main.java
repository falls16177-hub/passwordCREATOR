import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Password;

        while (true){
            System.out.print("Enter your Password: ");
            Password = input.nextLine();
            if (Password.length() >=6){
                System.out.println("Your Password is accepted");
                break;
            } else System.out.println("Your Password is too short try again");
        }
    }
}