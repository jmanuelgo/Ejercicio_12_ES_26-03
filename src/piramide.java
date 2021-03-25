import java.util.Scanner;
public class piramide {
    public static void main(String[] args) {
        int i,j;
        Scanner read= new Scanner(System.in);
        System.out.println("ingrese un numero ");

        int b = read.nextInt();

       for(i=b;i>=1;i--)

        {

            for(j=i;j>=1;j--)

            {

                System.out.print(j+" ");

            }

           System.out.println("");

        }
    }
}
