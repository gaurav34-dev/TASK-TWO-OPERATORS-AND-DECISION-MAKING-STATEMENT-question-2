import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while(true)
      {
  System.out.println("Enter 1 - Addition");
  System.out.println("Enter 2 - Subtraction");
  System.out.println("Enter 3 - Division");
  System.out.println("Enter 4 - Multiplication");
  System.out.println("Enter 5 - Average");
  Scanner s =new Scanner(System.in);
    int m=s.nextInt();
    if(m>0 && m<6)
    {
    System.out.println("enter 2 numbers");
    int a=s.nextInt();
    float b=s.nextInt();
    int expression=m;
   switch(expression) {
  case 1:
    System.out.println(a+b);
    break;
  case 2:
    System.out.println(a-b);
    break;
  case 3:
    System.out.println(a/b);
    break;
  case 4:
    System.out.println(a*b);
    break;
  case 5:
    System.out.println((a+b)/2.0);
    break;
  //default:
    //System.out.println("negative number comming");
    //break;
   }
}
        else if(m<0){
         System.out.println("negative number comming"); 
        }
        else
          {
          System.out.println("number is greater than 5 this option is not allowed to enter");
          }
}
}
}


