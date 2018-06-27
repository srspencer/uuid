package gov.uspto.ssb.guid;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;


public class LinuxUUID{
        String s;
     

        public LinuxUUID()throws IOException{
                StringBuffer buf = new StringBuffer();
              
                
                FileInputStream fis;
                InputStreamReader in;
                
                		String str="";
                        String fileToRead = new String("/proc/sys/kernel/random/uuid");
                        fis = new FileInputStream(fileToRead);
                        in = new InputStreamReader(fis, "UTF-8");
                        try {
                            BufferedReader reader = new BufferedReader(in);
                            if (in != null) {                            
                                while ((str = reader.readLine()) != null) {    
                                    buf.append(str + "\n" );
                                }                
                            }
                            reader.close();
                        } finally {
                            try { fis.close(); } catch (Throwable ignore) {}
                        }
               
                        s = new String(buf);
                        
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

