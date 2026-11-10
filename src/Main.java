import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 ci ededi daxil edin!!!");
        int a=scanner.nextInt();
        System.out.println("2 ci ededi daxil edin!!!");
        int b=scanner.nextInt();
        System.out.println("emeliyati daxiledin!!!");
        char emeliyat=scanner.next().charAt(0);
        if (emeliyat=='+'){
            System.out.println(a+b);
        } else if (emeliyat=='-') {
            System.out.println(a-b);
        }else if (emeliyat=='/'){
            if (0==b){
                System.out.println("0 a bolme yoxdur!!!");
            }else{
                System.out.println(a/b + " :emeliyat icra olundu!!!");
            }
        }else if (emeliyat=='*'){
            System.out.println("a*b");
        }
    }
}