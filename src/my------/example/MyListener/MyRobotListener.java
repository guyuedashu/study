package MyListener;

public class MyRobotListener implements RobotListener {


    @Override
    public void working(Even even) {
        System.err.println("**************************我在工作---------我接听到了");

    }

    @Override
    public void dancing(Even even) {
        System.err.println("**************************我在跳舞");
    }

}
