package duplicates;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        table.array = new int[]{2, 3, 2, 1, 5, 4, 3, 3, 1};

        System.out.print("The numbers: ");
        System.out.println(Arrays.toString(table.array));
        ReformTable.theDuplicates(table);

        System.out.println();
    }
}
