package jgfu.ui;

import javax.swing.*;

public class RegisterFrame extends JFrame {
    //注册界面
    public RegisterFrame() {
        this.setSize(400, 400);
        this.setTitle("拼图注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
}
