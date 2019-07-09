package utils;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Random;

public class Utils {
    public static void selectRandomValueFromDropdown(SelenideElement element) {
        Select dropdown = new Select(element);
        List<WebElement> l = dropdown.getOptions();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(l.size()-1) + 1;
        dropdown.selectByIndex(randomInt);
    }

    public static String generateRandomString(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ " + "0123456789 " + "abcdefghijklmnopqrstuvxyz ";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
    public static String getLongDescription()
    {
        String string = "yFt4qfVLGvzPorJBAeDbVZpMVDVWDjVIlL8YNpnSF9JTGkSd3Z0En6a9KWrrQVgBdW1nBnBHgDSBJPFPyysagITU81JpFdfQYfvIVG4k9Asm8Bs87UMVdXrd4yA6g4s9jBpDZ4CmAXWWzzBfvke0YI9t2lpzrc9V3RvWdgE71OY6YAgtCxCJDNOqmqvbHB2SfCMugKVikznnhvOFFruzEMu3RtLA6hl1NOTDgqdQ5whsSzCjzhMNg8PAq2WgQESC5QM3WZy20Pixb8WCOucMXEHvvOdwtWXgq4sFq1YhgXMwpG2pnTNIXHFJ6vMSi0X8N9flZYJ7nV9tkSCYnvizgkivMQW4lDXlxoaPpN7ciitDuQlBznlejBP1XQdT4LzVmnCRd5lO3uu36DK8lLMd1zEpU9xSWTci45uoK7z4Kg6JAp2MwrcCRTarsuqpDsDpK1k59XLcAo3U5D22RzTzOXuIXdyz5OWCN3NBACWFIkmex6ulgG1LZiWiG4dixGlJgjy6qr9SxowDgGFYMxLtRGVICf2fDvxTuRy0vrad2P3mV7hrDO2p3bpy0FP4iXEsOViN5xyIT8rXrpeKcLbpPcRS9i9mW9n4Hf77T9NbOsZj4bW16Qn8tJDvFue9ZylA4wNJCrpoZfAwIkYowx1EuzSIWCDu0PbMaJRm390U6pguzeLHIM25WjObVUXmsvnpj1ISKbH2vwuDpAltevllQnF7ywgqs2tqF874tC8VoTasSfKucLuH5isowrp2cryP7aImSPJ44YR0mZVJTRrewcJNJPsYeQfkR0jTDmLoPznKIvC6uFaCR40I9GYiZXPPBqDTty2N2UCViuaqkMDHXTXi7HiI35hTJBPfJrfWcuBGo7JT9Jh0vH0VbUHsffBWeelgO9XuP3CCF7DeeKWfl5Aw1droPGvsy6A6DO62dnabD96N62OakzaxFdnotDTKdgg4vnqf1wc0H2kpBvYB6DbKspLi40vmhNzEH0RQ5v9kJjod9i\n";
        return string;
    }

}
