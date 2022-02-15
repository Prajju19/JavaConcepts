package Interface;

public class Operation implements Calling,Mail {
    public void call()
    {
        System.out.println("Call is ringing");
    }
    public void GreenBtn()
    {
        System.out.println("if green button is pressed call will be connected");
    }
    public void RedBtn()
    {
        System.out.println("if red button is pressed call will be disconnected");
    }
    public void open()
    {
        System.out.println("message is opened ");
    }
    public void close()
    {
        System.out.println("message is closed");
    }
}
