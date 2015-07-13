package project.k.cards;

import javax.swing.JLabel;


public class card_dragon {
    
    public int lvl = 1;
    public int xp = 0;
    public double live = 100;
    public double max_live = 100;
    public double attack = 20;
    public double shield = 5;
    
    public static void dragon() {
        JLabel dragon = new JLabel();
        dragon.setSize(20, 50);
        
    }

    public void setLevel(int i) {
        lvl = i;
    }

    public void addXp(int i) {
        xp = xp + i;
        if(xp > 10 && lvl < 2) {
            lvl = 2;
            live = live + (live*0.1);
            max_live = live;
        }
        else if(xp > 100 && lvl < 3) {
            lvl = 3;
            live = live + (live*0.1);
            max_live = live;
        }
    }
    
    public void removeLive(int i) {
        live = live - i;
    }
    
    public void setMaxLive() {
        live = max_live;
    }
}
