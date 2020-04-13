import java.io.File;

public class CopyFile {
    public static void main(String[] args){
        File sourceFile;
        File targetFile;
        String sourceFilePath = "E:\\IdeaProjects\\copy-file-text\\Files\\sourceFile.txt";
        String targetFilePath = "E:\\IdeaProjects\\copy-file-text\\Files\\targetFile.txt";
        sourceFile = new File(sourceFilePath);
        targetFile = new File(targetFilePath);
        SimpleCopyFile.doCopyFile(sourceFile,targetFile);
    }

}
