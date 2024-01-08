import java.util.*;
class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean loop=true;
        while(loop)
       {
        System.out.println("\n1.Vendor Options\n2.Customer Options\n3.exit");
        int opt=sc.nextInt();
        switch(opt)
        {
        case 1:
        {
            boolean loop1=true;
            while(loop1)
            {
                System.out.println("1.Add Vendor\n2.Add Food Item\n3.Exit");
                int opt2=sc.nextInt();
                switch(opt2)
                {
                    case 1:
                    {
                         sc.nextLine();
                         System.out.println("Enter vendor name - ");
                         String vname=sc.nextLine();
                         System.out.println("Enter vendor id - ");
                         int vid=sc.nextInt();
                         vendor v=new vendor(vname,vid);
                         vendor.vendors.put(vid,v);
                    }
                    break;
                    case 2:
                    {
                         System.out.println("Enter Vendor ID - ");
                         int vid=sc.nextInt();
                         if(vendor.vendors.containsKey(vid))
                         {
                             vendor v=vendor.vendors.get(vid);
                             sc.nextLine();
                             System.out.println("Enter Food Item - ");
                             String fooditem=sc.nextLine();
                             v.addfooditem(fooditem);
                             v.display();
                         }
                         else
                         {
                             System.out.print("Invalid ID");
                         }
                    }
                    break;
                    case 3:
                    {
                         loop1=false;
                         System.out.print("Thank you Vendor :)");
                    }
                    break;
                    default:
                         System.out.println("Wrong choice");
                    break;  
                 }
            }
        }
        break;
        case 2:
        {
            boolean loop1=true;
            while(loop1)
            {
                System.out.println("1.Order\n2.Generate Bill\n3.Exit");
                int opt2=sc.nextInt();
                switch(opt2)
                {
                    case 1:
                    {
                         order.addorder();
                    }
                    break;
                    case 2:
                    {
                         order.bill();
                    }
                    case 3:
                    {
                         loop1=false;
                         System.out.print("Thank you visit again :)");
                    }
                    break;
                    default:
                         System.out.println("Wrong choice");
                    break;  
                 }
            }
        }
        break;
        case 3:
        {
            loop=false;
            System.out.println("Thank you :)");
        }
        break;
        default:
        {
            System.out.println("Wrong choice");
        }
        }
       }
    }
}