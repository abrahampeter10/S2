import java.util.Scanner;
class Product{
String pcode,pname;
int price;

void details() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter product code: ");
    pcode = sc.next();
    System.out.print("Enter product name: ");
    pname = sc.next();
    System.out.print("Enter product price: ");
    price = sc.nextInt();
}

void lowest(Product a,Product b){
    if(price<a.price && price<b.price)
    System.out.println("\nProduct "+pname+" has lowest price");
else if(a.price<b.price)
System.out.println("\nProduct "+a.pname+" has lowest price");
else
System.out.println("\nProduct "+b.pname+" has lowest price");

}
}
class CompareObjects{
    public static void main(String[] args)
{
    Product p1 = new Product();
    Product p2 = new Product();
    Product p3 = new Product();
    p1.details();
    p2.details();
    p3.details();
    p1.lowest(p2,p3);
}   
}