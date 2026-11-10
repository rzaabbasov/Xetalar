public class SifiraBolme {
public static void main(String[] args){
   String azra="123a";
   try {
       int rza = Integer.parseInt(azra);
       System.out.println(rza);
   }catch (NumberFormatException e){
       System.out.println("bu metin tam edede cevirlebilmez");
   }
}
}
