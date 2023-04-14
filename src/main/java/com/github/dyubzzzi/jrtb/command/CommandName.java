package com.github.dyubzzzi.jrtb.command;

public enum CommandName {

    START("/start"),
    STOP("/stop"),
    HELP("/help"),
    NO("/no");

    private final String commandName;
    CommandName(String s) {
        this.commandName = s;
    }

    public String getCommandName() {
        return commandName;
    }
}
