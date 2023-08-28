package Object_Oriented_Basic;
public class Object_Oriented_Basic {
    double width; // instance variable
    double height; // instance variable
    double depth; // instance variable

    double volume() // modified to return the volume
    {
        return width * height * depth;
    }
}

class BoxDemox {

    public static void main(String[] args) {

        Object_Oriented_Basic b1;
        b1 = new Object_Oriented_Basic();
        b1.width = 10;
        b1.height = 20;
        b1.depth = 15;
        double volume1 = b1.volume(); // calculate and store volume
        System.out.println("Volume of b1 is: " + volume1);

        Object_Oriented_Basic b2;
        b2 = new Object_Oriented_Basic();
        b2.width = 25;
        b2.height = 5;
        b2.depth = 16;
        double volume2 = b2.volume(); // calculate and store volume
        System.out.println("Volume of b2 is: " + volume2);
    }
}
