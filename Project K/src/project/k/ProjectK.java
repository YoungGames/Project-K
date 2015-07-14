package project.k;




import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import javax.swing.JFrame;


public class ProjectK {
    
    public static void main(String[] args) throws Exception {
  
        URL namesave_ = ProjectK.class.getResource("/textures/namesave.png");
        URL backgroundtexture_ = ProjectK.class.getResource("/textures/backgroundtexture.png");
        URL titel_ = ProjectK.class.getResource("/textures/projectk.png");
        Icon namesave = new ImageIcon(namesave_);
        Icon backgroundpicture = new ImageIcon(backgroundtexture_);
        Icon titel = new ImageIcon(titel_);
                
        JFrame StandartFrame = new GameFrame();
        StandartFrame.setLayout(null);
        StandartFrame.setResizable(false);
        StandartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StandartFrame.setVisible(true);
        StandartFrame.setSize(1024, 786);
        
    }
    
//save the game / create a savegame
    public static void save() {
        
    }
    
    //load savegame
    public static void load() {
        
    }
}

