#set($subsystem = $helper.getByName($subsystem-name, $robot))

\#include "#class($subsystem.name).h"
\#include "../Robotmap.h"
\#include "SmartDashboard/SmartDashboard.h"
#set($subsystem = $helper.getByName($subsystem-name, $robot))

#class($subsystem.name)::#class($subsystem.name)() : PIDSubsystem("#class($subsystem.name)", Kp, Ki, Kd) {
#l@autogenerated_code("pid", "        ")
#parse("${exporter-path}PIDSubsystem-pid.cpp")
#end

#@autogenerated_code("declarations", "    ")
#parse("${exporter-path}Subsystem-declarations.cpp")
#end

	// Use these to get going:
	// SetSetpoint() -  Sets where the PID controller should move the system
	//                  to
	// Enable() - Enables the PID controller.
}

double ExamplePIDSubsystem::ReturnPIDInput() {
	// Return your input value for the PID loop
	// e.g. a sensor, like a potentiometer:
	// yourPot->SetAverageVoltage() / kYourMaxVoltage;	
#@autogenerated_code("source", "        ")
#parse("${exporter-path}PIDSubsystem-source.cpp")
#end
}

void ExamplePIDSubsystem::UsePIDOutput(double output) {
	// Use output to drive your system, like a motor
	// e.g. yourMotor->Set(output);
#@autogenerated_code("output", "        ")
#parse("${exporter-path}PIDSubsystem-output.cpp")
#end
}

void ExamplePIDSubsystem::InitDefaultCommand() {
	// Set the default command for a subsystem here.
	//setDefaultCommand(new MySpecialCommand());
#@autogenerated_code("default_command", "        ")
#parse("${exporter-path}Subsystem-default_command.cpp")
#end
}
