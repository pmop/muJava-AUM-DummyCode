// This is a mutant program.
// Author : ysma

import java.util.*;


public class Example
{

    public Example()
    {
    }

    public  void erule21Dummy1()
    {
        int v2 = 5;
        java.lang.StringBuilder v1 = new java.lang.StringBuilder( v2 + 2 );
    }

    public  void erule21Dummy2()
    {
        int v2 = 5;
        java.lang.StringBuilder v1 = new java.lang.StringBuilder( v2 - 2 );
    }

    public  void erule21Dummy3()
    {
        int v2 = 5;
        java.lang.StringBuilder v1 = new java.lang.StringBuilder( v2 * 2 );
    }

    public  void erule21Dummy4()
    {
        int v2 = 5;
        java.lang.StringBuilder v1 = new java.lang.StringBuilder( v2 / 2 );
    }

    public  void erule21Dummy5()
    {
        int v2 = 5;
        java.lang.StringBuilder v1 = new java.lang.StringBuilder( v2 % 2 );
    }

    public  void erule21Dummy6()
    {
        java.util.List<Integer> v2 = new java.util.ArrayList<Integer>();
        v2.add( 1 );
        v2.add( 2 );
        v2.add( 3 );
        java.lang.StringBuilder v1 = new java.lang.StringBuilder( v2.size() % 2 );
    }

    public  void erule21NDummy1()
    {
        java.lang.String v2 = new java.lang.String( "Dummy" );
        java.lang.StringBuilder v1 = new java.lang.StringBuilder( v2 + 2 );
    }

}
