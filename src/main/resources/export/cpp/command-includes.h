
\#include <frc2/command/CommandHelper.h>
\#include <frc2/command/Command.h>

#if (${command.getProperty("Requires").getValue()} != "None")
\#include "subsystems/#class(${command.getProperty("Requires").getValue()}).h"
#end