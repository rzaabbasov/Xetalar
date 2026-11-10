public class BankCode {
   public static void validatePassword(String password){
       try {
           if (password==null){
               throw new NullPointerException("sifre yerine bisey yaz!!!");
           }
           if (password.length()<8) {
               throw new IllegalArgumentException("sifre 8 simvoldan asaqi olmamalidi!!!");
           }
       }catch (NullPointerException e){
           System.out.println(e.getMessage());
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
   }

    public static void main(String[] args) {
        validatePassword("2006rza");
    }
}
