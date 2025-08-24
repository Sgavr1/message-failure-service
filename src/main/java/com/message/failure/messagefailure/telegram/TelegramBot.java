package com.message.failure.messagefailure.telegram;

import com.message.failure.messagefailure.data.Factory;
import com.message.failure.messagefailure.model.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TelegramBot extends TelegramLongPollingBot {
    private final String botName;
    private final Map<Long, UserTelegramBot> telegramUsers;

    public TelegramBot(@Value("${telegram.bot.secret.name}") String botName, @Value("${telegram.bot.secret.token}") String token) {
        super("8465197046:AAHloA-UX2cCa8wfugpEMZlQLtIN8qZ-oJs");
        System.out.println(botName);
        System.out.println(token);
        this.botName = "message_failure_bot";

        telegramUsers = new HashMap<>();

        User tl = new User();
        tl.setLogin("TL");
        tl.setRole("TL");
        tl.setPassword("1234");

        User op = new User();
        op.setLogin("OP");
        op.setRole("OP");
        op.setPassword("1234");

        Factory.users.put("TL", tl);
        Factory.users.put("OP", op);
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        long userId = update.getMessage().getChatId();
        if (!telegramUsers.containsKey(userId)) {
            SendMessage message = new SendMessage(update.getMessage().getChatId().toString(), "Вы не авторизированы. Напишите логин.");
            telegramUsers.put(userId, null);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
            return;
        }
        UserTelegramBot telegramUser = telegramUsers.get(userId);
        if (telegramUser == null) {
            String login = update.getMessage().getText();
            if (Factory.users.containsKey(login)) {
                SendMessage message = new SendMessage(update.getMessage().getChatId().toString(), "Напишите пароль.");
                telegramUser = new UserTelegramBot();
                telegramUser.setUser(Factory.users.get(login));
                telegramUsers.put(userId, telegramUser);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                SendMessage message = new SendMessage(update.getMessage().getChatId().toString(), "Неправельний логин.");
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            return;
        }
        if (telegramUser.getUpdate() == null) {
            String password = update.getMessage().getText();
            if(telegramUser.getUser().getPassword().equals(password)){
                SendMessage message = new SendMessage(update.getMessage().getChatId().toString(), "Успешный вход.");
                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboard = new ArrayList<>();

                KeyboardRow row = new KeyboardRow();
                row.add("Робот 1 сломался");
                row.add("Робот 2 сломался");
                row.add("Хз что, но чтото не работает");
                keyboard.add(row);

                keyboardMarkup.setKeyboard(keyboard);
                keyboardMarkup.setResizeKeyboard(true);

                message.setChatId(update.getMessage().getChatId());
                message.setText("Ось тобі кнопки:");
                message.setReplyMarkup(keyboardMarkup);

                telegramUser.setUpdate(update);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                SendMessage message = new SendMessage(update.getMessage().getChatId().toString(), "Неверный пароль.");
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            return;
        }

        if(telegramUser.getUser().getRole() == "OP"){
            UserTelegramBot tl = telegramUsers.get("TL");
            if(tl != null && tl.getUser() != null && tl.getUpdate() != null){
                SendMessage message = new SendMessage(tl.getUpdate().getMessage().getChatId().toString(), update.getMessage().getText());
                try {
                    execute(message);
                    execute(message);
                    execute(message);
                    execute(message);
                    execute(message);
                    execute(message);
                    execute(message);
                    execute(message);
                    execute(message);
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public String getBotUsername() {
        return botName;
    }
}
