import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] colors = new int[4];
        for (int i = 0; i < 4; i++) {
            colors[i] = scanner.nextInt();
        }

        int minimumHorseshoesToBuy = getMinimumHorseshoesToBuy(colors);
        System.out.println(minimumHorseshoesToBuy);
    }

    private static int getMinimumHorseshoesToBuy(int[] colors) {
        Set<Integer> uniqueColors = new HashSet<>();
        for (int color : colors) {
            uniqueColors.add(color);
        }
        return 4 - uniqueColors.size();
    }
}
