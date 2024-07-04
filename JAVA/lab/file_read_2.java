import java.io.*;

class file_read_2{
    public static void main(String[] args){
        BufferedReader br=null;
        BufferedWriter bw=null;
        try{
            br =new BufferedReader(new FileReader("TestFile2.txt"));
            bw=new BufferedWriter(new FileWriter("LowercaseTestFile2.txt", true));
            /*to read file  */
            String line =br.readLine();
            while(line != null){
                  bw.write(line.replace("very", "log"));
                  line = br.readLine();
            }
            bw.flush();
            System.out.println("reading-writting complete!!");
        }catch(IOException e){
            System.out.println("unable to read file"+ e);
        }    
        finally{     
                 if(br!=null)
                 try{
                    br.close();
                 }catch(Exception e){System.out.println("file not opended");}
            }
        
    }
}


