package com.message.failure.messagefailure.telegram;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class TelegramBot extends TelegramLongPollingBot {
    private final String botName;

    public TelegramBot() {
        super("8465197046:AAHloA-UX2cCa8wfugpEMZlQLtIN8qZ-oJs");
        this.botName = "message_failure_bot";
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        SendMessage message = new SendMessage(update.getMessage().getChatId().toString(), "Бот временно не работает");

        try {
            execute(message);
            message.setText("Подождите пару дней");
            execute(message);
            message.setText("Мне за это не платят");
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return botName;
    }
}
