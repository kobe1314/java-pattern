package com.hsbc.pattern.command.remotecommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/05
 */
public class MacroCommand implements Command {
    List<Command> commands;

    public MacroCommand() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }
    @Override
    public void execute() {
        commands.stream().forEach(command -> command.execute());
    }

    @Override
    public void undo() {

    }
}
