package jgfu.ui;

import javax.swing.*;

public class Loginframe extends JFrame {
    //登录界面,空参构造
    public Loginframe() {
        this.setSize(400,400);
        this.setTitle("拼图登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        this.setVisible((true));

    }
}
