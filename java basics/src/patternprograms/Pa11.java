package patternprograms;

public class Pa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k,rows=5;
        for (i = 1; i <= rows; i++)
        {
            for ( j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for ( k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
	}
}