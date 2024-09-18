public class NoElseSolution {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fzbz: " + i);
                i++;
            }
            if (i % 3 == 0){
                System.out.println("fz: " + i);
                i++;
            }
            if (i % 5 == 0){
                System.out.println("bz: " + i);
                i++;
            }
            System.out.println(i);
        }
     
    }
}
