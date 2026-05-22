import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NORMAL, true, 80);
        Bed bed = new Bed("Çift Kişilik", 4, 1, 2, 2);
        Wardrobe wardrobe = new Wardrobe(2, 4, 40);
        Carpet carpet = new Carpet(3, 5, PaintColor.RED);
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Wall wall1 = new Wall("NORTH");
        Wall wall2 = new Wall("SOUTH");
        Wall wall3 = new Wall("EAST");
        Wall wall4 = new Wall("WEST");

        Bedroom bedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet);

        lamp.turnOn();
        bed.make();
        wardrobe.add();
        carpet.lying();
        ceiling.create();
        wall1.create();

        System.out.println("Bedroom name: " + bedroom.getName());
    }
}