package duplicates;

public class ReformTable {

    static void theDuplicates(Table table) {
        System.out.println("The duplicate numbers are: ");
        for (int i = 0; i < table.array.length - 1; i++) {
            for (int j = i + 1; j < table.array.length; j++) {
                if (table.array[i] == table.array[j] && table.array[j] != table.array[j - 1]) {
                    System.out.print(table.array[j] + " ");
                }
            }
        }
    }
}
