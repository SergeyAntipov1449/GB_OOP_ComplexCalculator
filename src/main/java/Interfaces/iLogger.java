package Interfaces;

/**
 * @apiNote Интерфейс для описания взаимодейсвтия с классами логирования.
 * @author Developer Name.
 * @version 1.0.
 */
public interface iLogger {
    /**
     * Метод записи соодщения в лог
     * @param logMessage сообщение для записи в лог
     */
    void writeLog(String logMessage);
}
