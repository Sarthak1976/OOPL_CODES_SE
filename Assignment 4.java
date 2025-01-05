import java.util.Scanner;

class shape{
    Scanner sc = new Scanner(System.in);
    protected double s1,s2,area;


    public void takeinput(){
        System.out.println("Enter dimension of Side 1: ");
        s1 = sc.nextDouble();
        System.out.println("Enter dimension of Side 2: ");
        s2 = sc.nextDouble();
    }

    public void computearea(){
        
    }

    public void display(){
        System.out.println("Area :"+area);
    }
}

class triangle extends shape{
    public void takeinput(){
        System.out.println("Enter dimension of Height of Triangle: ");
        s1 = sc.nextDouble();
        System.out.println("Enter dimension of Base of Triangle: ");
        s2 = sc.nextDouble();
    }

    public void computearea(){
        area = 0.5*s1*s2;
    }

    public void display(){
        System.out.println("Area of Triangle :"+area);
    }
}

class rectangle extends shape{
    public void takeinput(){
        System.out.println("Enter dimension of Length of Rectangle: ");
        s1 = sc.nextDouble();
        System.out.println("Enter dimension of Breadth of Rectangle: ");
        s2 = sc.nextDouble();
    }

    public void computearea(){
        area = s1*s2;
    }

    public void display(){
        System.out.println("Area of Rectangle :"+area);
    }
}

public class assignment4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int ch;
        shape s = new shape();
        shape t = new triangle();
        shape r = new rectangle();
        do{
        System.out.println("\nMENU\n1.Area of Triangle\n2.Area of Rectangle\n3.Exit\n");
        ch = sc.nextInt();

        switch(ch){
            case 1:
                t.takeinput();
                t.computearea();
                t.display();
                break;

            case 2:
                r.takeinput();
                r.computearea();
                r.display();
                break;
            
            case 3:
                System.out.println("Exitted Successfully!!");
                break;

            default:
                System.out.println("Invalid Choice!!");
                break;

        }
        }while(ch!=3);

        sc.close();
    }
}

