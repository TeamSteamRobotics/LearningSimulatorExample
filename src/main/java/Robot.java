import amrelk.simulation.learning.RobotBase;


public class Robot extends RobotBase {

    @Override
    public void robotInit() {

    }

    @Override
    public void robotPeriodic() {
        setLeftWheel(counter % 1000 > 500 ? 1 : .75);
        setRightWheel(counter % 1000 > 500 ? .75 : 1);
    }
}
