import java.util.*;

class exception{
    private String num1,num2;
    private int arr_size;
    Scanner sc = new Scanner(System.in); 
    public void Division(){
        try{
            
            System.out.println("----------Division Program----------\n");
            System.out.println("Enter value of numerator: ");
            num1 = sc.nextLine();
            int n1 = Integer.parseInt(num1);
            System.out.println("Enter value of dinominator: ");
            num2 =sc.nextLine();
            int n2 = Integer.parseInt(num2);
            int result = n1/n2;
            System.out.println("\nInputs were proper,so no exception occured and the result for division is "+result);
        }catch(ArithmeticException e){
            System.out.println("Exception : "+e);
            
        }
        catch(NumberFormatException n){
            System.out.println("Exception : "+n);
        }
    }

    public void array(){
        try{
        System.out.println("Enter the size of array : ");
        arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        System.out.println("Enter the index of the array where you want to add the element = ");
        int index = sc.nextInt();
        System.out.println("Enter value to change at the index "+index+" :" );
        int value = sc.nextInt();
        arr[index] = value;
        
        System.out.println("\nInputs were proper,so no exception occured and the Element added successfully!!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
            
        }
    }
    
    public  void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Age should 18 or more!!");
        }
        System.out.println("Valid age ");
        
    }
    
    public void elegible(){
        try{
        System.out.println("Enter age: ");
         
        int age = sc.nextInt();
        if (sc.hasNextLine()) sc.nextLine();
        checkAge(age);
        }catch(IllegalArgumentException e){
            System.out.println("Message: "+e);
        }
    }

}

class UserdefinedException extends Exception{
    public UserdefinedException(String msg){
        super(msg);
    }
}
class Main{
    public static void Validatename(String name) throws UserdefinedException {
        if (name == null || name.isEmpty()) {
            throw new UserdefinedException("Name cannot be empty!!");
        }
        System.out.println("Valid Name");
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int ch;
        exception ex = new exception();
        do{
            System.out.println("\n-------------Different Exceptions :-----------\n1.Arithmetic and Number Format Exception\n2.Array out of bounds Excepton\n3.Illegal Argument Exception(throw keyword)\n4.User defined Exception\n5.Exit\n");
            ch = sc.nextInt();
            switch( ch){
                case 1:
                    ex.Division();
                    break;

                case 2:
                    ex.array();
                    break;
                    
                case 3:
                    ex.elegible();
                    break;
                    
                case 4:
                    try{
                        String name ;
                        System.out.println("Enter Name: " );
                        sc.nextLine();
                        name = sc.nextLine();
                        Validatename(name);
                        
                    }catch(UserdefinedException e){
                        System.out.println("Exception caught: "+e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Exitted Successfully!!");
                    break;

                default:
                    System.out.println("Invalid choice!!");
                    break;
            }

        }while(ch!=5);
        sc.close();
    }
    
}