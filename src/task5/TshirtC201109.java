package task5;

public class TshirtC201109 extends Price {
   
   
    int mainPrice() {
        int price = 1280;

        System.out.println("total price is " + price);
        return price;
    }
    
    int GechengDiscount() {
        int discount = 87;
        System.out.println("Congratulation You got Gechang store Discount!");
        return discount;
    }

    private String Tshirtname;
    public String bookWriterId;
    public String Store;
 
   

    public String getName()//getter
    {
        return Tshirtname;
    }

    public void setName(String name)//setter
    {
        this.Tshirtname = name;//here this keyword refers to BookC201087 class
    }

}
