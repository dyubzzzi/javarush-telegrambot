package com.github.dyubzzzi.jrtb;

import com.github.dyubzzzi.jrtb.command.Command;
import com.github.dyubzzzi.jrtb.command.StopCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.dyubzzzi.jrtb.command.CommandName.STOP;
import static com.github.dyubzzzi.jrtb.command.StopCommand.STOP_MESSAGE;
@DisplayName("Unit test for stop command")
public class StopCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
