import java.io.File;
public class ExceptionUser {
public static void main(String[] args) {
// TODO Auto-generated method stub
File directoryPath = new File("src/Welcome.java");
File filesList[] = directoryPath.listFiles();
System.out.println("list of files and directoriesin the specified directory");
for(File file:filesList)
{
System.out.println("file name:"+file.getName());
String path = file.getAbsolutePath();
System.out.println("file path:"+path);
System.out.println("extension:"+path.substring(path.lastIndexOf('.')));
System.out.println("size :"+file.getTotalSpace());
System.out.println(" ");
}
}
}
