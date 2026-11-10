public class CheckAte {
   public static void checkAge(int age){
       if(age<18){
       throw new IllegalArgumentException("Yaş 18-dən kiçik ola bilməz!");
       }else {
           System.out.println("yasiniz kifayet qederedir!!!");
       }
   }
   public static void main(String[] args){
     try {
         checkAge(14);
     } catch (IllegalArgumentException e) {
         System.out.println("xeta verierdi qaqas bizde yoluna qoydug\n"+ e.getMessage());
     }finally {
         System.out.println("Sasi getMessage vare bidene onu geminiden sorsmusam  fso canmcun");
     }
   }
}
