
package project.k;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class ProjectK {
    
    public static String nameOfUser = null;
    
    public static void main(String[] args) {
        
        
        //URL firstpicturename = ProjectK.class.getResource("/textures/Picturename.png");
        //Icon secondpicturename = new ImageIcon(firstpicturename);
        URL namesave_ = ProjectK.class.getResource("/textures/namesave.png");
        URL backgroundtexture_ = ProjectK.class.getResource("/textures/backgroundtexture.png");
        Icon namesave = new ImageIcon(namesave_);
        Icon backgroundpicture = new ImageIcon(backgroundtexture_);
        
        
        int newgame = 1;
        
        checkfornewgame(newgame);
        
        JFrame startframe = new JFrame("Project K");
        startframe.setLayout(null);
        startframe.setResizable(false);
        startframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create welcome frame
        if(newgame == 1) {
            boolean namesaved = false;
            JTextField name = new JTextField();
            name.setSize(200, 20);
            name.setLocation(100, 180);
            
            JLabel backgroundtexture = new JLabel();
            backgroundtexture.setSize(400, 400);
            backgroundtexture.setIcon(backgroundpicture);
            
            JLabel Name = new JLabel();
            Name.setSize(50, 20);
            Name.setText("Name:");
            Name.setLocation(50, 180);
            
            JButton save = new JButton();
            save.setSize(250, 30);
            save.setLocation(50, 201);
            save.setIcon(namesave);
            
            startframe.setSize(400, 400);
            
            startframe.add(name);
            startframe.add(Name);
            startframe.add(save);
            startframe.add(backgroundtexture);
            backgroundtexture.setVisible(true);
            name.setVisible(true);
            Name.setVisible(true);
            save.setVisible(true);
            startframe.setVisible(true);
            
            while(true) {
                if(namesaved == true) {
                    startframe.setName(nameOfUser);
                    startframe.setVisible(false);
                    name.setVisible(false);
                    Name.setVisible(false);
                    save.setVisible(false);
                    break;
                }
            }   
        }
        startframe.setSize(800, 800);
    }
    
    public static int checkfornewgame(int newgame) {
        //search for savegame
        return newgame;
    }
    
    //save the game / create a savegame
    public static void save() {
        
    }
    
    //load savegame
    public static void load() {
        
    }
    
}
