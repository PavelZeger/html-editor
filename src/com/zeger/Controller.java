package com.zeger;

import javax.swing.text.html.HTMLDocument;
import java.io.File;

/**
 * @author Pavel Zeger
 * @implNote html-editor
 * @since 13/02/2021
 */
public class Controller {

    private View view;
    private HTMLDocument document;
    private File currentFile;

    public Controller(View view) {
        this.view = view;
    }

    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        view.setController(controller);
        view.init();
        controller.init();

    }

    public void init() {

    }

    public void exit() {
        System.exit(0);
    }

}
