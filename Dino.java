import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main animal.
 * 
 * @author Patrick Hu
 * @version May 20
 */
public class Dino extends Actor
{        
    GreenfootSound dinoSound = new GreenfootSound("crunch.mp3");
    GreenfootImage idle = new GreenfootImage("./dino-animation/dino0.png");
    GreenfootImage[] rightImages = new GreenfootImage[6];
    GreenfootImage[] leftImages = new GreenfootImage[6];
    SimpleTimer animTimer = new SimpleTimer();
    
    private int animation_index = 0;
    private boolean facingRight = true;
    private int speed = 2;
    
    public Dino() {
        setImage(idle);
        // store the sprite animation
        for (int i = 0; i < 6; i++) {
            rightImages[i] = new GreenfootImage("./dino-animation/dino" + i + ".png");
            rightImages[i].scale(50, 50);
            leftImages[i] = new GreenfootImage("./dino-animation/dino" + i + ".png");
            leftImages[i].scale(50, 50);
            leftImages[i].mirrorHorizontally();
        }
        animTimer.mark();
    }
        
    public void act()
    {     
        checkMovement();
        checkTouching();
        animate();
    }
    
    public void animate() {
        if (animTimer.millisElapsed() > 0) {
            if (facingRight) {
                setImage(rightImages[animation_index]);
            }
            else {
                setImage(leftImages[animation_index]);
            }
            animation_index++;
            animation_index %= 5;
            animTimer.mark();
        }        
    }
    
    public void checkMovement() {
        if (Greenfoot.isKeyDown("a")) {
            move(0 - speed);
            facingRight = false;
        }
        else if (Greenfoot.isKeyDown("d")) {
            move(speed);
            facingRight = true;
        }
        else if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - speed);
        }
        else if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + speed);
        }
    }
    
    public void checkTouching() {
        if (isTouching(Bread.class)) {
            removeTouching(Bread.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnBread();
            world.increaseScore();
            dinoSound.play();
        }
    }
}
