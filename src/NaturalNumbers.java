import java.util.Scanner;

public class NaturalNumbers {
    static void natural(int number)
    {

        if(number>1) {
            natural(number-1);
            System.out.print(" "+number+" ");
            if(number>2)
            {
                System.out.println('\n');
            }
        }

        else {
            System.out.print(1);
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        natural(number);
    }
}
