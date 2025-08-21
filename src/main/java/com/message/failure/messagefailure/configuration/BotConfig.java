package com.message.failure.messagefailure.configuration;

import com.message.failure.messagefailure.telegram.TelegramBot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Configuration
public class BotConfig {
    private final TelegramBot telegramBot;

    public BotConfig(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @Bean
    public TelegramBotsApi telegramBotsApi() throws Exception {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(telegramBot);
        return botsApi;
    }
}
