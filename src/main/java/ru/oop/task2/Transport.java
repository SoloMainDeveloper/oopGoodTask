package ru.oop.task2;

/**
 * Транспорт
 */
public interface Transport extends Positioned {
    /**
     * Передвигает transport и person максимально близко до destination, тем самым
     * изменяя местоположение person и своё собственное.
     */
    void moveTo(Person person, Position destination);
}
