import javac.swing.*;
import java.awt.*;

class MGui{

    public static void main(String[] args){
        
        JFrame bframe = new Gui();

        bframe.setLocation(32,32);
        bframe.setSize(1040,551);
		bframe.setVisible(true);
        bframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}