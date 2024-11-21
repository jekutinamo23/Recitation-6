public void act()
{


    stopwatchImage.clear();
    stopwatchImage.drawString(stopWatch.toString(), 0, 20);
    setImage(stopwatchImage);
    stopWatch.startStop();
    //if(World.stopped()){
    //    stopWatch.startStop();
    //}

}