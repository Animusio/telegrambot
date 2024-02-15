package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;
public class bot extends TelegramLongPollingBot{
    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()) {
            long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            if ("/start".equals(text)) {
                sendReplyKeyboard(chatId, "Доступные команды", "/botInfo","/botspez","/howToDoEggs");
            } else if ("/botInfo".equals(text)) {
                sendReplyKeyboard(chatId, "Доступные команды бота", "/botBark","/botMeow");
            } else if ("/botspez".equals(text)) {
                sendReplyKeyboard(chatId, "инфа о спез", "/whatIsSpez","/linkToSpez");
            } else if ("/botBark".equals(text)) {
                sendTextMessage(chatId, "Бот гаукает");
            } else if ("/botMeow".equals(text)) {
                sendTextMessage(chatId, "Бот мяукает");
            }else if ("/whatIsSpez".equals(text)) {
                sendTextMessage(chatId, "SPEZ - это специальная нефтехимическая экономическая зона.");
            } else if ("/linkToSpez".equals(text)) {
                sendTextMessage(chatId, "Ссылка на сайт","https://www.abbreviationfinder.org/acronyms/spez.html");
            } else if ("/howToDoEggs".equals(text)) {
                sendInlineKeyboard(chatId, "Способы приготовления яиц","Всмятку","Вкрутую","СкрембледЕггс");
            }

        }else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            long chatId = callbackQuery.getMessage().getChatId();
            if ("Всмятку".equals(data)) {
                sendTextMessage(chatId, "Приготовление яичницы всмятку довольно просто. Вот базовый рецепт:\n" +
                        "\n" +
                        "Ингредиенты:\n" +
                        "\n" +
                        "Яйца\n" +
                        "Соль и перец по вкусу\n" +
                        "Масло или масло для жарки\n" +
                        "Инструкции:\n" +
                        "\n" +
                        "Разбейте яйца в миску. Обычно на одного человека берут 2-3 яйца.\n" +
                        "\n" +
                        "Добавьте соль и перец по своему вкусу. Вы можете также добавить другие приправы или зелень для большего вкуса.\n" +
                        "\n" +
                        "Взбейте яйца венчиком или вилкой до тех пор, пока белки и желтки не смешаются.\n" +
                        "\n" +
                        "Разогрейте сковороду с небольшим количеством масла на среднем огне.\n" +
                        "\n" +
                        "Когда масло разогреется, добавьте взбитые яйца в сковороду.\n" +
                        "\n" +
                        "Начните помешивать яйца лопаткой или венчиком, чтобы они равномерно приготовились.\n" +
                        "\n" +
                        "Продолжайте перемешивать яйца, пока они не станут немного твердыми, но еще сочными.\n" +
                        "\n" +
                        "Как только яйца приготовятся до желаемой степени, выключите огонь и подавайте.\n" +
                        "\n" +
                        "Яичница всмятку готова к подаче! Подавайте ее горячей с тостами, помидорами или другими любимыми добавками.");
            } else if ("Вкрутую".equals(data)) {
                sendTextMessage(chatId, "Ингредиенты:\n" +
                        "\n" +
                        "Яйца\n" +
                        "Соль и перец по вкусу\n" +
                        "Масло для жарки (можно использовать сливочное или оливковое масло)\n" +
                        "Дополнительные ингредиенты по вашему выбору: тертый сыр, мелко нарезанные зелень, ломтики ветчины, помидоры и т. д.\n" +
                        "Инструкции:\n" +
                        "\n" +
                        "Разогрейте сковороду на среднем огне и добавьте масло для жарки.\n" +
                        "\n" +
                        "Пока масло разогревается, разбейте яйца в миску и взбейте их венчиком.\n" +
                        "\n" +
                        "Добавьте соль и перец по вкусу, а также любые дополнительные ингредиенты, которые вы выбрали.\n" +
                        "\n" +
                        "Полейте взбитые яйца в разогретую сковороду.\n" +
                        "\n" +
                        "Начните перемешивать яйца лопаткой, как бы крутя их внутри сковороды.\n" +
                        "\n" +
                        "Продолжайте крутить яйца в сковороде, пока они не достигнут желаемой степени приготовленности.\n" +
                        "\n" +
                        "Когда яйца готовы, выложите их на тарелку.\n" +
                        "\n" +
                        "Подайте вкрутую яичницу с любимыми гарнирами или просто на тостами.\n" +
                        "\n" +
                        "Приятного аппетита!");
            }else if ("СкрембледЕггс".equals(data)) {
                sendTextMessage(chatId, "скремблд эггс (яиц-буквально разбитых в сковороду и перемешанных):\n" +
                        "\n" +
                        "Ингредиенты:\n" +
                        "\n" +
                        "Яйца\n" +
                        "Соль и перец по вкусу\n" +
                        "Масло для жарки\n" +
                        "Молоко (по желанию)\n" +
                        "Инструкции:\n" +
                        "\n" +
                        "Разогрейте сковороду на среднем огне и добавьте небольшое количество масла.\n" +
                        "\n" +
                        "Взбейте яйца венчиком в миске. Вы можете добавить немного молока (1-2 ст. л.) для более воздушной текстуры.\n" +
                        "\n" +
                        "Полейте взбитые яйца в разогретую сковороду.\n" +
                        "\n" +
                        "Начните перемешивать яйца лопаткой, как бы \"скребя\" их со дна сковороды. Это создаст нежные и влажные хлопья яиц.\n" +
                        "\n" +
                        "Продолжайте готовить, постоянно помешивая, пока яйца не станут приготовленными, но еще сочными.\n" +
                        "\n" +
                        "Добавьте соль и перец по вкусу, перемешайте.\n" +
                        "\n" +
                        "Когда яйца готовы, сразу выложите их на тарелку, чтобы предотвратить пересушивание.\n" +
                        "\n" +
                        "Подавайте скремблд эггс горячими, посыпанными зеленью или подавайте с тостами.\n" +
                        "\n" +
                        "Приятного аппетита!");
            }
        }else{
            long chatId = update.getMessage().getChatId();
            sendReplyKeyboard(chatId, "Привет!", "/start");
        }
    }
    private void sendReplyKeyboard(long chatId, String text, String... buttonLabel1) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);

        KeyboardRow row = new KeyboardRow();
        List<KeyboardRow> keyboard = new ArrayList<>();
        for (String buttonLabel : buttonLabel1) {
            KeyboardButton button = new KeyboardButton(buttonLabel);
            row.add(button);
        }
        keyboard.add(row);
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup(keyboard);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    private void sendInlineKeyboard(long chatId, String text, String... buttons) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        for (String buttonLabel : buttons) {
            InlineKeyboardButton button = new InlineKeyboardButton();
            button.setText(buttonLabel);
            button.setCallbackData(buttonLabel);
            List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
            keyboardButtonsRow.add(button);
            rowList.add(keyboardButtonsRow);
        }

        InlineKeyboardMarkup markupKeyboard = new InlineKeyboardMarkup();
        markupKeyboard.setKeyboard(rowList);

        sendMessage.setReplyMarkup(markupKeyboard);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sendTextMessage(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sendTextMessage(long chatId, String text, String url) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(text);
        button.setUrl(url);

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(button);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);

        InlineKeyboardMarkup markupKeyboard = new InlineKeyboardMarkup();
        markupKeyboard.setKeyboard(rowList);

        sendMessage.setReplyMarkup(markupKeyboard);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "SeniorPomidorio_bot";
    }
    @Override
    public String getBotToken() {
        return "6868633543:AAHPM6iMplt_HdL2-ieWxAFqm0uUMfGhIvA";
    }
}
