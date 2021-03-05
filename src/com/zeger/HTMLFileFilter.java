package com.zeger;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * @author Pavel Zeger
 * @implNote html-editor
 * @since 05/03/2021
 */
public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        return ((f.isDirectory())
                || (f.getName().toLowerCase().endsWith(".htm"))
                || (f.getName().toLowerCase().endsWith(".html")));
    }

    @Override
    public String getDescription() {
        return "HTML and HTM files";
    }
}