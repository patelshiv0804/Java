import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MouseEvents" width=300 
height=100>
</applet>
*/

public class MouseEvents extends Applet
    implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX = 0, mouseY = 0;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked.";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        // save coordinates
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse entered.";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        // save coordinates
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse exited.";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        // save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        showStatus("Moving mouse at " + mouseX + ", " + mouseY);
    }

    // Display msg in applet window at current X,Y location.
    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }
}


// class buffer{
//      private int[] buff;
//      private int size;
//      private int capacity;
//      private int input,output;

//     public  buffer(){
//         this.capacity=capacity;
//         buff = new int[capacity];
//         size=0;
//         input=0;
//         output=0; 
//     }
// }

// public synchronized void produce(int get)throws InterruptedException{
// while(size == capacity){
//     wait();
// }

// buff[input]=get;
// input=(input+1)%capacity 
// size++;
// System.out.println("produced: "+ get);
// notify();
// } 

// public synchronized int consume() throws InterruptedException{
// while(size==0){
//     wait();
// }

// int get=buff[output];
// output=(output+1)%capacity;
// size--;
// System.out.println("consumed: "+ get);
// notify();

// }

// class producer extends Thread{
//     private buffer buff;
//     public producer(){
//         this.buff=buff;
//     }
//     public void run(){

//     }
// }