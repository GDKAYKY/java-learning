public class TypeCasting {
    public void main(String[] args) {
        /*
         * int average = 2 + 5 + 8 / 3;
         * int classification = average / 2;
         * 
         * System.out.println(classification);
         */

        int x = 10;
        double y = x; // Implicit casting (widening)

        double z = 10.5;
        int c = (int) z; // explicit casting (narrowing)
    }
}
