package ss16_text_file;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        try{
            FileReader inputReader = new FileReader("C:\\Users\\ASUS\\OneDrive\\Tài liệu\\CodeGym\\module2\\Codegym_module2\\src\\ss16_text_file\\inFile.txt");
            BufferedReader reader = new BufferedReader(inputReader);
            FileWriter outputWriter = new FileWriter("C:\\Users\\ASUS\\OneDrive\\Tài liệu\\CodeGym\\module2\\Codegym_module2\\src\\ss16_text_file\\outFile.txt");
            String line = null;
            int count = 0;
            while ((line = reader.readLine())!= null){
                outputWriter.write(line+"\n");
                System.out.println(line);
            }
            reader.close();
            outputWriter.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
