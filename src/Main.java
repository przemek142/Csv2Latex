import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList list = CsvReader.csvReader("C:\\Users\\przemo\\IdeaProjects\\csv2latexTable\\src\\file.csv");
        WriteListToLatex.WriteListToLatexFile(list);
    }
}
