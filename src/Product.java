public class Product {
    private String name;
    private double price;
  public Product(String name, double price){
      this.name=name;
      setPrice(price);
  }
    public void setPrice(double price){
        if (price<0){
            throw new IllegalArgumentException("mehsulun qiymeti menfi ola bilmez!!!");
        }
        this.price=price;
  }
    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
        try {
            Product azr=new Product("alma",-23);
            azr.getPrice();

        } catch (IllegalArgumentException e) {
            System.out.println("qaqan bu xetalarin dedsini aqladirda !!!"+e.getMessage());
        }
    }
}
