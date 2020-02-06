/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Angelina Joy G00276164
 * @version 2016.02.29
 */
public class Picture
{
    private Square sky;
    private Circle red;
    private Circle yellow;
    private Circle lime;
    private Circle green;
    private Circle blue;
    private Circle purple;
    private Circle sky1;
    private Square sky2;
    private Circle cloud1;
    private Circle cloud2;
    private Circle cloud3;
    private Circle cloud4;
    
    private boolean drawn; 
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        red= new Circle();
        yellow= new Circle();
        lime= new Circle();
        green= new Circle();
        blue= new Circle();
        purple= new Circle();
        sky1= new Circle();
        sky2= new Square();
        cloud1= new Circle();
        cloud2= new Circle();
        cloud3= new Circle();
        cloud4= new Circle(); 
  
     
        
    }

    /**$
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
           
            sky.moveHorizontal(-310);
            sky.moveVertical(-130);
            sky.changeSize(600);
            sky.changeColor("lightblue");
            sky.makeVisible();
            
            red.changeColor("red");
            red.moveHorizontal(-30);
            red.moveVertical(-30);
            red.changeSize(200);
            red.makeVisible();
            
            yellow.changeColor("yellow");
            yellow.moveHorizontal(-13);
            yellow.moveVertical(-17);
            yellow.changeSize(170);
            yellow.makeVisible();
            
            lime.changeColor("lime");
            lime.moveHorizontal(-5);
            lime.moveVertical(-6);
            lime.changeSize(150);
            lime.makeVisible();
            
            green.changeColor("green");
            green.moveHorizontal(3);
            green.moveVertical(5);
            green.changeSize(130);
            green.makeVisible();
            
            blue.changeColor("blue");
            blue.moveHorizontal(11);
            blue.moveVertical(17);
            blue.changeSize(110);
            blue.makeVisible();
            
            purple.changeColor("purple");
            purple.moveHorizontal(15);
            purple.moveVertical(33);
            purple.changeSize(100);
            purple.makeVisible();
            
            sky1.changeColor("lightblue");
            sky1.moveHorizontal(25);
            sky1.moveVertical(44);
            sky1.changeSize(80);
            sky1.makeVisible();
            
            sky2.moveHorizontal(-110);
            sky2.moveVertical(50);
            sky2.changeSize(200);
            sky2.changeColor("lightblue");
            sky2.makeVisible();
            
            cloud1.changeColor("white");
            cloud1.moveHorizontal(-40);
            cloud1.moveVertical(40);
            cloud1.changeSize(60);
            cloud1.makeVisible();
            
            cloud2.changeColor("white");
            cloud2.moveHorizontal(-10);
            cloud2.moveVertical(40);
            cloud2.changeSize(50);
            cloud2.makeVisible();
            
            cloud3.changeColor("white");
            cloud3.moveHorizontal(90);
            cloud3.moveVertical(40);
            cloud3.changeSize(50);
            cloud3.makeVisible();
            
            cloud4.changeColor("white");
            cloud4.moveHorizontal(130);
            cloud4.moveVertical(40);
            cloud4.changeSize(50);
            cloud4.makeVisible();
            
            drawn = true;
            
            
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
    
    sky.changeColor("white");
    red.changeColor("black");
    yellow.changeColor("white");
    lime.changeColor("black");
    green.changeColor("white");
    blue.changeColor("black");
    purple.changeColor("white");
    sky1.changeColor("black");
    sky2.changeColor("white");
    cloud1.changeColor("black"); 
    cloud2.changeColor("black"); 
    cloud3.changeColor("black"); 
    cloud4.changeColor("black"); 
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
    sky.changeColor("lightblue");
    red.changeColor("red");
    yellow.changeColor("yellow");
    lime.changeColor("lime");
    green.changeColor("green");
    blue.changeColor("blue");
    purple.changeColor("purple");
    sky1.changeColor("lightblue");
    sky2.changeColor("lightblue");
    cloud1.changeColor("white"); 
    cloud2.changeColor("white"); 
    cloud3.changeColor("white"); 
    cloud4.changeColor("white"); 
   
        
    }
    
   

}
