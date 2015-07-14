package project.k;

/**
 *
 * @author Jaucheman
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JFrame;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


// thia really needs work all this Image stuff shouldn't happen in here
// only the real paint stuff should be in here
public class GameFrame extends JFrame {
    public void paint(Graphics g){
        super.paint(g);
        BufferedImage image = null;
        URL BGImg = ProjectK.class.getResource("/textures/backgroundtexture.png");
        URL TitleImg = ProjectK.class.getResource("/textures/projectk.png");
        image = loadimg(BGImg);
//        g.setFont(new Font("Default", Font.PLAIN, 128));
//        g.setColor(Color.RED);
        g.drawImage(image, 0, 0, 1024, 786, null);
        image = loadimg(TitleImg);
        g.drawImage(image, 512 - 128, 32, 264, 128, null);
//        g.drawString("Project K", 128, 128);
        
    }
    private BufferedImage loadimg(URL url){
        BufferedImage image = null;
        try {
            image = ImageIO.read(url);
        } catch (IOException ex) {
            Logger.getLogger(GameFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return image;
    }
}
