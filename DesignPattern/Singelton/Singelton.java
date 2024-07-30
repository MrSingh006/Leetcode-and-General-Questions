package DesignPattern.Singelton;

public class Singelton {
    private static Singelton single_instance=null;
    private Singelton()
    {
    }
    public static Singelton getInstance()
    {
        if(single_instance==null)
        {
            single_instance = new Singelton();
        }
        return single_instance;
    }
}
