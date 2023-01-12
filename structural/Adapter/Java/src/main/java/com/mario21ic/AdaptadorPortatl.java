package com.mario21ic;

public class AdaptadorPortatl implements Conectable {

    private Portatil portatil;

    public AdaptadorPortatl(Portatil portatil) {
        this.portatil = portatil;
    }

    @Override
    public void off() {
        this.portatil.down();
        
    }

    @Override
    public void on() {
        this.portatil.up();        
    }
    
}
