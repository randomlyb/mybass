package jgfu.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJrame extends JFrame implements KeyListener {
    int [][]arr=new int[3][3];
    int x=0;int y=0;
    //游戏的主界面
    public GameJrame() {
        //初始化界面
        initFrame();
        //初始化菜单
        einitjmnuebu();
        //初始化数组
        initarr();
        //初始化图片
        initImage();

        this.setVisible(true);
    }

    private void initarr() {  int []temparr=new int[]{0,1,2,3,4,5,6,7,8};
        Random r=new Random();
        for (int i=0;i<temparr.length;i++){
            int temp=temparr[i];
            int j=r.nextInt(temparr.length);
            temparr[i]=temparr[j];
            temparr[j]=temp;
        }
        for (int i=0;i<temparr.length;i++){
            if (temparr[i]==0){
                x=i/3;y=i%3;
            }else arr[i/3][i%3]=temparr[i];

        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }}

    private void initImage() {
        //清空原本出现的所有照片
        this.getContentPane().removeAll();

      for (int i = 0; i < 3; i++)
          for (int j = 0; j < 3; j++) {
              int num = arr[i][j];
              ImageIcon imageIcon = new ImageIcon(     "D:\\travlejava\\vdv\\yu\\number" + num + ".png");

              JLabel jLabel = new JLabel(imageIcon);
              jLabel.setBounds(163 * j+53, 105 * i+134, 163, 105);
              //给图片添加边框,让图片凹或凸
              jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
        this.add(jLabel);

    }
      //添加背景图片
        ImageIcon imageIcon = new ImageIcon("D:\\travlejava\\vdv\\yu\\屏幕截图 2025-02-16 122352.png");
      JLabel jLabel = new JLabel(imageIcon);
      jLabel.setBounds(40, 40, 508, 460);
      this.getContentPane().add(jLabel);
      //刷新界面
        this.getContentPane().repaint();

}

private void einitjmnuebu() {
        //初始化菜单
        //创建整个的菜单对象
        JMenuBar jMenuBar=new JMenuBar();
        //创建菜单上两个选项的对象
        JMenu factionmenu=new JMenu("功能");
        JMenu aboutmenubar=new JMenu("关于我们");
        //创建选项下的对象
        JMenuItem replayitem=new JMenuItem("重新游戏");
        JMenuItem reloginitem=new JMenuItem("重新登录");
        JMenuItem reexititem=new JMenuItem("退出游戏");

        JMenuItem aboutitem=new JMenuItem("公众号");
        //将选项加入到菜单上
        factionmenu.add(replayitem);
        factionmenu.add(reloginitem);
        factionmenu.add(reexititem);
        //将选项加入到菜单上
        aboutmenubar.add(aboutitem);
        //将菜单加入到菜单栏中
        jMenuBar.add(factionmenu);
        jMenuBar.add(aboutmenubar);
        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图游戏");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //设置布局为空布局，否则有默认的布局
        this.setLayout(null);
        //添加键盘事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        if (code==65){
            this.getContentPane().removeAll();
            ImageIcon imageIcon = new ImageIcon("D:\\travlejava\\vdv\\yu\\屏幕截图 2025-02-16 122352.png");
            JLabel jLabel = new JLabel(imageIcon);
            jLabel.setBounds(140, 140, 200, 200);
            this.getContentPane().add(jLabel);
            ImageIcon imageIcon1 = new ImageIcon("D:\\travlejava\\vdv\\yu\\屏幕截图 2025-02-16 122352.png");
            JLabel jLabel2 = new JLabel(imageIcon1);
            jLabel.setBounds(40, 40, 508, 460);
            this.getContentPane().add(jLabel);
            //刷新界面
            this.getContentPane().repaint();

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code=e.getKeyCode();
        if (code==37){
            System.out.println("向左");
            if (x==0){
                System.out.println("越界");
            }else {
                arr[x][y]=arr[x-1][y];
                arr[x-1][y]=0;
                x--;initImage();
            }
        }else if (code==38){
            System.out.println("向上");
            if (y==0){
                System.out.println("越界");
            }else {
                arr[x][y]=arr[x][y-1];
                arr[x][y-1]=0;
                y--;initImage();
            }
        }else if (code==39){
            System.out.println("向右");
            if (x==2){
                System.out.println("越界");
            }else {
                arr[x][y]=arr[x+1][y];
                arr[x+1][y]=0;initImage();
            }
        }else if (code==40){
            System.out.println("向下");
            if (y==2){
                System.out.println("越界");}
            else {
                arr[x][y]=arr[x][y+1];
                arr[x][y+1]=0;
                y++;initImage();
            }

            }else if (code==65){
                initImage();}

            }
        }


