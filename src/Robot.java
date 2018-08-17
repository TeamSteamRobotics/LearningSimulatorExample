import amrelk.simulation.learning.RobotFrame;


public class Robot extends RobotFrame {

    @Override
    public void robotInit() {

    }

    @Override
    public void robotPeriodic() {
        setPosX(counter);
    }
}
