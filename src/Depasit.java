public class Depasit {
    public static void pulQoymaq(double deposit){
        if (deposit<0||deposit==0){
            throw new IllegalArgumentException(" Depozit məbləği müsbət olmalıdır!");
        }
    }
    public static void main(String[] args){
        try {
            pulQoymaq(-14);
        } catch (Exception e) {
            System.out.println("qaqan xetani tutdu axi !!!"+e.getMessage());
        }
    }
}
