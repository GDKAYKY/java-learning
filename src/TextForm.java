public class TextForm {
    public static void main(String[] args) {
        /*
         * String name = "Joseph";
         * int age = 49;
         * double money = 22.2369;
         * 
         * System.out.println(String.
         * format("Hi im %s and i have %d years and i have %f rubles", name, age,
         * money));
         */

        String name = "John Marston";
        double height = 178;

        String message = """
                    I am %s and my height is %f cm
                """.formatted(name, height);

        System.out.println(message);

    }
}