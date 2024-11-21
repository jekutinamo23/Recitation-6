import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondsHand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecondsHand extends Actor
{
    private int count;
    private StopWatch stopWatch;
    public SecondsHand(){
        stopWatch = new StopWatch();
        count = 0;
    }

    /**
     * Act - do whatever the SecondsHand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        long elapsedTime = stopWatch.elapsedTime();
        long longSeconds = elapsedTime / 1000;
        int seconds = (int) longSeconds;

        count = (count + seconds) % 60;
        setRotation(count*6);
    }
}