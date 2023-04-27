package com.github.dyubzzzi.jrtb;

import com.github.dyubzzzi.jrtb.command.Command;
import com.github.dyubzzzi.jrtb.command.UnknownCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.dyubzzzi.jrtb.command.UnknownCommand.UNKNOWN_MESSAGE;
@DisplayName("Unit test for unknown command")
public class UnknownCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return "/fdgdfgdfgdbd";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
