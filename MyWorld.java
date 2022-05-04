import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        spawnDolphin();
        Bread b = new Bread();
        addObject(b, 300, 0);
    }
    
    public void spawnDolphin() {
        Dolphin dolphin = new Dolphin();
        addObject(dolphin, 300, 390);
    }
    
    public void spawnBread() {
        Bread bread = new Bread();
        int x = Greenfoot.getRandomNumber(600);
        addObject(bread, x, 0);
    }
}