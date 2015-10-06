// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        Expo.drawRectangle(g,100,100,300,300);
        Expo.drawRectangle(g,150,150,350,350);
        Expo.drawLine(g,100,100,150,150);
        Expo.drawLine(g,300,300,350,350);
        Expo.drawLine(g,300,100,350,150);
        Expo.drawLine(g,100,300,150,350);
        // DRAW TARGET
        Expo.drawCircle(g,500,200,100);
        Expo.drawCircle(g,500,200,80);
        Expo.drawCircle(g,500,200,60);
        Expo.drawCircle(g,500,200,40);
        Expo.drawCircle(g,500,200,20);

        // DRAW TRIANGLE
        Expo.drawLine(g,600,370,650,500);
        Expo.drawLine(g,650,500,550,500);
        Expo.drawLine(g,550,500,600,370);
        Expo.drawLine(g,600,370,600,500);
        Expo.drawLine(g,650,500,575,434);
        Expo.drawLine(g,550,500,625,434);
        // DRAW SMILEY FACE
        Expo.drawOval(g,500,600,80,125);
        Expo.drawCircle(g,470,560,18);
        Expo.drawCircle(g,530,560,18);
        Expo.drawCircle(g,470,560,1);
        Expo.drawCircle(g,530,560,1);
        Expo.drawArc(g,500,630,60,20,90,270);
        Expo.drawArc(g,470,540,15,10,270,90);
        Expo.drawArc(g,530,540,15,10,270,90);

        // DRAW JPII
        Expo.fillRectangle(g,50,565,75,625);
        Expo.fillRectangle(g,50,595,125,625);
        Expo.fillRectangle(g,115,625,150,500);
        Expo.fillRectangle(g,200,500,175,625);
        Expo.fillRectangle(g,175,500,250,530);
        Expo.fillRectangle(g,250,530,225,570);
        Expo.fillRectangle(g,250,570,175,550);
        Expo.fillRectangle(g,300,500,450,530); 
        Expo.fillRectangle(g,300,625,450,595); 
        Expo.fillRectangle(g,325,500,360,600);
        Expo.fillRectangle(g,425,500,390,600);


    
    }

}


