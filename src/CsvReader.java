import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CsvReader {

    public static ArrayList csvReader(String inputFile) {
        ArrayList arrayList = new ArrayList();
        String[] strings;
        File file;
        Scanner scanner = null;
        try {
            file = new File(inputFile);
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje");
            file = null;
        }

        if (file != null && scanner != null) {

            do {
                strings = scanner.nextLine().split(";");
                ArrayList innerArrayList = new ArrayList<>();

                for (String string : strings) {
                    innerArrayList.add(string);
                }
                arrayList.add(innerArrayList);
            } while (scanner.hasNext());


            return arrayList;
        }

        return null;

    }
}
