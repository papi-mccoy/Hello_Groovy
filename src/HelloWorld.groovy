/**
 * Created with IntelliJ IDEA.
 * User: mmccoy
 * Date: 2013-01-26
 * Time: 9:16 PM
 * To change this template use File | Settings | File Templates.
 */
class HelloWorld {
    private String Name;

    public void setName(String name)
    {
        this.Name = name;
    }

    public String getName()
    {
        return Name;
    }

    public String greet()
    {
        return "Hello " + Name;
    }
    public static void main(String[] args)
    {
        HelloWorld hw = new HelloWorld();
        hw.setName("Groovy codeing");
        println(hw.greet());
    }


}
