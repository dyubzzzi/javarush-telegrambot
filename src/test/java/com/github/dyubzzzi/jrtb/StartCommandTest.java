package com.github.dyubzzzi.jrtb;

import com.github.dyubzzzi.jrtb.command.Command;
import com.github.dyubzzzi.jrtb.command.StartCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.dyubzzzi.jrtb.command.CommandName.START;
import static com.github.dyubzzzi.jrtb.command.StartCommand.START_MESSAGE;
@DisplayName("Init test for start command")
public class StartCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}
