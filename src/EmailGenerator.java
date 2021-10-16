import java.util.Scanner;
public class EmailGenerator {

    public static String makeUseName(String name) {
        int i = name.indexOf(" ");
        String a = name.substring(0,1) + name.substring(i+1);
        int rand = (int)(Math.random()*90)+10;
        name = a.toLowerCase() + rand;
        return name;
    }

    public static String makeEmail(String Username, String form){
         return Username + "@" + form;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String a = scan.nextLine();
        System.out.println("Enter your last name: ");
        String b = scan.nextLine();
        String name = a + " " + b;
        makeUseName(name);
        System.out.println("Enter the email provider: ");
        String form = scan.nextLine();;
        System.out.println(makeEmail(makeUseName(name),form));
    }






}
