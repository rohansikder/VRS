package com.ul.vrs.entity;

/**
 * Subject: subjecr abstraction
 *
 * @author Rohan Sikder
 * @version 1.0.0
 * @since 1.0.0
 */
public interface Subject {
    /**
     * Attach passed observer
     *
     * @param o observer to be attached
     */
    public void attach(Observer o);

    /**
     * Detach passed observer
     *
     * @param o observer to be detached
     */
    public void detach(Observer o);

    /**
     * Notify all observers
     */
    public void notifyObservers();
}