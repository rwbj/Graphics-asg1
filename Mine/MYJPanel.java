import java.awt.image.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.imageio.*;
import java.util.Random;
import java.io.*;
import java.util.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.imageio.*;
import java.util.Random;
import java.io.*;
import java.awt.geom.*;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.*;

public class MYJPanel extends JPanel{

    Graphics2D g2d;
	BufferedImage img=null;
	int x1,x2,y1,y2;
	


	public MYJPanel() {

		super();
	}

	public void setLnPts(int n1, int n2, int n3, int n4){
		x1 = n1;
		y1 = n2;
		x2 = n3;
		y2 = n4;
	}


	public synchronized void paintComponent(Graphics g) {

		int i,j,w,h,x,y,xMax;

		g2d = (Graphics2D) g;
		g2d.drawImage(img, null, 0, 0); 

		w = img.getWidth();
		h = img.getHeight();

		for (i=0; i<w; i++) //left to right
			for (j=0; j<h; j++) //top to bottom
				System.out.printf("pixel %d,%d = %x\n", i,j,img.getRGB(i,j));

		

		double m = (double)(y1-y2)/(double)(x1-x2);
		if (x1<x2){
			x=x1;
			xMax=x2;
		}
		else{
			x=x2;
			xMax=x1;
		}

		for (;x<xMax;x++){
			y = (int)(m*(x-x1))+y1;
			img.setRGB(x,y,41704);
			System.out.printf("line %d,%d = %x\n", x,y,img.getRGB(x,y));
		}
    }
}