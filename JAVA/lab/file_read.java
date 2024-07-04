import java.io.*;

class file_read{
    public static void main(String[] args){
        BufferedReader br=null;
        BufferedWriter bw=null;
        try{
            br =new BufferedReader(new FileReader("TestFile1.txt"));
            bw=new BufferedWriter(new FileWriter("LowercaseTestFile1.txt", true));
          
            String line =br.readLine();
            
            while(line != null){
                  bw.write(line.toLowerCase()+ "\n");
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


