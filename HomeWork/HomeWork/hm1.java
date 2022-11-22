
/*
//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class hm1 {  
    public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in);   
      System.out.print("Please enter n: ");
      int n = iScanner.nextInt();
      int sum = 0;
      for(int i = 1; i < n; i++) {
        System.out.print(i + "+");
        sum += i;
      }
      sum += n;
      System.out.print(n + "=" + sum);
    }
  }
*/

  //2. Вывести все простые числа от 1 до 1000
  // Простые числа– это такие числа, которые делятся на себя и на единицу (например: 2, 3, 5, 7 и т. д.)
/* 
package HomeWork;
public class hm1 {
  public static void main(String[] args) {
    for(int i = 2; i <= 1000; i++) {
      boolean prime = true;
      for(int j = 2; j < i; j++){
        if(i % j == 0){
          prime = false;
          break;
        }
      }
      if(prime){
        System.out.println(i);
      }
    }
  }
}
*/

//3. Реализовать простой калькулятор

        
package HomeWork;
import java.util.Scanner;
public class hm1 {

public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    while(true){
      System.out.println("Choose operation");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      int number = iScanner.nextInt();
      int result;
      System.out.println("Input first number: ");
      int a = iScanner.nextInt();
      System.out.println("Input second number: ");
      int b = iScanner.nextInt();
      System.out.println("a: " + a);
      System.out.println("b: " + b);
      

      if (number == 1){
          result = a + b;
          System.out.println("Result:" + result);
      } else if (number == 2){
          result = a - b;
          System.out.println("Result:" + result);
      } else if (number == 3){
          result = a * b;
          System.out.println("Result:" + result);
      } else if (number == 4){
          if (b == 0){
          System.out.println("You can't divide by zero");
        }
            result = a / b;
            System.out.println("Result:" + result);
      } else {
        System.out.println("Error");
      }
      System.out.println("");

    }
  }
}


  

