public class Question7
{
public static void main(String[] x)
{
int n,rev=0,rem;
int num=123;
n=num;
while(num!=0)
{
rem=num%10;
rev=rev*10+rem;
num /= 10;
}

System.out.println("reverse of number is " + rev);

}

}