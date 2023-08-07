import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=(a>b)?a:b;
        System.out.println("Greatest integer is:");
        System.out.println(k);
    }
}
