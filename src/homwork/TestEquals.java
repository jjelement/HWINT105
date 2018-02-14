package homwork;

public class TestEquals {
    public static void main(String[] args) {
        Theater theater = new Theater("Theather 1");
        Theater theater2 = theater;

        Theater theater3 = new Theater("Theather 1");
        System.out.println(theater.toString());
        System.out.println(theater3.toString());

        System.out.println();

        System.out.println(theater.equals(theater));
        System.out.println(theater.equals(theater2));

        System.out.println();

        System.out.println(theater.equals(theater3));
        System.out.println(theater2.equals(theater3));

        System.out.println();

        System.out.println(theater.hashCode());
        System.out.println(theater2.hashCode());
        System.out.println(theater3.hashCode());
    }
}
