public class Reduce {

    public static int main(int i) {
        int step = 0;
        while (i != 0) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i--;
            }
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        System.out.println(main(100));
    }
}
