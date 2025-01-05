import java.util.*; 
class complex{
    private float real,imag;

    public complex(){


    }

    public complex(float real , float imag){
        this.real = real;
        this.imag = imag;
    }

    public complex add(complex c1,complex c2){
        complex sum = new complex();
        sum.real = c1.real + c2.real;
        sum.imag = c1.imag + c2.imag;
        return sum;
    }

    public complex sub(complex c1,complex c2){
        complex dif = new complex();
        dif.real = c1.real - c2.real;
        dif.imag = c1.imag - c2.imag;
        return dif;
    }

    public complex mul(complex c1,complex c2){
        complex prod = new complex();
        prod.real = c1.real*c2.real - c1.imag * c2.imag;
        prod.imag = c1.imag*c2.real + c2.imag*c1.real;
        return prod;
    }

    public complex div(complex c1,complex c2){
        complex quo = new complex();
        quo.real = ((c1.real*c2.real)+(c1.imag*c2.imag))/(c2.real*c2.real+c2.imag*c2.imag);
        quo.imag = ((c1.imag*c2.real) - (c1.real*c2.imag))/(c2.real*c2.real+c2.imag*c2.imag);
        return quo;
    }

    public void display(){
        System.out.println(real+" + "+" i "+"("+imag+")");
    } 

}

public class assignment1{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    float a,b,c,d;
    System.out.println("Enter Real and Imaginary part of 1st complex number: ");
    a = sc.nextFloat();
    b = sc.nextFloat();
    System.out.println("Enter Real and Imaginary part of 2nd complex number: ");
    c = sc.nextFloat();
    d = sc.nextFloat();
    complex c1 = new complex(a,b);
    complex c2 = new complex(c,d);
    complex result = new complex();
    int ch;
    do{
        System.out.println("\nMenu\n1.Addition \n2.Subtraction\n3.Mutiplication\n4.Division\n5.Exit\n");
        ch = sc.nextInt();
        System.out.println();
        switch(ch){
            case 1:
                result = result.add(c1,c2);
                result.display();
                break;
            case 2:
                result = result.sub(c1,c2);
                result.display();
                break;
            case 3:
                result = result.mul(c1,c2);
                result.display();
                break;
            case 4:
                result = result.div(c1,c2);
                result.display();
                break;
            case 5:
                System.out.println("Exitted successfully!!");
                break;
            default:
                System.out.println("Invalid chaoice!!");
                break;
        }
    }while(ch!=5);

    sc.close();
    }

}