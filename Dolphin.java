import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Actor
{        
    GreenfootSound dolphinSound = new GreenfootSound("crunch.mp3");
    GreenfootImage idle = new GreenfootImage("./dino-animation/dino0.png");
    GreenfootImage[] animation = new GreenfootImage[6];
    private int animation_index = 0;
    
    public Dolphin() {
        setImage(idle);
        // store the sprite animation
        for (int i = 0; i < 6; i++) {
            GreenfootImage img = new GreenfootImage("./dino-animation/dino" + i + ".png");
            animation[i] = img;
        }
    }
        
    public void act()
    {           
        checkMovement();
        checkTouching();
        animate();
    }
    
    public void animate() {
        setImage(animation[animation_index]);
        animation_index++;
        animation_index %= 5;
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
            dolphinSound.play();
        }
    }
}
