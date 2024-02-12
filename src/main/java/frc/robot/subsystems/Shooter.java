package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

public class ShooterSubsystem extends SubsystemBase {
    private TalonFX shooterLeft;
    private TalonFX shooterRight;
    private TalonFX shooterTilt;
    private TalonFX shooterExtension;

    public ShooterSubsystem() {
        // Initialize the Falcon 500 motors for shooter subsystem
        shooterLeft = new TalonFX(10); // Replace 10 with your actual CAN ID
        shooterRight = new TalonFX(11); // Replace 11 with your actual CAN ID
        shooterTilt = new TalonFX(12); // Replace 12 with your actual CAN ID
        shooterExtension = new TalonFX(13); // Replace 13 with your actual CAN ID

        // Configure motor settings (e.g., current limits, feedback sensors, etc.)
        // For example:
        // shooterLeft.configFactoryDefault();
        // shooterRight.configFactoryDefault();
        // shooterTilt.configFactoryDefault();
        // shooterExtension.configFactoryDefault();
        // Set other motor parameters as needed
    }

    // Method to set shooter motor speeds
    public void setShooterSpeed(double leftSpeed, double rightSpeed) {
        shooterLeft.set(ControlMode.PercentOutput, leftSpeed);
        shooterRight.set(ControlMode.PercentOutput, rightSpeed);
    }

    // Method to tilt the shooter
    public void tiltShooter(double tiltSpeed) {
        shooterTilt.set(ControlMode.PercentOutput, tiltSpeed);
    }

    // Method to extend the shooter mechanism
    public void extendShooter(double extensionSpeed) {
        shooterExtension.set(ControlMode.PercentOutput, extensionSpeed);
    }

    @Override
    public void periodic() {
        // Perform periodic tasks (e.g., sensor checks, updates)
    }
}

public class Shooter {
    
}
