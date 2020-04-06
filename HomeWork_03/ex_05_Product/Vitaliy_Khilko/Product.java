public class Product {

    public String product;
    private double regularPrice;
    private double discount;

    Product(){
        product = "Milk";
    }

    Product(String product){
        this.product = product;
    }


    public void setRegularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice(){
        return regularPrice;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public double getDiscount(){
        return discount;
    }


    public double actualPrice(){
         return this.getRegularPrice() - (this.getRegularPrice() / 100 * this.getDiscount());
    }

    public void printInformation(){
        System.out.println("Product : name = \"" + this.product
                + "\", regular price = " + this.getRegularPrice()
                + " EUR, discount = " + this.getDiscount()
                + " %, actual price = " + this.actualPrice() + " EUR");
    }

}
