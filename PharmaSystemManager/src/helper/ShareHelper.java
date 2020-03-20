/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.awt.Image;
import model.Employee;
import java.io.File;
import java.io.FileInputStream;
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

    /**
     * Ảnh biểu tượng của ứng dụng, xuất hiện trên mọi cửa sổ
     */
    public static final ImageIcon APP_ICON;
    /**
     * Trạng thái của các đối tượng
     */
    public static String status = null;

    static {
        // Tải biểu tượng ứng dụng
        APP_ICON = new ImageIcon("src\\icon\\logo.png");
    }

    /**
     * Sao chép file logo chuyên đề vào thư mục logo
     *
     * @param file là đối tượng file ảnh
     * @return chép được hay không
     */
    public static boolean saveLogo(File file) {
        File dir = new File("src\\avatars");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(dir, file.getName());
        try {
            // Copy vào thư mục logos (đè nếu đã tồn tại)
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static ImageIcon readLogo(String fileName) {
        File path = new File("src\\avatars", fileName);
        ImageIcon icon = new ImageIcon(path.getAbsolutePath());
        Image newImage = icon.getImage().getScaledInstance(225, 252, Image.SCALE_DEFAULT);
        return new ImageIcon(newImage);
    }
    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static Employee USER = null;
    /**
     * Đối tượng này chứa thông tin đại lý của nhân viên đang làm việc
     */
    public static Branch Branch = null;
    /**
     * Đối tượng này chứa giao diện chính đang sử dụng
     */
    public static JFrame frame = null;
    
    public static File file = null;
    public static FileInputStream fileInputStream = null;

    /**
     * Hàm này trả về thông tin trạng thái của các đối tượng
     *
     * @return
     */
    public static String getStatus() {
        return ShareHelper.USER.getEmployeeID() + " - " + DateHelper.DATE_FORMATER.format(DateHelper.now()) + " - " + ShareHelper.status;
    }

    /**
     * Hàm này trả về chức vụ của người dùng
     *
     * @return
     */
    public static String getUserPosition() {
        if (ShareHelper.USER.isRole() && (ShareHelper.USER.getStoreID() == null || ShareHelper.USER.getStoreID().length() == 0)) {
            return "Boss";
        } else if (ShareHelper.USER.isRole() && (ShareHelper.USER.getStoreID().length() > 0)) {
            return "Manager";
        } else {
            return "Pharmacist";
        }
    }

    /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void logoff() {
        ShareHelper.USER = null;
    }

    /**
     * Kiểm tra xem đăng nhập hay chưa
     *
     * @return đăng nhập hay chưa
     */
    public static boolean authenticated() {
        return ShareHelper.USER != null;
    }
}
