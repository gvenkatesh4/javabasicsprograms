package ww;

import java.util.Scanner;

public class Dateofbirthbyluckunumber {
	
	public static void main(String[] args) {
		
		int n, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
              int   r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            System.out.println(sum);
            num = sum;
            System.out.println(num);
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }
    }
}