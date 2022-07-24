package ru.vk.client_chat;

/*
Java. Уровень 2. Урок 6.
"Работа с сетью. Сокеты. Написание эхо-сервера и консольного клиента".

Написать консольный вариант клиент\серверного приложения, в котором пользователь может писать сообщения, как на клиентской стороне, так и на серверной.
Т.е., если на клиентской стороне написать "Привет", нажать Enter, то сообщение должно передаться на сервер и там отпечататься в консоли.
Если сделать тоже самое на серверной стороне, сообщение соответственно передаётся клиенту и печатается у него в консоли.

Есть одна особенность, которую нужно учитывать: клиент или сервер может написать несколько сообщений подряд, такую ситуацию необходимо корректно обработать.

Разобраться с кодом с занятия, он является фундаментом проекта-чата.

ВАЖНО!
Сервер общается только с одним клиентом, т.е. не нужно запускать цикл, который будет ожидать второго/третьего/n-го клиентов.
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartClient extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartClient.class.getResource("chat-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Welcome to the chat room!");
        stage.setScene(scene);
        stage.setX(850);
        stage.setY(100);
        stage.setWidth(570);
        stage.setHeight(373);
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
