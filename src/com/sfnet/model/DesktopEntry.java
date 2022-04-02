package com.sfnet.model;

public class DesktopEntry {

    private String applicationName;
    private String pathToExecute;
    private String pathToIcon;

    public DesktopEntry(){

    }

    public DesktopEntry(String applicationName, String pathToExecute, String pathToIcon) {
        this.applicationName = applicationName;
        this.pathToExecute = pathToExecute;
        this.pathToIcon = pathToIcon;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getPathToExecute() {
        return pathToExecute;
    }

    public void setPathToExecute(String pathToExecute) {
        this.pathToExecute = pathToExecute;
    }

    public String getPathToIcon() {
        return pathToIcon;
    }

    public void setPathToIcon(String pathToIcon) {
        this.pathToIcon = pathToIcon;
    }
}
