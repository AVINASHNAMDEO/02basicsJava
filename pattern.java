public class pattern {
    public static void main(String[] args) {

        // Normal Pattern 1
    // for (int i = 0; i < 4; i++) {
    //     for (int j = 0; j < 4; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.print("\n");
        
//     // }


//Normal Pattern 2
// int n =3;
// int m = 4; 
//     for (int i = 0; i <= n; i++) {
//         for (int j = 0; j <= m; j++) {
//             if (i==0 || i==n ||j==0 || j==m) {
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             } 
//         }
//         System.out.println();
//     }


//Half Pyramid
// for (int i = 0; i < 4; i++) {
// for (int j = 0; j <= i; j++) {
//     System.out.print("*");
    
// }    
// System.out.println();
// }



//Inverted Half Pyramid
// int n=4;
// for (int i = n; i >= 0; i--) {
//     for (int j = 0; j<=i; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }



//Inverted Half Pyramid (rotate by 180deg)
// for (int i = 1; i <= n; i++) {
//    for (int j = 1; j <= n-i; j++) {
//     System.out.print(" ");
//    }
//    for (int j=1; j<=i; j++) {
//     System.out.print("*");
//    }
//    System.out.println();

// }

//Butterfly Pattern
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *


// int n = 4;
// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//     }
//     for (int j = 1; j<=2*(n-i); j++) {
//         System.out.print(" ");
//     }
//     for (int j = 1; j <=i; j++) {
//         System.out.print("*");
//     }
//     System.out.println();

// }
// for (int k=n; k>=1; k--) {
//     for (int j = 1; j <= k; j++) {
//         System.out.print("*");
//     }
//     for (int j = 1; j<=2*(n-k); j++) {
//         System.out.print(" ");
//     }
//     for (int j = 1; j <=k; j++) {
//         System.out.print("*");
//     }
//     System.out.println();

// }





// Solid rhombus                                                                  
// int n = 5;
// for (int i = 0; i <=n; i++) {
//     for (int j = n-i; j >=1; j--) {
//         System.out.print(" ");
//     }
//     for (int j = 1; j <=n; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }


// Number Pyramid
// int n =5;
// for (int i = 1; i <=n; i++) {
//     for (int j =1; j <=n-i; j++) {
//         System.out.print(" ");
//     }
//     for (int j = 1; j <=i; j++) {
//         System.out.print(i + " ");
//     }
//     System.out.println();
// }



// Palindromic Pattern
// int n=5;
// for (int i = 1; i <=n; i++) {
//     for (int j = 0; j <=n-i; j++) {
//         System.out.print(" ");
//     }
//     for (int j = i; j >= 1; j--) {
//         System.out.print(j);
//     }
//     for (int j = 2; j <=i; j++) {
//         System.out.print(j);
//     }
//     System.out.println();

// }


// Diamond Pattern
int n =5;
for (int i = 1; i <=n; i++) {
    for (int j = 1; j <=n-i; j++) {
   System.out.print(" ");     
    }
    for (int j = 1; j <2*(i-1); j++) {
        System.out.print("*");
    }
    System.out.println();
    
}
    for (int i = n; i >=1; i--) {
        for (int j = 1; j <=n-i; j++) {
       System.out.print(" ");     
        }
        for (int j = 1; j <2*(i-1); j++) {
            System.out.print("*");
        }
        System.out.println();
        
    }
        }
}
