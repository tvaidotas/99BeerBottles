package com.qa;

public class App
{
    public static void main( String[] args )
    {
        for(int i=99; i >= 0; i--){
            if (i > 0) {
                System.out.println(
                    String.format("%s bottles of beer on the wall, %s bottles of beer. \nTake one down and pass it around, %s bottles of beer on the wall.\n", i, i, i - 1)
                );
            } else
            {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer. \nGo to the store and buy some more, 99 bottles of beer on the wall.");
            }
        }
    }
}
