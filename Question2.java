public class Question2 {

public static void main(String[] x) {

int a = 1900;
 boolean leap = false;

 if(a % 4 == 0)
  {
   if( a % 100 == 0)
  {
            
   if ( a % 400 == 0)
       leap = true;
          else
       leap = false;
            }
  else
      leap = true;
        }
        else
            leap = false;

        if(leap)
 System.out.println(a + " leap year.");
        else
  System.out.println(a + "not  leap  year.");
    }
}