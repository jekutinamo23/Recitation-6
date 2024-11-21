public void act()
{
    stopWatch.startStop();
    int seconds = (int)(stopWatch.elapsedTime()/1000);
    setRotation(seconds*6);

}