import java.util.ArrayList;
import java.util.Scanner;

class customer
{
    int tea=10;
    int coffee=8;
    int snacks=10;
    int idali=8;
    int dosa=6;
    String name;
    long PhoneNo;
    int total;

    public customer()
    {

    }

    public customer(String name, long phoneNo) {
        this.name = name;
        PhoneNo = phoneNo;
    }
   public void  Tea(int count)
    {

        this.tea = this.tea * count;
        System.out.println("total"+this.tea);

    }
    public void Coffee(int count)
    {
        this.coffee=this.coffee*count;
        System.out.println("total"+this.coffee);

    }
    public void snacks(int count)
    {
        this.snacks=this.snacks*count;
        System.out.println("total"+this.snacks);
    }
    public void idali(int count)
    {
        this.idali=this.idali*count;
        System.out.println("total"+this.idali);
    }
    public void dosa(int count)
    {
        this.dosa=this.dosa*count;
        System.out.println("total"+this.dosa);
    }

    public int getTea() {
        return tea;

    }

    public int getCoffee() {
        return coffee;
    }

    public int getSnacks() {
        return snacks;
    }

    public int getIdali() {
        return idali;
    }

    public int getDosa() {
        return dosa;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<customer> arr=new ArrayList<customer>();
        while(true)

        {
            System.out.println("Select an option \n 1.Tea  \n 2.Coffee \n 3.Snacks \n 4.Idali \n 5.Dosa \n 6.Generate Bill 7.view Transaction \n 8.Exit");
            Scanner sc=new Scanner(System.in);
            customer c=new customer();
            int n = sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the quantities");
                    System.out.println("enter the count");
                    int q=sc.nextInt();
                    System.out.println("enter name");
                    String name=sc.next();
                    System.out.println("enter phone number");
                    long number=sc.nextLong();
                     c.Tea(q);
                    break;

                case 2:
                    System.out.println("enter the count");
                    int q2= sc.nextInt();
                    int cc=c.getCoffee();
                    int totalcoffee=q2*cc;
                    System.out.println(totalcoffee);
                    break;

                case 3:
                    System.out.println("enter the count");
                    int q3= sc.nextInt();
                    int sc1=c.getSnacks();
                    int totalsnack=q3*sc1;
                    System.out.println(totalsnack);
                    break;
                case 4:
                    System.out.println("enter the count");
                    int q4=sc.nextInt();
                    int ic=c.getIdali();
                    int totalidali=q4*ic;
                    System.out.println(totalidali);
                    break;

                case 5:
                    System.out.println("enter the count");
                    int q5=sc.nextInt();
                    int dc=c.getDosa();
                    int totaldosa=q5*dc;
                    System.out.println(totaldosa);
                    break;
                case 6:
                    System.out.println("Total amount");
                    int overall=1;
            }

        }
    }
}