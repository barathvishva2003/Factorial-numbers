import java.util.Scanner;
class solution
{
    private static int fact_help(int num)
    {
         if(num==2) return num;
         return num*fact_help(num-1);
    }
    public static int fact(int num)
    {
        if(num<0) return -99;
        if(num==1||num==0) return 1;
        return fact_help(num);
    }
}
class Factorial
{
    public static void main(String[]args)
    {
        Scanner ip= new Scanner(System.in);
        System.out.print("Enter the value : ");
        int num = ip.nextInt();
        int res=solution.fact(num);
        if(res==-99)
        System.out.print("Invalid input");
        else
        System.out.print(res);

    }
}