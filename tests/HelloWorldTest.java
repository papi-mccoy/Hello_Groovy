/**
 * Created with IntelliJ IDEA.
 * User: mmccoy
 * Date: 2013-01-26
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldTest {

    public void testSetName() throws Exception {
        HelloWorld hw = new HelloWorld();
        hw.setName("Mike");
        if (hw.getName() != "Mike") throw new AssertionError();

    }

    public void testGetName() throws Exception {

    }

    public void testGreet() throws Exception {

    }
}
