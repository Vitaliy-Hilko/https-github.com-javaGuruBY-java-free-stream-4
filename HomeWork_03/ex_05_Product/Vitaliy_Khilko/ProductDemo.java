public class ProductDemo {
    public static void main(String[] args) {
        Product name = new Product("Bread");
        System.out.println(name.product);
        name.setRegularPrice(28.34);
        System.out.println(name.getRegularPrice());
        name.setDiscount(3);
        System.out.println(name.getDiscount());
        name.actualPrice();
        name.printInformation();

    }
}
