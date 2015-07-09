
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
        URL titel_ = ProjectK.class.getResource("/textures/projectk.png");
        Icon namesave = new ImageIcon(namesave_);
        Icon backgroundpicture = new ImageIcon(backgroundtexture_);
        Icon titel = new ImageIcon(titel_);
        
        
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
            name.setLocation(125, 180);
            
            JLabel backgroundtexture = new JLabel();
            backgroundtexture.setSize(400, 400);
            backgroundtexture.setIcon(backgroundpicture);
            
            JLabel projectk = new JLabel();
            projectk.setSize(200, 100);
            projectk.setIcon(titel);
            projectk.setLocation(100, 50);
            
            JLabel Name = new JLabel();
            Name.setSize(75, 20);
            Name.setText("Name:");
            Name.setLocation(75, 180);
            
            JButton save = new JButton();
            save.setSize(250, 30);
            save.setLocation(75, 201);
            save.setIcon(namesave);
            
            startframe.setSize(400, 400);
            
            startframe.add(name);
            startframe.add(Name);
            startframe.add(save);
            startframe.add(projectk);
            startframe.add(backgroundtexture);
            backgroundtexture.setVisible(true);
            name.setVisible(true);
            Name.setVisible(true);
            save.setVisible(true);
            projectk.setVisible(true);
            startframe.setVisible(true);
            
            
            while(true) {
                if(namesaved == true) {
                    startframe.setName(nameOfUser);
                    startframe.setVisible(false);
                    name.setVisible(false);
                    Name.setVisible(false);
                    save.setVisible(false);
                    projectk.setVisible(false);
                    backgroundtexture.setVisible(false);
                    break;
                }
            }   
        }
        else {
            load(); //load savegame  
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
