package com.github.dyubzzzi.jrtb;

import com.github.dyubzzzi.jrtb.command.Command;
import com.github.dyubzzzi.jrtb.command.NoCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.dyubzzzi.jrtb.command.CommandName.NO;
import static com.github.dyubzzzi.jrtb.command.NoCommand.NO_MESSAGE;
@DisplayName("Unit test for no command")
public class NoCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}
