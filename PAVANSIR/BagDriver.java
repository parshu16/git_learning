package PAVANSIR;

public class BagDriver {
    public static void main(String[] args) {
        Bag b1=new Bag();
        b1.brand="Dell";
        b1.price=400.0;
        b1.color="black";
        b1.folders=3;
        b1.BagDeatils();
        Bag b2=new Bag();
        b2.brand="HP";
        b2.price=500.0;
        b2.color="pink";
        b2.folders=4;
        b2.BagDeatils();
    }
}
