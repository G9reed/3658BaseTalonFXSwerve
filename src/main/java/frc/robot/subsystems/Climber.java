package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Climber extends SubsystemBase {
    private final CANSparkMax liftMotor;

    public Climber() {
        // Initialize the REV NEO motor for the climber
        liftMotor = new CANSparkMax(10, MotorType.kBrushless); // Replace 10 with your actual CAN ID

        // Configure motor settings (e.g., current limits, feedback sensors, etc.)
        // For example:
        // liftMotor.restoreFactoryDefaults();
        // liftMotor.setSmartCurrentLimit(30);
        // Set other motor parameters as needed
    }

    // Method to move the climber arm up
    public void moveUp(double speed) {
        liftMotor.set(speed); // Positive speed moves the climber arm up
    }

    // Method to move the climber arm down
    public void moveDown(double speed) {
        liftMotor.set(-speed); // Negative speed moves the climber arm down
    }

    @Override
    public void periodic() {
        // Perform periodic tasks (e.g., sensor checks, updates)
    }
}
