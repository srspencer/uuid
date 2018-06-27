package gov.uspto.ssb.guid;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class LinuxUUID{
        String s;
     

        public LinuxUUID()throws IOException{
                char[] cbuf = new char[36];
              
                
                FileInputStream fis;
                InputStreamReader in;
                
                
                        String fileToRead = new String("/proc/sys/kernel/random/uuid");
                        fis = new FileInputStream(fileToRead);
                        in = new InputStreamReader(fis, "UTF-8");

               
                        s = new String(cbuf);
                        fis.close();
                        in.close();
                       
                
          
                
        }

        public String toString(){
                return(s);
        }
        
        String getName(){return(s);};

        public static void main(String[] args){
        		try{
                LinuxUUID l = new LinuxUUID();
                System.out.println(l.toString());
        		}catch(IOException e){
        			System.out.println(e.getMessage());
        		}
        }
}
