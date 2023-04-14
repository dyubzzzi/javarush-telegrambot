package com.github.dyubzzzi.jrtb.service;

import com.github.dyubzzzi.jrtb.bot.JavaRushTelegramBot;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class SendBotMessageServiceImpl implements SendBotMessageService {

    private final JavaRushTelegramBot javaRushTelegramBot;

    @Autowired
    public SendBotMessageServiceImpl(JavaRushTelegramBot javaRushTelegramBot) {
        this.javaRushTelegramBot = javaRushTelegramBot;
    }

    @Override
    public void sendMessage(String chartId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chartId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try {
            javaRushTelegramBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
