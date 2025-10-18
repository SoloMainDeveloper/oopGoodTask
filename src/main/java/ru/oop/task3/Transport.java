package ru.oop.task3;

/**
 * Транспорт
 */
public interface Transport extends Positioned {
    /**
     * Передвигает transport и person максимально близко до destination
     */
    void moveTo(Person person, Position destination);
}
