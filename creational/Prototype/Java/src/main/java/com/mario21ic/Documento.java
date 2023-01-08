package com.mario21ic;

public class Documento implements Cloneable {

    private String parrafo1;
    private String parrafo2;
    private String parrafo3;
    
    public Documento() {
    }
    public String getParrafo1() {
        return parrafo1;
    }
    public void setParrafo1(String parrafo1) {
        this.parrafo1 = parrafo1;
    }
    public String getParrafo2() {
        return parrafo2;
    }
    public void setParrafo2(String parrafo2) {
        this.parrafo2 = parrafo2;
    }
    public String getParrafo3() {
        return parrafo3;
    }
    public void setParrafo3(String parrafo3) {
        this.parrafo3 = parrafo3;
    }

    public Object clone() {
        Documento d = new Documento();
        d.setParrafo1(parrafo1);
        d.setParrafo2(parrafo2);
        d.setParrafo3(parrafo3);
        return d;
    }
}
