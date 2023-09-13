public class Multiples {
    public static int main(int limit, int m1, int m2){
        int count = 0;
        for (int i = 1; i < limit; i++){
            if (i % m1 == 0 || i % m2 == 0){
                count++;

            }
        }
        return count;
    }

    public static int main() {
        return main(1000, 3, 5);
    }

    public static void main(String[] args) {
        int count = main();
        System.out.println(count);
    }
}
