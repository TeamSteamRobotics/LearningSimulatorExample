import amrelk.simulation.learning.*;


public class Robot extends RobotBase {

    Joystick stick;
    Talon leftMotor;
    Talon rightMotor;
    Drive drive;
    Encoder leftEncoder;
    Encoder rightEncoder;

    @Override
    public void robotInit() {
        stick  = new Joystick(0);

        leftMotor = new Talon(0);
        rightMotor = new Talon(1);
        drive = new Drive(leftMotor, rightMotor);

        leftEncoder = new Encoder(2, 3);
        rightEncoder = new Encoder(4, 5);
    }

    @Override
    public void autonomousPeriodic() {
        drive.drive(1, .1);
        System.out.println((double)leftEncoder.get()/2048.0);
    }

    @Override
    public void teleopPeriodic() {
        drive.drive(stick.getY(), stick.getX());
    }
}
