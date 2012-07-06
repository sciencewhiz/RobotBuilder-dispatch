package ${package}.subsystems;
#set($subsystem = $helper.getByName($subsystem-name, $robot))

import ${package}.RobotMap;
import ${package}.commands.*;
${helper.getImports($subsystem, "RobotMap")}
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class #class($subsystem.name) extends PIDSubsystem {
#@autogenerated_code("declarations", "    ")
#parse("${exporter-path}Subsystem-declarations.java")
#end

    // Initialize your subsystem here
    public #class($subsystem.name)() {
#@autogenerated_code("pid", "        ")
#parse("${exporter-path}PIDSubsystem-pid.java")
#end

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
#@autogenerated_code("default_command", "        ")
#parse("${exporter-path}Subsystem-default_command.java")
#end
    
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
	
#@autogenerated_code("source", "        ")
#parse("${exporter-path}PIDSubsystem-source.java")
#end
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
	
#@autogenerated_code("output", "        ")
#parse("${exporter-path}PIDSubsystem-output.java")
#end
    }
}
