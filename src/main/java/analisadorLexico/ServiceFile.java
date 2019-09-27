package analisadorLexico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServiceFile {

    public static List<String> readerFile(String path) {
        List<String> listSymbol = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while (br.ready()) {
                String linha = br.readLine().replace("\t", "");
                String[] linhaBreak = RulesGrammar.RuleMain(linha).split(" ");
                for (String x : linhaBreak) {
                    String resultSymbol = MinijavaSymbol.symbol(x);
                    if (resultSymbol != null) {
                        listSymbol.add(resultSymbol);
                    }
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return listSymbol;
    }


}


