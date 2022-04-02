package com.sfnet.controller;

import com.sfnet.impl.DesktopMangerImpl;
import com.sfnet.model.DesktopEntry;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DesktopManger implements DesktopMangerImpl {

    @Override
    public void make(DesktopEntry desktopEntry) {
        try {
            FileOutputStream fos = new FileOutputStream("/usr/share/applications/" + desktopEntry.getApplicationName() + ".desktop", true);
            OutputStreamWriter writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            PrintWriter out = new PrintWriter(writer);
            out.println("[Desktop Entry]");
            out.println("Version=1.0");
            out.println("Type=Application");
            out.println("Terminal=false");
            out.println("Name=" + desktopEntry.getApplicationName());
            out.println("Icon=" + desktopEntry.getPathToIcon());
            out.println("Exec=" + desktopEntry.getPathToExecute());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}