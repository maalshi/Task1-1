import java.util.Scanner;

public class Console {
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
   
    Scanner sc = new Scanner(System.in);
    System.out.println("������� ������ �����");
    int a = sc.nextInt();
    System.out.println("������� ������ �����");
    int b = sc.nextInt();
    System.out.println("������� ���� ��������");
    String op = sc.next();
    sc.close();
 
  int result = 0;
  if (op.equals("+"))
  {
	  result = a+b;
  }
  else if (op.equals("-")){
	  result = a-b;
  }
  else if (op.equals("*")){
	  result = a*b;
  }
  else if (op.equals("/")) {
	  result = a/b;
  }
	  	  
  System.out.println(result ) ;
  
  }
}
  
    