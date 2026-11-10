public class FinallyUcunClass {
    public static void main(String[] args){
        int a=16;
        int b=0;
        try {
            System.out.println(a/b);
        } catch (RuntimeException e) {
            System.out.println("0 a bolme ola bilmez");
        }finally {
            System.out.println("Əməliyyat yekunlaşdı (Resurslar bağlandı)" );
        }
    }
}
