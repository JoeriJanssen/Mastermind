import java.util.Scanner;

public class User {
    //User vult een woord in
    public String tryWord(){
        Scanner scanner = new Scanner(System.in);
        String woord = scanner.nextLine();
        return woord;
    }
}
