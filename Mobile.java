package PAVANSIR;
public class Mobile{
    String brand;
    double price;
    String color;
    int RAM;
    String IMEI;
    static boolean camera=true;
    Mobile( String brand,double price,String color,int RAM,String IMEI){
        this.brand=brand;
        this.price=price;
        this.color=color;
        this.RAM=RAM;
        this.IMEI=IMEI;
        this.camera=camera;
    }
    void printMoblieDetails(){
        System.out.println("brand:"+brand);
        System.out.println("price:"+price);
        System.out.println("color:"+color);
        System.out.println("RAM:"+RAM);
        System.out.println("IMEI:"+IMEI);
       System.out.println("camera:"+camera);
        System.out.println("---------------------");
    }
    public static void main(String[] args) {
        Mobile m1=new Mobile("vivo", 13500, "BLUE", 4, "98ght543g56");
        Mobile m2=new Mobile("REALME", 50000, "Red", 8, "9ijhgf456789");
        Mobile m3=new Mobile("POCO", 25500, "Lavendor", 6, "23erfgh7890");
        Mobile m4=new Mobile("Redmi", 167500, "BlackThunder", 8, "6trfghjui9");
        m1.printMoblieDetails();
        m2.printMoblieDetails();
        m3.printMoblieDetails();
        m4.printMoblieDetails();
    }
}