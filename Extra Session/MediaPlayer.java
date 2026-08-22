public interface MediaPlayer {
    void play();
    void pause();
    void stop();
}

class Video implements MediaPlayer{
  
    @Override
    public void play(){
        System.out.println("Video is Playing");
    }

    @Override
    public void pause(){
        System.out.println("Video is Paused");
    }

    @Override
    public void stop(){
        System.out.println("Video is Stopped");
    }
    
}



class Audio implements MediaPlayer{

     @Override
    public void play(){
        System.out.println("Audio is Playing");
    }

    @Override
    public void pause(){
        System.out.println("Audio is Paused");
    }

    @Override
    public void stop(){
        System.out.println("Audio is Stopped");
    }
    
}