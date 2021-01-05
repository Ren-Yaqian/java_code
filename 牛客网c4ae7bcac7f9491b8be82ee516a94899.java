import java.util.Scanner;

public class 牛客网c4ae7bcac7f9491b8be82ee516a94899 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int seconds = sca.nextInt();

        int sec = seconds % 60;
        int minutes = seconds / 60;
        int min = minutes % 60;
        int hou = minutes / 60;

        System.out.printf("%d %d %d\n", hou, min, sec);
    }
}
