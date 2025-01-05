import java.util.*;
class complex{
    private float real,imag;
    public complex(){
        System.out.println("Operations on Complex numbers!!");    
    }
    public complex(float a,float b){
        real= a;
        imag=b;
    }
    public complex add(complex c1,complex c2){
        return new complex(c1.real+c2.real,c1.imag+c2.imag);
    }


    public void display(){
        System.out.println(real+"+"+"i"+"("+imag+")");
    }

    public complex subtract(complex c1,complex c2){
        return new complex(c1.real - c2.real,c1.imag - c2.imag);
    }
}


public class Complex{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter real and imaginary part of first complex number: ");
        float a = s.nextFloat();
        float b = s.nextFloat();
        System.out.println("Enter real and imaginary part of second complex number: ");
        float c = s.nextFloat();
        float d = s.nextFloat();
        complex com = new complex();
        complex c1 = new complex(a,b);
        complex c2 = new complex (c,d);
        

    }
}