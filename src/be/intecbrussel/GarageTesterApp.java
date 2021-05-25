package be.intecbrussel;

public class GarageTesterApp {

    public static void main(String[] args) {

        Garage garage1 = new Garage("Verstraeten NV");
        Garage garage2 = new Garage ("De Smet BVBA");
        Auto auto1= new Auto("BMW Z4",garage1);
        Auto auto2=new Auto("Audi A4");
        Auto auto3=new Auto(auto1);
        Auto auto4=new Auto("Hyundai Tucson", garage2);

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());
        System.out.println(auto4.toString());

    }
}
