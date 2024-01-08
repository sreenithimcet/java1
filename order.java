import java.util.*;
public class order
{
    static int customerid;
    public static int cost;
    String customername;
    static List<String> orderedfooditems=new ArrayList<>();
    static List<Integer> orderedprices=new ArrayList<>();
    static List<Integer> orderedquantities=new ArrayList<>();
    public order(int customerid,String customername)
    {
       this.customerid=customerid;
       this.customername=customername;
    }
    public static void addorder()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vendor name - ");
        String vname=sc.nextLine();
        System.out.println("Enter vendor id - ");
        int vid=sc.nextInt();
        if(vendor.vendors.containsKey(vid))
        {
            sc.nextLine();
            System.out.println("Enter Food Item - ");
            String fooditem=sc.nextLine();
            vendor v=vendor.vendors.get(vid);
            if(v.fooditems.contains(fooditem))
            {
                int index=v.fooditems.indexOf(fooditem);
                System.out.println("Enter Quantity - ");
                int quantity=sc.nextInt();
                if(v.quantities.get(index)>=quantity)
                {
                    int q=v.quantities.get(index)-quantity;
                    v.quantities.set(index,q);
                    cost+=v.prices.get(index)*quantity;
                    System.out.println("Ordered Successfully");
                    orderedfooditems.add(fooditem);
                    orderedprices.add(v.prices.get(index));
                    orderedquantities.add(quantity);
                } 
                else
                {
                    System.out.println("Only "+v.quantities.get(index)+" Available");
                }
            }
            else
            {
                    System.out.println("Not Available");
            }
         }
         else
         {
             System.out.println("Invalid ID");
         }      
     }  
     public static void bill()
     {
         System.out.println("Item Quantity price");
         for(int i=0;i<orderedquantities.size();i++)
         {
             System.out.println(orderedfooditems.get(i)+"  "+orderedquantities.get(i)+"        "+orderedprices.get(i));
         }
         System.out.println("Total amount = "+cost);
     } 
    }
