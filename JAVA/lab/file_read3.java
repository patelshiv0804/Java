import java.io.*;
import java.util.HashSet;

class RemoveDuplicateLines {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("source.txt"));
            bw = new BufferedWriter(new FileWriter("target.txt"));

            String line;
            HashSet<String> uniqueLines = new HashSet<>();

            while ((line = br.readLine()) != null) {
                if (uniqueLines.add(line)) {
                   
                    bw.write(line);
                    bw.newLine(); 
                }
            }
            bw.flush();
            System.out.println("Duplicate lines removed and stored in target file.");
        } catch (IOException e) {
            System.out.println("Unable to read/write file: " + e);
        } finally {
            try {
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                System.out.println("Error while closing the file: " + e);
            }
        }
    }
}