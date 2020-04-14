import java.io.*;

public class SimpleCopyFile {
    public static void doCopyFile(File sourceFile, File targetFile) {
        try {
            if (!sourceFile.exists()) {
                sourceFile.createNewFile();
            }
            if (!targetFile.exists()) {
                targetFile.createNewFile();
            }
            FileReader fileReader = new FileReader(sourceFile);
            BufferedReader reader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(targetFile, true);

            int line;
            while ((line = reader.read()) != -1) {
                fileWriter.write(line);
            }
            fileReader.close();
            fileWriter.close();
            System.out.println("Success copy the file!"
                    + "\nThe number of characters to be copied from the file is: "
                    + targetFile.length());
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
