import java.util.Scanner;

class employee{
    Scanner sc = new Scanner(System.in);
    protected String empname,empadd,empid,empmail,empmob,post;
    protected double bp,hra,pf,scf,da,gs,ns;

    public void setdetails(){
        System.out.println("Enter Employee Name: ");
        empname = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        empid = sc.nextLine();
        System.out.println("Enter Employee Address: ");
        empadd = sc.nextLine();
        System.out.println("Enter Employee Mail-id: ");
        empmail = sc.nextLine();
        System.out.println("Enter Employee Mobile: ");
        empmob = sc.nextLine();
        
    }

    public void getdetails(){
        System.out.println(" Employee Name: "+empname);
        System.out.println(" Employee ID: "+empid);
        System.out.println(" Employee Address: "+empadd);
        System.out.println(" Employee Mail-id: "+empmail);
        System.out.println(" Employee Mobile: "+empmob);
    }

    public void setbasicpay(){

    }

    public void cal(){
        da = 0.97 * bp;
        hra = 0.1 * bp;
        pf = 0.12 * bp;
        scf = 0.001 * bp;
        gs = bp+da+hra+pf+scf;
        ns = gs - (pf+scf);
    }

    public void payslip(){
        System.out.println("----------PAYSLIP OF "+post+" --------------");
        System.out.println("");
        System.out.println("Basic Pay: "+bp);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("PF: "+pf);
        System.out.println("SCF: "+scf);
        System.out.println("");
        System.out.println("Gross Salary: "+gs);
        System.out.println("Net Salary: "+ns);
    }
}

class programmer extends employee{
    public void setbasicpay(){
    post = "PROGRAMMER";
    
    System.out.println("Enter Basic Pay for Programmer : ");
    bp = sc.nextDouble();
    }
}

class Team_lead extends employee{
    public void setbasicpay(){
    post = "TEAM LEAD";
    System.out.println("Enter Basic Pay for Team Lead : ");
    bp = sc.nextDouble();
    }
}

class Assistant_Project_Manager extends employee{
    public void setbasicpay(){
    post = "ASSISTANT PROJECT MANAGER";
    System.out.println("Enter Basic Pay for Assistant Project Manager : ");
    bp = sc.nextDouble();
    }
}

class Project_Manager extends employee{
    public void setbasicpay(){
    post = "PROJECT MANAGER";
    System.out.println("Enter Basic Pay for Project Manager : ");
    bp = sc.nextDouble();

    }
}

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        employee e = new employee();
        employee p = new programmer();
        employee tl = new Team_lead();
        employee apm = new Assistant_Project_Manager();
        employee pm = new Project_Manager();
        e.setdetails();
       
        System.out.println("");
        p.setbasicpay();
        p.cal();
        
        tl.setbasicpay();
        tl.cal();
        apm.setbasicpay();
        apm.cal();
        pm.setbasicpay();
        pm.cal();
        System.out.println("");
        e.getdetails();
        
        System.out.println("Here are some payslips for different roles-->");
        System.out.println("");
        p.payslip();
        System.out.println("");
        tl.payslip();
        System.out.println("");
        apm.payslip();
        System.out.println("");
        pm.payslip();
        sc.close();



    }
}

