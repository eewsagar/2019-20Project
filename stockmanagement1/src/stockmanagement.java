
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIVEDITA BIRAJDAR
 */
public class stockmanagement {
    
    public  stockmanagement (int a){
        
    }
         public static void main(String[] args) {
     //   f.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("/images/addPeople.png")));  
            try{
                Properties p=new Properties();
              
                HiFiLookAndFeel.setCurrentTheme(p);
                //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel"); grey color
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel"); //black color 
            }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
            }
        

       // LoginDialog ld=new LoginDialog();
        //ld.setLocationRelativeTo(null);
       // ld.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // ld.setVisible(true);
        //com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
    }

        
    }
    
