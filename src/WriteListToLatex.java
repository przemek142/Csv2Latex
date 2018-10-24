import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteListToLatex {

    public static void WriteListToLatexFile(ArrayList list) {
        FileWriter fileWriter;
        BufferedWriter bfw;
        ArrayList temp;
        int size;
        int size2;
        try {
            fileWriter = new FileWriter("plik.tex");
            bfw = new BufferedWriter(fileWriter);

            temp=(ArrayList)list.get(1);
            size=temp.size();
            size2=list.size();

            bfw.write("\\begin{tabular}{ ");
            for (int i = 0; i < size ; i++) {
                bfw.write("c ");
            }
            bfw.write("}\n");

            for (int i = 0; i < list.size(); i++) {

                ArrayList innerList = (ArrayList) list.get(i);
                for (int ii = 0; ii < innerList.size(); ii++) {
                    String cell= (String)innerList.get(ii);
                    bfw.write(cell);
                    if (ii == innerList.size()-1 && i!=size2-1){
                        bfw.write(" \\\\");
                    }else if (ii != innerList.size()-1)
                        bfw.write(" & ");
                }
                bfw.write("\n");

            }
bfw.write("\\end{tabular}\n");

            bfw.close();
        } catch (IOException e) {
            System.out.println("plik nie zapisany");
        }


    }

}
