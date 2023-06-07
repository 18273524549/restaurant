package com.res.jfd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.dao.LoginDao;
import com.domain.Login;
import com.service.LoginService;
import com.service.impl.LoginServiceImpl;
import net.miginfocom.swing.*;
import org.springframework.beans.factory.annotation.Autowired;
/*
 * Created by JFormDesigner on Mon Jun 05 14:16:30 CST 2023
 */



/**
 * @author 谢嵩
 */
public class LoginView extends JFrame {

    @Autowired
    private LoginService loginService;

    public LoginView() {
        initComponents();
    }

    public static void main(String[] args) {
        // 检查GUI环境是否可用
        if (!GraphicsEnvironment.isHeadless()) {
            // 创建并显示GUI界面
            LoginView loginWindow = new LoginView();
            loginWindow.setVisible(true);
        } else {
            System.out.println("当前运行环境没有可用的GUI界面，无法显示界面。");
        }
    }

    private void ok(ActionEvent e) {
        // 从登录表单中获取用户名和密码
        String username = textField1.getText();
        String password = textField2.getText();

        // 调用后端接口进行登录验证
        boolean result = loginService.login(username, password); // 使用注入的对象

        if (result) {
            dispose(); // 关闭登录界面
        } else {
            // 登录失败，提示用户重新输入
            JOptionPane.showMessageDialog(this, "用户名或密码错误，请重新输入！", "登录失败", JOptionPane.ERROR_MESSAGE);
            textField1.setText("");
            textField2.setText("");
        }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - xs
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        okButton = new JButton();
        cancelButton = new JButton();
        buttonBar = new JPanel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "insets dialog,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("\u7528\u6237\u540d");
                contentPanel.add(label1, "cell 3 2 4 1");
                contentPanel.add(textField1, "cell 7 2 4 1");

                //---- label2 ----
                label2.setText("\u5bc6\u7801");
                contentPanel.add(label2, "cell 3 3 3 1");
                contentPanel.add(textField2, "cell 7 3 4 1");

                //---- okButton ----
                okButton.setText("\u767b\u5f55");
                okButton.addActionListener(e -> ok(e));
                contentPanel.add(okButton, "cell 7 5");

                //---- cancelButton ----
                cancelButton.setText("\u6ce8\u518c");
                contentPanel.add(cancelButton, "cell 10 5");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                    "insets dialog,alignx right",
                    // columns
                    "[button,fill]" +
                    "[button,fill]",
                    // rows
                    null));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - xs
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel buttonBar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
