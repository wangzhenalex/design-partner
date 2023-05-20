import java.util.ArrayList;
import java.util.List;
/*invoker执行者*/
public class ManageServer {
    List<Command> commandList = new ArrayList<>();
    public void addCommand(Command command) {
        commandList.add(command);
    }
    public void execute(){
        for(Command command : commandList){
            command.execute();
        }
    }
}