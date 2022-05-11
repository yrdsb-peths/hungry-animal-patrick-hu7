import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bread extends Actor
{    
    public void act()
    {
        // move down 1
        setLocation(getX(), getY() + 1);
        checkGameOver();
    }
    
    public void checkGameOver() {
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight() - 1) {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
