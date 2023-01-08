package com.mario21ic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting.." );
        
        Singleton config1 = Singleton.getInstance("carpeta1");
        System.out.println(config1.getCarpeta());
        System.out.println(config1);

        Singleton config2 = Singleton.getInstance("carpeta2");
        System.out.println(config2.getCarpeta());
        System.out.println(config2);
    }
}
