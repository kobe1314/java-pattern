package com.hsbc.pattern.command.remotecommand;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/05
 */
@Data
public class RemoteControl {
    private List<Command> onCommandList;
    private List<Command> offCommandList;

    public RemoteControl() {
        offCommandList = new ArrayList<>();
        onCommandList = new ArrayList<>();
    }

    public void addOnCommand(Command oncommand) {
        this.onCommandList.add(oncommand);
    }

    public void addOffCommand(Command offCommand) {
        this.offCommandList.add(offCommand);
    }

    public void onButtonPressed(int slot) {
        onCommandList.get(slot).execute();
    }

    public void offButtonPressed(int slot) {
        offCommandList.get(slot).execute();
    }

    @Override
    public String toString() {
        onCommandList.stream().forEach(command -> {
            System.out.println(command.getClass().getName());
        });

        offCommandList.stream().forEach(offCommand -> {
            System.out.println(offCommand.getClass().getName());
        });
        return "RemoteControl{" +
                "onCommandList=" + onCommandList +
                ", offCommandList=" + offCommandList +
                '}';
    }
}
