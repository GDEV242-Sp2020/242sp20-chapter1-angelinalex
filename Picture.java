/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square body;
    private Square arm1;
    private Square arm2;
    private Square leg1;
    private Square leg2;
    private Triangle hat; //test to see if works
    private Circle mouth;
    private Circle eye1;
    private Circle eye2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        body = new Square();
        arm1 = new Square();
        arm2 = new Square();
        leg1 = new Square();
        leg2 = new Square();
        hat = new Triangle();  
        mouth = new Circle();
        eye1 = new Circle();
        eye2 = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            body.moveHorizontal(-140);
            body.moveVertical(20);
            body.changeSize(120);
            body.changeColor("blue");
            body.makeVisible();
            
            arm1.moveHorizontal(-140);
            arm1.moveVertical(20);
            arm1.changeSize(120);
            arm1.changeColor("blue");
            arm1.makeVisible();
            
            arm2.moveHorizontal(-140);
            arm2.moveVertical(20);
            arm2.changeSize(120);
            arm2.changeColor("blue");
            arm2.makeVisible();
            
            leg1.moveHorizontal(-140);
            leg1.moveVertical(20);
            leg1.changeSize(120);
            leg1.changeColor("blue");
            leg1.makeVisible();
            
            leg2.moveHorizontal(-140);
            leg2.moveVertical(20);
            leg2.changeSize(120);
            leg2.changeColor("blue");
            leg2.makeVisible();
            
            hat.moveHorizontal(-140);
            hat.moveVertical(20);
            hat.changeSize(120);
            hat.changeColor("blue");
            hat.makeVisible();
            
            mouth.changeColor("black");
            mouth.moveHorizontal(-120);
            mouth.moveVertical(40);
            mouth.changeSize(40);
            mouth.makeVisible();
             
            eye1.changeColor("black");
            eye1.changeSize(60, 180);
            eye1.moveHorizontal(20);
            eye1.moveVertical(-60);
            eye1.makeVisible();
            
            eye2.changeColor("black");
            eye2.changeSize(60, 180);
            eye2.moveHorizontal(20);
            eye2.moveVertical(-60);
            eye1.makeVisible();
    
            
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
