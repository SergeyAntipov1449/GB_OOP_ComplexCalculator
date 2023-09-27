package Classes;

import Interfaces.iLogger;

/**
 * @author Developer Name.
 * @version 1.0.
 * @apiNote Класс для вывода сообщений логов в консоль.
 */
public class ConsoleLogger implements iLogger {

    @Override
    public void writeLog(String logMessage) {
        System.out.print("logMessage = " + logMessage + "\n");

    }
}
