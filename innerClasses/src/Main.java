public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.5);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);

    }
}
