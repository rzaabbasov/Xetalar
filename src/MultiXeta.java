public class MultiXeta {
    public static void multiXetalar(String rza){
        int a=8;
        try {
            System.out.println(rza.length());
            System.out.println(a/0);
        }catch (ArithmeticException e){
            System.out.println("0 a bolme yoxdu!!!");
        }catch (NullPointerException e){
            System.out.println("deyer teyin edilmiyib!!!");
        }
    }
    public static void main(String[] args){
        multiXetalar(null);
    }
}
