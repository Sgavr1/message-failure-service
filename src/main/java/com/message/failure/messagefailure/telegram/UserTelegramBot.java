package com.message.failure.messagefailure.telegram;

import com.message.failure.messagefailure.model.entity.User;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UserTelegramBot {
    private User user;
    private Update update;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Update getUpdate() {
        return update;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    public UserTelegramBot(User user, Update update) {
        this.user = user;
        this.update = update;
    }

    public UserTelegramBot() {
    }
}