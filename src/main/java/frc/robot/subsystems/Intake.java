package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

public class Intake extends SubsystemBase {
    private TalonFX intakeTilt; // Motor for tilting the intake
    private TalonFX intakeRoller; // Motor for taking in the game piece

    public Intake() {
        // Initialize the Falcon 500 motors for intake tilt and intake roller
        intakeTilt = new TalonFX(10); // Replace 10 with your actual CAN ID
        intakeRoller = new TalonFX(11); // Replace 11 with your actual CAN ID

        // Configure motor settings (e.g., current limits, feedback sensors, etc.)
        // For example:
        // intakeTilt.configFactoryDefault();
        // intakeRoller.configFactoryDefault();
        // intakeTilt.configContinuousCurrentLimit(30);
        // intakeRoller.configContinuousCurrentLimit(30);
        // intakeTilt.enableCurrentLimit(true);
        // intakeRoller.enableCurrentLimit(true);
    }

    // Method to tilt the intake
    public void tiltIntake(double tiltSpeed) {
        intakeTilt.set(ControlMode.PercentOutput, tiltSpeed);
    }

    // Method to run the intake roller
    public void runIntakeRoller(double rollerSpeed) {
        intakeRoller.set(ControlMode.PercentOutput, rollerSpeed);
    }

    @Override
    public void periodic() {
        // Perform periodic tasks (e.g., sensor checks, updates)
    }
}