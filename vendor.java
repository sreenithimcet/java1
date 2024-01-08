import java.util.*;
public class vendor
{
    
    int vendorid;
    String vendorname;
    List<String> fooditems;
    List<Integer> prices;
    List<Integer> quantities;
    Scanner sc=new Scanner(System.in);
    public static Map<Integer,vendor> vendors=new HashMap<>();
    public vendor(String vendorname,int vendorid)
    {
        this.vendorname = vendorname;
        this.vendorid = vendorid;
        this.fooditems = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.quantities = new ArrayList<>();
    }

    public void addfooditem(String fooditem) 
    {
        fooditems.add(fooditem);
        System.out.println("Enter price - ");
        int price=sc.nextInt();
        prices.add(price);
        System.out.println("Enter quantity - ");
        int quantity=sc.nextInt();
        quantities.add(quantity);
        System.out.println("\n Added Successfully");
    }
    
    public void display() {
        System.out.println();
        System.out.println("Vendor ID: " + vendorid);
        System.out.println("Vendor Name: " + vendorname);
        System.out.println("Food Items: " + fooditems);
        System.out.println("Prices: " + prices);
        System.out.println("Quantities: " + quantities);
        System.out.println();
        for (Map.Entry<Integer,vendor> entry : vendors.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue().vendorname);
    }
}