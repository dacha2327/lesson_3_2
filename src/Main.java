import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("PLease your name");
            String name = scanner.next();
            try{
                user.setName(name);
                System.out.println("Nice. Your name is: " + user.getName());
                System.out.println("Please your age ");
                Integer age = scanner.nextInt();
                user.setAge(age);
                System.out.println("Nice. Your age is: ");
            }
            catch (IllegalNameLenghtException ie){
                System.out.println(ie.getMessage());
            }catch (IllegalAgeException iee){
                System.out.println(iee.getMessage());
            }
        }
    }
}