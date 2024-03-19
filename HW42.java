package HW4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HW42 {

	public static void main(String[] args) {
        Path filePath = Path.of("C:\\Users\\User\\Desktop\\Hw4\\HW4\\bin\\HW4\\demo.txt");
        try {
            String content = Files.readString(filePath);

            
            String regex = "(01AF0055/\\d{6}[a-z]+\\.HRV\\.jpg\\?HRV\\.bpp)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(content);

           
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
