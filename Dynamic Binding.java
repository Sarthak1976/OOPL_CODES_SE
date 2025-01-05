// import java.util.Scanner;
// class shape{
//     double a,b;

//     void take_input(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value of side 1: ");
//         this.a = sc.nextDouble();
//         System.out.println("Enter value of side 2: ");
//         this.b = sc.nextDouble();
//     }

//     void compute_area(){

//     }
// }

// class triangle extends shape{
//     void take_input(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value of Height of Trinangle: ");
//         this.a = sc.nextDouble();
//         System.out.println("Enter value of Base of Triangle: ");
//         this.b = sc.nextDouble();
//     }
//     void compute_area(){
//         System.out.println("Area of Triangle is "+ (0.5*a*b));
//     }
// }

// class rectangle extends shape{
//     void take_input(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value of Length of Rectangle: ");
//         this.a = sc.nextDouble();
//         System.out.println("Enter value of Breadth of Rectangle: ");
//         this.b = sc.nextDouble();
//     }
//     void compute_area(){
//         System.out.println("\nArea of Rectangle is "+ (a*b));
//     }
// }

// public class Main{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int choice;
//         do{
//         System.out.println("\nSelect the Shape out of the following to determine its area : \n1. Triangle \n2. Rectangle\n3. Exit\n");
//         choice = sc.nextInt();
//         switch(choice){
//             case 1:
//                 shape t = new triangle();
//                 t.take_input();
//                 t.compute_area();
//                 break;

//             case 2:
//                 shape r = new rectangle();
//                 r.take_input();
//                 r.compute_area();
//                 break;
            
//             case 3:
//                 System.out.println("Exitted Successfully!!");
//                 break;

//             default:
//                 System.out.println("Invalid Choice!!");
//         }
//         }while(choice != 3);
        
//         sc.close();
//     }
// }