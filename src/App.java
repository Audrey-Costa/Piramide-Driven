import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int rolls;

        System.out.printf("Informe o número de linhas: ");
        rolls = reader.nextInt();

        for (int roll = 1; roll < rolls + 1; roll++){
            for (int i = 1; i < roll; i++){
                System.out.print(roll);
            }
            System.out.println(roll);
        }
    }
}
