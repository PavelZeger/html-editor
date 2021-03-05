package com.zeger.listeners;

import com.zeger.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * @author Pavel Zeger
 * @implNote html-editor
 * @since 19/02/2021
 */
public class UndoMenuListener implements MenuListener {
    private final View view;
    private final JMenuItem undoMenuItem;
    private final JMenuItem redoMenuItem;

    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }

    public void menuSelected(MenuEvent menuEvent) {
        undoMenuItem.setEnabled(view.canUndo());
        redoMenuItem.setEnabled(view.canRedo());
    }

    public void menuDeselected(MenuEvent e) {
    }

    public void menuCanceled(MenuEvent e) {
    }
}
