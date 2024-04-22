// program  for over loading
class overloading{
int add(int a,int b)
{
    int sum = a+b;
    return sum;
}
int add(int a, int b, int c)
{
    int sum = a+b+c;
    return sum;
}
}
class old
{
    public static void main(String[] args) 
    {
        overloading s = new overloading();
       System.out.println(s.add(10,20)); 
        System.out.println(s.add(10,20,30));
    }
}