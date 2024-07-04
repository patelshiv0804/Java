import java.io.*;

public class file_read_3 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("12file.txt"));
            bw = new BufferedWriter(new FileWriter("LowercaseTestFile2.txt", true));
            
            String line = br.readLine();
            System.out.println("Students with marks more than 70:");

            while (line != null) {
                // Split the line into student name and marks
                String[] parts = line.split(" ");
                String name = parts[0];
                int marks = Integer.parseInt(parts[1]);
                // The parseInt method is a part of the Integer class in Java, and it is used to
                // convert a string representation of an integer into an actual integer

                if (marks > 70) {
                    System.out.println(name);
                }

                bw.write(line);
                bw.newLine();

                line = br.readLine();
            }
            bw.flush();
            System.out.println("Reading and writing complete!");
        } 

        catch (IOException e) {
            System.out.println("Unable to read or write files: " + e);
        } 

        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } 
            catch (IOException e) {
                System.out.println("Error while closing the files.");
            }
        }
    }
}
