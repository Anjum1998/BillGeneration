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
   public int  Tea(int count)
    {
        this.tea=this.tea*count;
       // return this.tea;
        int t=this.tea;
        return t;
    }
    int Coffee(int count)
    {
        this.coffee=this.coffee*count;
       // return this.coffee;
        int c1=this.coffee;
        return c1;
    }
    int snacks(int count)
    {
        this.snacks=this.snacks*count;
        return this.snacks;
    }
    int idali(int count)
    {
        this.idali=this.idali*count;
        int a=this.idali;
        return a;
        //return this.idali;
    }
    int dosa(int count)
    {
        this.dosa=this.dosa*count;
        return this.dosa;
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

                    int ss=c.getTea();
                    int total=q*ss;
                    //System.out.println(ss);
                    System.out.println(total);

            }

        }
    }
}