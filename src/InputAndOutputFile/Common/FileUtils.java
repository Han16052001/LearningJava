package InputAndOutputFile.Common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    //Output file: Thao tac ghi data ra file
    public static void writeFile(String pathFile, String line){

        try {
            FileWriter fileWriter= new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            //Ghi file
            bufferedWriter.write(line);
            //Tao dong moi
            bufferedWriter.newLine();
            //Viett xong va luu
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Input file: Doc data trong file
    public static List<String> readFile(String pathFile){
        List<String> listLine= new ArrayList<>();

        try {
            FileReader fileReader= new FileReader(pathFile);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line= null;

            while((line=bufferedReader.readLine())!=null ){
                listLine.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;

    }
}
