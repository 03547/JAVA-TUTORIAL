/*

 * 
 * *
 * * *
 * * * *
 
 */
public class PrintPattern

{
    public static void main(String args[]) {

        int n = 4;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
