package com.github.dyubzzzi.jrtb;

import com.github.dyubzzzi.jrtb.command.Command;
import com.github.dyubzzzi.jrtb.command.HelpCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.dyubzzzi.jrtb.command.CommandName.HELP;
import static com.github.dyubzzzi.jrtb.command.HelpCommand.HELP_MESSAGE;
@DisplayName("Unit test for help command")
public class HelpCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}
