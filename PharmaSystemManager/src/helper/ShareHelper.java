/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import model.Employee;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import model.Branch;

/**
 *
 * @author rondw
 */
public class ShareHelper {

    public static final ImageIcon APP_ICON;
    public static String status = null;

    static {
        APP_ICON = new ImageIcon("src\\icon\\logo.png");
    }

    public static boolean saveLogo(File file) {
        File dir = new File("icon");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(dir, file.getName());
        try {
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static ImageIcon readLogo(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

    public static Employee USER = null;
    public static Branch Branch = null;
    public static JFrame frame = null;

    public static String getStatus() {
        return ShareHelper.USER.getEmployeeID() + " - " + DateHelper.now().toString() + " - " + ShareHelper.status;
    }

    public static void logoff() {
        ShareHelper.USER = null;
    }

    public static boolean authenticated() {
        return ShareHelper.USER != null;
    }
}
