public class Main {
    public static void main(String[] args) {
        int converter = printMegaBytesAndKiloBytes(55382);
        System.out.println(converter);

    }

    public static int printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 + " KB");
        } else {
            return 0;
        }
     return 0;}
}