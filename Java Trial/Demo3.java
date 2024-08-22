import java.awt.*;
class Demo3 {
public static void main(String args[])
{
Frame f=new Frame("FrameDemo");
f.setVisible(true);
f.setBackground(Color.red);
f.setSize(500,500);
Button b1=new Button("Button1");
f.add(b1);
f.setLayout(new FlowLayout());
TextField t1=new TextField(" ");
f.add(t1);
}}
