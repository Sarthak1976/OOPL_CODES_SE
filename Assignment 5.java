import java.util.Scanner;

interface vehicles{
   

    public void gearchange(int ng);
    public void speedup(double ns);
    public void applybrakes(); 
}

class bicycle implements vehicles{
    private int g;
    private double speed,newspeed;
    public bicycle(){
        g = 3;
        speed = 30;
        System.out.println("Initial Gear and Speed of Bicycle: \n");
        System.out.println("Gear : "+g+"\nSpeed : "+speed);
    }

    public void gearchange(int ng){
        if(ng < 0){
            System.out.println("Gear cant be changed to negative value!!\n");
            return;
        }
        if(ng > 6){
            System.out.println("Gear cant be changed to value greater than 6!!\n");
            return;
        }
        
        if(ng > g){
            System.out.println("Geared Up!!\n");
        }
        else if(ng == g){
            System.out.println("No change in Gear!!\n");
        }
        else{
            System.out.println("Geared Down!!\n");
        }
    }

    public void speedup(double ns){
        if(ns < 0){
            System.out.println("Speed cant be negative!!");
            return;
        }
        if(ns > 80){
            System.out.println("Speed cant be changed to value greater than 80!!\n");
            return;
        }
        newspeed = ns;
        if(ns > speed){
            System.out.println("Speed Up!!\n");
        }
        else if(ns == speed){
            System.out.println("No change in Speed!!\n");
        }
        else{
            System.out.println("Speed Decreased!!\n");
        }
    }

    public void applybrakes(){
        if(newspeed < speed){
            System.out.println("Brakes Applied!!");
        }
        else{
            System.out.println("Brakes not applied!!");
        }
    }
}

class bike implements vehicles{
    private int g;
    private double speed,newspeed;
    public bike(){
        g = 4;
        speed = 60;
        System.out.println("Initial Gear and Speed of Bike: \n");
        System.out.println("Gear : "+g+"\nSpeed : "+speed);
    }

    public void gearchange(int ng){
        if(ng < 0){
            System.out.println("Gear cant be changed to negative value!!\n");
            return;
        }
        if(ng > 5){
            System.out.println("Gear cant be changed to value greater than 5!!\n");
            return;
        }
        
        if(ng > g){
            System.out.println("Geared Up!!\n");
        }
        else if(ng == g){
            System.out.println("No change in Gear!!\n");
        }
        else{
            System.out.println("Geared Down!!\n");
        }
    }

    public void speedup(double ns){
        if(ns < 0){
            System.out.println("Speed cant be negative!!");
            return;
        }
        if(ns > 100){
            System.out.println("Speed cant be increased to value greater than 100!!\n");
            return;
        }
        newspeed = ns;
        if(ns > speed){
            System.out.println("Speed Up!!\n");
        }
        else if(ns == speed){
            System.out.println("No change in Speed!!\n");
        }
        else{
            System.out.println("Speed Decreased!!\n");
        }
    }

    public void applybrakes(){
        if(newspeed < speed){
            System.out.println("Brakes Applied!!");
        }
        else{
            System.out.println("Brakes not applied!!");
        }
    }
}

class car implements vehicles{
    private int g;
    private double speed,newspeed;
    public car(){
        g = 5;
        speed = 90;
        System.out.println("Initial Gear and Speed of Car: \n");
        System.out.println("Gear : "+g+"\nSpeed : "+speed);
    }

    public void gearchange(int ng){
        if(ng < 0){
            System.out.println("Gear cant be changed to negative value!!\n");
            return;
        }
        if(ng > 6){
            System.out.println("Gear cant be changed to value greater than 6!!\n");
            return;
        }
        
        if(ng > g){
            System.out.println("Geared Up!!\n");
        }
        else if(ng == g){
            System.out.println("No change in Gear!!\n");
        }
        else{
            System.out.println("Geared Down!!\n");
        }
    }

    public void speedup(double ns){
        if(ns < 0){
            System.out.println("Speed cant be negative!!");
            return;
        }
        if(ns > 130){
            System.out.println("Speed cant be increased to value greater than 130!!\n");
            return;
        }
        newspeed = ns;
        if(ns > speed){
            System.out.println("Speed Up!!\n");
        }
        else if(ns == speed){
            System.out.println("No change in Speed!!\n");
        }
        else{
            System.out.println("Speed Decreased!!\n");
        }
    }

    public void applybrakes(){
        if(newspeed < speed){
            System.out.println("Brakes Applied!!");
        }
        else{
            System.out.println("Brakes not applied!!");
        }
    }
}

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int ng;
        double ns;
        
        
        
        System.out.println("\n-------------PROGRAM TO SHOW CHANGE IN VEHICLE GEAR AND SPEED-----------------\n");
        int ch;
        do{
            System.out.println("\nChoose Vehicle\n1.Bicycle\n2.Bike\n3.Car\n4.Exit\n");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    bicycle b = new bicycle();
                    System.out.println("");
                    System.out.println("Enter the value of new speed of Bicycle: ");
                    ns = sc.nextDouble();
                    System.out.println("Enter the value of new gear of Bicycle: ");
                    ng = sc.nextInt();
                    System.out.println("");
                    b.speedup(ns);
                    b.gearchange(ng);
                    b.applybrakes();
                    break;

                case 2:
                    bike m = new bike();
                    System.out.println("");
                    System.out.println("Enter the value of new speed of Bike: ");
                    ns = sc.nextDouble();
                    System.out.println("Enter the value of new gear of Bike: ");
                    ng = sc.nextInt();
                    m.gearchange(ng);
                    m.speedup(ns);
                    m.applybrakes();
                    break;
                case 3:
                    car c = new car();
                    System.out.println("");
                    System.out.println("Enter the value of new speed of Car: ");
                    ns = sc.nextDouble();
                    System.out.println("Enter the value of new gear of Car: ");
                    ng = sc.nextInt();
                    c.gearchange(ng);
                    c.speedup(ns);
                    c.applybrakes();
                    break;
                case 4:
                    System.out.println("Exitted successfully!!");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }

        }while(ch != 4);
        sc.close();

    }
}