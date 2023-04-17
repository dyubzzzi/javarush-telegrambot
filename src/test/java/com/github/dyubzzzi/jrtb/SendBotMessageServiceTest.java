package com.github.dyubzzzi.jrtb;

import com.github.dyubzzzi.jrtb.bot.JavaRushTelegramBot;
import com.github.dyubzzzi.jrtb.service.SendBotMessageService;
import com.github.dyubzzzi.jrtb.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@DisplayName("Unit test for SendBotMessageService")
public class SendBotMessageServiceTest {
    private JavaRushTelegramBot javaRushTelegramBot;
    private SendBotMessageService sendBotMessageService;

    @BeforeEach
    public void init() {
        javaRushTelegramBot = Mockito.mock(JavaRushTelegramBot.class);
        sendBotMessageService = Mockito.mock(SendBotMessageServiceImpl.class);
    }

    @Test
    public void shouldProperlySendMessage() throws TelegramApiException {
        //given
        String chatId = "test_chat_id";
        String message = "test_message";

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(message);
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);

        //when
        sendBotMessageService.sendMessage(chatId, message);

        //then
        Mockito.verify(javaRushTelegramBot).execute(sendMessage);
    }

}
