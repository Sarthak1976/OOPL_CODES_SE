import java.util.*;
class publication{
    public String title,author,Curr;
    public int price,copies ;
    Scanner s =new Scanner(System.in);
    public void Gettitle(){
        String T;
        System.out.println("Enter Name of Publication :");
        title = s.nextLine();
        
    }
    public void display(){
        System.out.println("Disply");
    }
    public void qty(){
        int p,c;
        
        System.out.println("Enter Price and number of copies : ");
        p=s.nextInt();
        c=s.nextInt();
        if(price>0){
            price=p;
            copies=c;
        }
        else{
            System.out.println("Enter Valid Price!!");
            return;
        }
    }
    public void sellCopy(){
        System.out.println("Sell of Publication!!");
    }
    public void setauthor(){
        System.out.println("Name of the Author : ");
        author = s.nextLine();
        
    }
    public void setcurrissue(){
        String c;
        System.out.println("Current issue : ");
        c=s.nextLine();
        c= Curr;
    }
}
class Book extends publication{
    public void Gettitle(){
        System.out.println("Enter Name of Book :");
        this.title= s.nextLine();
    }
    public void setauthor(){
        String st;
        System.out.println("Name of the Author : ");
        st = s.nextLine();
        this.author=st ;
    }
    public void sellCopy(){
        System.out.println("Sell of Books : "+price*copies);
    }
    public void qty(){
        int p,c;
        
        System.out.println("Enter Price and number of copies of Book : ");
        p=s.nextInt();
        c=s.nextInt();
        if(price<=0){
            price=p;
            copies=c;
        }
        else{
            System.out.println("Enter Valid Price!!");
            return;
        }
    }
    
    public void display(){
        System.out.println("Name of Book : "+title);
        System.out.println("Author of Book : "+author);
        System.out.println("Price of each Book : "+price);
        System.out.println("Quantity of Books Sold : "+copies);
    }


}
class Magazine extends publication{
     public void Gettitle(){
        
        System.out.println("Enter Name of Magazine :");
        title= s.nextLine();
        
    }
    public void display(){
        System.out.println("Name of Magazine : "+title);
        System.out.println("Price of each Magazine : "+price);
        System.out.println("Quantity of Magazine Sold : "+copies);
    }
    public void setauthor(){
        String st;
        System.out.println("Name of the Author : ");
        st = s.nextLine();
        author=st;
    }
    public void sellCopy(){
        System.out.println("Sell of Magazine : "+price*copies);
    }
    public void qty(){
        int p,c;
        
        System.out.println("Enter Price and number of copies of Magazine : ");
        p=s.nextInt();
        c=s.nextInt();
        if(price<=0){
            price=p;
            copies=c;
        }
        else{
            System.out.println("Enter Valid Price!!");
            return;
        }
    }
}
public class Main{
    public static void main(String [] args){
        publication pub = new publication();
        publication b = new Book();
        publication m = new Magazine();
        pub.Gettitle();
        pub.sellCopy();
        b.Gettitle();
        b.setauthor();
        b.qty();
        b.display();
        b.sellCopy();
        m.Gettitle();
        m.setauthor();
        m.qty();
        m.display();
        m.sellCopy();
    }
}