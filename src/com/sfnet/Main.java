package com.sfnet;


import com.sfnet.controller.DesktopManger;
import com.sfnet.model.DesktopEntry;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DesktopEntry desktopEntry = new DesktopEntry();
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your application name:");
                desktopEntry.setApplicationName(scanner.nextLine());
            System.out.println("Enter your path to execute file:");
                desktopEntry.setPathToExecute(scanner.nextLine());
            System.out.println("Enter your path to application icon:");
                desktopEntry.setPathToIcon(scanner.nextLine());
                DesktopManger desktopManger = new DesktopManger();
                desktopManger.make(desktopEntry);
    }
}
