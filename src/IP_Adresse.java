import java.net.*;

import javax.sound.sampled.SourceDataLine;
public class IP_Adresse {
    public static void main(String[] args) {
    try{
        InetAddress ip_Addr = InetAddress.getLocalHost();
        System.out.println("\nIP Adresse de cette machine est : "+ip_Addr.getHostAddress());
    }
    catch(UnknownHostException ex){
        ex.printStackTrace();
    }
    
}

    
}
