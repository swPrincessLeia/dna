import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitura {
    public  char[] ler(String nomeArquivo) {
        // Especifique o caminho do arquivo de texto que deseja ler
       
        String filePath = nomeArquivo;
        char[] charArray = new char[0];

        try {
            // Crie um objeto File para representar o arquivo
            File file = new File(filePath);

            // Crie um FileReader para ler o arquivo
            FileReader fileReader = new FileReader(file);

            // Use um BufferedReader para ler linhas do arquivo de forma eficiente
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leia a linha do arquivo
            String line = bufferedReader.readLine();

            if (line != null) {
                // Transforme a linha lida em um array de caracteres (vetor de char)
                charArray = line.toCharArray();
         
              
            } else {
                System.out.println("O arquivo está vazio.");
            }

            // Feche o BufferedReader e o FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }   
        return charArray;     
        
    }
}
