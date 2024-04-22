class harish
{
    void walk()
    {
        System.out.println("he can walk");
    }
}
class nagesh extends harish
{
    void run()
    {
        System.out.println("he can run");
    }
}
class dj extends nagesh
{
    void sing()
    {
        System.out.println("he can sing");
    }
}
class afroz extends dj
{
    void work()
    {
        System.out.println("he can work");
    }
}
class naveen extends afroz
{
    void go()
    {
        System.out.println("he can go ");
    }
}
class hybrid 
{
    public static void main(String[] args)
     {
        nagesh n = new nagesh();
        n.run();
        naveen n1 = new naveen();
        n1.go();

        
    }
}