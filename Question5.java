public class Question5
{
public static void main(String[] x)
{
int n,rev=0,rem;
int num=121;
n=num;
while(num!=0)
{
rem=num%10;
rev=rev*10+rem;
num /= 10;
}
if(n==rev)
{
System.out.println(n + "paliandrome");
}
else
{
System.out.println(n + "not paliandrome");
}

}

}