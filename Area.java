import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int radius=sc.nextInt();
        float a=3.14f*(radius*radius);
        int c=l*b;
        System.out.println("area of rectangle is"+c);
        System.out.println("area of circle is"+a);
        
        
    }
}
