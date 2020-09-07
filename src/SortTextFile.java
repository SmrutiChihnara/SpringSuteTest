import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class SortTextFile {
    public static void getData() {
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        ArrayList<String> list = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\srchi\\OneDrive\\Desktop\\projectByme\\Test.java"));
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                list.add(currentLine);
                currentLine = bufferedReader.readLine();
            }
            Collections.sort(list);
            System.out.println(list);
            bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\srchi\\OneDrive\\Desktop\\projectByme\\Test.java"));
            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String[] args) {
        getData();
    }
}
