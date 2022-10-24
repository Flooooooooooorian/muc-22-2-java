import java.util.Arrays;

public class HalloWelt {
    public static void main(String[] args) {

        System.out.println("Hallo Java");

        int value;

        value = 646;

        System.out.println(value);

        boolean wahrheitswert = value == 500;

        String wort = "Hallo Java" + " !!!";
        System.out.println(wort);


        String hallo = "Hallo";
        String welt = "世界";
        String ausgabe = hallo + welt;

        System.out.println(ausgabe);


        String[] names = new String[5];

        names[0] = "Sergej";
        names[4] = "Florian";

        System.out.println(Arrays.toString(names));
        System.out.println(names[0]);
    }
}
