package com.message.failure.messagefailure.telegram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class TelegramBot extends TelegramLongPollingBot {
    private final String botName;

    public TelegramBot(@Value("${TELEGRAM_BOT_NAME}") String botName, @Value("${TELEGRAM_BOT_TOKEN}") String token){
        super(token);
        this.botName = botName;
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        SendMessage message = new SendMessage(update.getMessage().getChatId().toString(), "Бот временно не работает");
    }

    @Override
    public String getBotUsername() {
        return botName;
    }
}
