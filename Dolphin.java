import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Actor
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Dolphin() {
        
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("a")) {
            move(-1);
        }
        else if (Greenfoot.isKeyDown("d")) {
            move(1);
        }
        else if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 1);
        }
        else if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 1);
        }
    }
}
