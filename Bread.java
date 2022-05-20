import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bread.
 * 
 * @author Patrick Hu 
 * @version May 20
 */
public class Bread extends Actor
{   
    private int speed = 1;
    public void act()
    {
        // move down 1
        setLocation(getX(), getY() + speed);
        checkGameOver();
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void checkGameOver() {
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight() - 1) {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
