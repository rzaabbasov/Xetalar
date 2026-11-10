public class Calculate {
    public static void calculateDiscount(double price, double discountRate)throws Exception{
        if (discountRate>0||discountRate<100){
            throw new Exception("endirim faizi 0 dan kicik 100 den boyuk ola bilmez\n");
        }
    }
    public static void main(String[] args){
      //  calculateDiscount(12,120);
        try {
            calculateDiscount(15,120);
        }catch (Exception e){
            System.out.println(e.getMessage()+"xeta yaratdiq ve tutduq!!!");
        }
    }
}
