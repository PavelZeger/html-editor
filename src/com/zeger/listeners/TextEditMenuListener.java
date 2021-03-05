package com.zeger.listeners;

import com.zeger.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;

/**
 * @author Pavel Zeger
 * @implNote html-editor
 * @since 19/02/2021
 */
public class TextEditMenuListener implements MenuListener {
    private final View view;

    public TextEditMenuListener(View view) {
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent menuEvent) {
        JMenu source = (JMenu) menuEvent.getSource();
        Component[] menuComponents = source.getMenuComponents();
        for (Component component : menuComponents) {
            component.setEnabled(view.isHtmlTabSelected());
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}