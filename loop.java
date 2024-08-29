import java.util.*;

public class loop {

  public static void main(String[] args) {

    // for (int i = 0; i < 20; i++) {
    //     System.out.println("hello");
    //     System.out.println(i);
    // }
// int i = 0;
//     while (i<11) {
//        System.out.println("hello");
//        System.out.println(i);
//        i++; 
//     }

// int i = 0;
// do {
//     System.out.println("hello");
//     System.out.println(i);
//     i++;
// } while (i<11);

Scanner hello = new Scanner(System.in);

int n = hello.nextInt();
int sum =0;
for (int i = 0; i <= n; i++) {
    sum = sum+i;
}
System.out.println(sum);

int num = hello.nextInt();
for (int i = 1; i < 11; i++) {
    System.out.println(num*i);
    
hello.close();
}
  }  
}
