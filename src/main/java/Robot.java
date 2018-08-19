import amrelk.simulation.learning.RobotBase;


public class Robot extends RobotBase {

    @Override
    public void robotInit() {
        setLeftWheel(0.3);
        setRightWheel(0.2);
    }

    @Override
    public void robotPeriodic() {
    }
}
