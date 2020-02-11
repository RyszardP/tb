package com.ryszard.bot;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import static com.ryszard.bot.Connect.getDataFromDb;

public class TelegramBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "gregarious_bot";
    }

    @Override
    public String getBotToken() {
        return "954074327:AAFPFs-IaZ8tQNTP-Vo5Ylyczsr5E4Grv34";
    }

    @Override
    public void onUpdateReceived(Update update){

        String command = update.getMessage().getText().trim();
        SendMessage message = new SendMessage();

        if(command.equals("/info")){
            message.setText("Введите название города");
            message.setChatId(update.getMessage().getChatId());
            try {
                execute(message);
            } catch(TelegramApiException e){
                sendInfo(update, "Города с таким названием нет в нашей базе.");
            }
        }
        String dataFromDb = getDataFromDb(command);
        message.setText(dataFromDb);
        message.setChatId(update.getMessage().getChatId());
        try {
            execute(message);
        }  catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    private void sendInfo(Update update, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId());
        sendMessage.setText(message);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }



}
