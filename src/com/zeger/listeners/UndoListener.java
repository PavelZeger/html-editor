package com.zeger.listeners;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

/**
 * @author Pavel Zeger
 * @implNote html-editor
 * @since 05/03/2021
 */
public class UndoListener implements UndoableEditListener {
    private final UndoManager undoManager;

    public UndoListener(UndoManager undoManager) {
        this.undoManager = undoManager;
    }

    @Override
    public void undoableEditHappened(UndoableEditEvent e) {
        undoManager.addEdit(e.getEdit());
    }
}

