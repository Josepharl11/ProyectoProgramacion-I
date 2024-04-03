package GUI;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.ui.FlatRoundBorder;



public class Main {
	public static void main (String []args) {
		
		
        FlatLightLaf.setup();
        UIManager.put( "Button.arc", 15 );
        UIManager.put( "JPanel.arc", 99 );
        UIManager.put( "TextComponent.arc", 15 );

        
        Login login = new Login();
        login.setVisible(true);
		
	}

	
}
