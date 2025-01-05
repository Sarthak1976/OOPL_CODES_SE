import java.util.*;

class Publication{
    protected String title,author;
    protected double price;
    protected int copies;

    public double  sale(){return price * copies;}
    public void setdetails(){}
    public void getdetails(){}
}

class book extends Publication{
    public void setdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        title = sc.nextLine();
        System.out.println("Enter Author  Name: ");
        author = sc.nextLine();
        System.out.println("Enter Book price: ");
        price = sc.nextDouble();
        System.out.println("Enter number of Book copies sold: ");
        copies = sc.nextInt(); 
    }
    public double  sale(){
        return price * copies;
    } 
    public void getdetails(){
        System.out.println("Book Name: "+title);
        System.out.println("Author Name: "+author);
        System.out.println("Book price : "+price);
        System.out.println("Number of copies sold: "+copies);
        System.out.println("Sale of Books: "+sale());
    }


}

class magazine extends Publication{
    public void setdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Magzine Name: ");
        title = sc.nextLine();
        System.out.println("Enter Author  Name: ");
        author = sc.nextLine();
        System.out.println("Enter Magzine price: ");
        price = sc.nextDouble();
        System.out.println("Enter number of Magzine copies sold: ");
        copies = sc.nextInt(); 
    }
    public double  sale(){
        return price * copies;
    } 
    public void getdetails(){
        System.out.println("Magzine Name: "+title);
        System.out.println("Author Name: "+author);
        System.out.println("Magzine price : "+price);
        System.out.println("Number of copies sold: "+copies);
        System.out.println("Sale of Magzines: "+sale());
    }
}

public class Main{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Publication b = new book();
        Publication m = new magazine();
        System.out.println("Enter Information  related to Book Sale: ");
        System.out.println();
        b.setdetails();
        System.out.println();
        System.out.println("Enter Information  related to Magzine Sale: ");
        m.setdetails();

        int ch;
        do{
        System.out.println("\nMenu\n1.Book Sale\n2.Magzine Sale\n3.Total Publication Sale\n4.Exit\n");
        ch = s.nextInt();
        switch(ch){
            case 1:
                b.getdetails();
                break;
            case 2:
                m.getdetails();
                break;
            case 3:
                System.out.println("Total Publication Sale is "+(b.sale()+m.sale()));
                break;
            case 4:
                System.out.println("Exitted Successfully!!\n");
                break;
            default:
                System.out.println("Invalid choice!!\n");
                break;
        }
        }while(ch!=4);
        s.close();
    }
    
}
