public class Cart {
    public int cartNumber;
    public String [] items=new String[3];
    public double [] prices=new double[3];
    public double discount;
    public double total;
    public int item_count;
    public void create_cart(int cartNumber) {
        this.cartNumber=cartNumber;
    }
    public void addItem(String item, double price) {
        item_count++;
        if(item_count>3) {
            System.out.println("You already have 3 items on your cart");
            return;
        }
        else {
            for (int i=0; i<items.length; i++) {
                if (items[i]==null) {
                    items[i]=item;
                    prices[i]=price;
                    System.out.println(items[i] + " added to cart " + cartNumber);
                    System.out.println("You have " + (i+1) + " item(s) in your cart now");
                    break;
                }
            }
        }
    }
    public void addItem(double price,String item) {
        item_count++;
        if(item_count>3) {
            System.out.println("You already have 3 items on your cart");
            return;
        }
        else {
            for (int i=0; i<items.length; i++) {
                if (items[i]==null) {
                    items[i]=item;
                    prices[i]=price;
                    System.out.println(items[i] + " added to cart " + cartNumber);
                    System.out.println("You have " + (i+1) + " item(s) in your cart now");
                    break;
                }
            }
        }
    }
    public void cartDetails() {
        total=0;
        System.out.println("Your cart(c" + cartNumber + ")");
        for(int i=0; i<items.length; i++) {
            if (items[i]!=null) {
                System.out.println(items[i] + " - " + prices[i]);
            }
        }
        System.out.println("Discount Applied: " + discount + "%");
        for(int i=0;i<prices.length;i++) {
            if (prices[i]!=0) {
                total+=prices[i];
            }
        }
        if(discount!=0) {
            total=total-(total*discount/100);
        }
        System.out.println("Total Price: " + total);
    }
    public void giveDiscount(double discount) {
        this.discount=discount;
    }
}
