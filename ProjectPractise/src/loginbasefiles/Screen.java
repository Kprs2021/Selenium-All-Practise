package loginbasefiles;

import java.awt.Toolkit;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.Dimension;

public class Screen {
	
    public static void main(String[] args)
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //get the dimension of screen
        System.out.println("Screen Widht: " + screenSize.getWidth());
        System.out.println("Screen Height: " + screenSize.getHeight());
       
        int screenResolution = Toolkit.getDefaultToolkit().getScreenResolution(); //get the resolution
        System.out.println("Screen resolution is : "+screenResolution);
        
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("resolution", "1024x768");
    }
}
