import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class ByteCount_file{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fileName = sc.nextLine(); 

        try {
            int byteCount = countBytesInFile(fileName, StandardCharsets.UTF_8);
            System.out.println("Total bytes (UTF-8): " + byteCount);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static int countBytesInFile(String fileName, java.nio.charset.Charset encoding) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] buffer = new byte[1024];
        int bytesRead;
        int totalBytes = 0;
        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
            String readString = new String(buffer, 0, bytesRead, encoding);
            byte[] stringBytes = readString.getBytes(encoding);
            totalBytes += stringBytes.length;
        }

        fileInputStream.close();
        return totalBytes;
    }
}
