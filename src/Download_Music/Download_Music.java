package Download_Music;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Download_Music {
    public static void main(String[] args) throws IOException {
        String Music_URL = "";
        URLConnection Link = new URL(Music_URL).openConnection();
        InputStream Red = Link.getInputStream();
        byte[] Bit = new byte[1024];
        String Save_Src = "";
        FileOutputStream Output = new FileOutputStream(Save_Src);
        while (true){
            int Data_Len = Red.read(Bit);
            if (Data_Len == -1){
                break;
            }
            Output.write(Bit, 0, Data_Len);
        }
        Output.flush();
        Output.close();
        Red.close();
        System.out.println("All Download!");
    }
}
