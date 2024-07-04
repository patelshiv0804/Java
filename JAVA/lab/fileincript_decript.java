
import java.io.*;
public class fileincript_decript {
 public static void main(String[] args) {
 if (args.length != 3) {
 System.out.println("Usage: java FileEncryption <input_file> <output_file> 
<encryption_key>");
 System.exit(1);
 }
 String inputFileName = args[0];
 String outputFileName = args[1];
 int key = Integer.parseInt(args[2]);
 try {
 File inputFile = new File(inputFileName);
 File outputFile = new File(outputFileName);
 encryptFile(new FileInputStream(inputFile), new FileOutputStream(outputFile), key);
 System.out.println("File encrypted as: " + outputFileName);
 decryptFile(new FileInputStream(outputFile), new FileOutputStream(inputFile), key);
 System.out.println("File decrypted as: " + inputFileName);
 } catch (FileNotFoundException e) {
 System.err.println("File not found: " + e.getMessage());
 } catch (IOException e) {
 System.err.println("IO error: " + e.getMessage());
 }
 }
 public static void encryptFile(InputStream is, OutputStream os, int key) throws IOException {
 int data;
 while ((data = is.read()) != -1) {
 data += key;
 os.write(data);
 }
 is.close();
 os.close();
 }
 public static void decryptFile(InputStream is, OutputStream os, int key) throws IOException {
 int data;
 while ((data = is.read()) != -1) {
 data -= key;
 os.write(data);
 }
 is.close();
 os.close();
 }
}
