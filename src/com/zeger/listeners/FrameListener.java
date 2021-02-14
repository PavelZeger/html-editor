package com.zeger.listeners;

import com.zeger.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Pavel Zeger
 * @implNote html-editor
 * @since 14/02/2021
 */
public class FrameListener extends WindowAdapter {

    private View view;

    public FrameListener(View view) {
        this.view = view;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        view.exit();
    }
}
