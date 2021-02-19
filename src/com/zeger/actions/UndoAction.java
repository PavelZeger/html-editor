package com.zeger.actions;

import com.zeger.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author Pavel Zeger
 * @implNote html-editor
 * @since 19/02/2021
 */
public class UndoAction extends AbstractAction {
    private View view;

    public UndoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
