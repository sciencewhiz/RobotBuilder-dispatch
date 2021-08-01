#header()
// ROBOTBUILDER TYPE: ConditionalCommand.

package ${package}.commands;
#set($command = $helper.getByName($command_name, $robot))

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ConditionalCommand;

#@autogenerated_code("imports", "")
#parse("${exporter_path}Command-imports.java")
#end
/**
 *
 */
public class #class($command.name) extends ConditionalCommand {
#@autogenerated_code("variable_declarations", "    ")
#parse("${exporter_path}Command-variable-declarations.java")
#end


#@autogenerated_code("constructors", "    ")
#parse("${exporter_path}ConditionalCommand-constructors.java")
#end
            false ////TODO: Auto Generated method stub
        );


#@autogenerated_code("variable_setting", "        ")
#parse("${exporter_path}Command-variable-setting.java")
#end
#@autogenerated_code("requires", "        ")
#parse("${exporter_path}Command-requires.java")
#end
    }


    @Override
    public boolean runsWhenDisabled() {
#@autogenerated_code("disabled", "        ")
#parse("${exporter_path}Command-disabled.java")
#end
    }

}
