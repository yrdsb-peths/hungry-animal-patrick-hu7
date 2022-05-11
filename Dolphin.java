import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Actor
{        
    public void act()
    {               
        checkMovement();
        checkTouching();
    }
    
    public void checkMovement() {
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
    
    public void checkTouching() {
        if (isTouching(Bread.class)) {
            removeTouching(Bread.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnBread();
            world.updateLabel();
        }
    }
}
