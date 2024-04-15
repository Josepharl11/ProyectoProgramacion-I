package GUI;
import java.awt.Color;
import java.awt.Insets;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.ui.FlatRoundBorder;

import DataBase.ConexionMySQL;

public class Main {

	public static void main (String []args) {
		ConexionMySQL query = new ConexionMySQL();
		
		//establecer y ajustar el look and feel
        FlatLightLaf.setup();
        
        //ajustanto el look and feel
        //Para redondear algunos elementos
        UIManager.put( "Button.arc", 15 );
        UIManager.put( "JPanel.arc", 99 );
        UIManager.put( "JTable.arc", 99 );
        
        //Darle estilo de separado a Tabbed Pane
        UIManager.put( "TextComponent.arc", 15 );
        UIManager.put("Component.arc", 10);
        UIManager.put( "TabbedPane.tabSeparatorsFullHeight", true );
        
        //Para darle estilo y redondear la barrita del scroll
        UIManager.put( "ScrollBar.trackArc", 999 );
        UIManager.put( "ScrollBar.thumbArc", 999 );
        UIManager.put( "ScrollBar.trackInsets", new Insets( 2, 4, 2, 4 ) );
        UIManager.put( "ScrollBar.thumbInsets", new Insets( 2, 2, 2, 2 ) );
        UIManager.put( "ScrollBar.track", new Color( 0xe0e0e0 ) );
        
        //Borde marcado de cuando seleccionas un componente (cuadro de texto, etc...)
        UIManager.put( "Component.innerFocusWidth", 1 );
        UIManager.put( "Button.innerFocusWidth", 1 );

        Login login = new Login();
        login.setVisible(true);  
	}
}