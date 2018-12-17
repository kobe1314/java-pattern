package com.hsbc.pattern.observer;

/**
 * @program: java-design
 * @description: subject
 * @author: Kobe
 * @create: 2018/12/16
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
