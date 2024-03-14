package Controllers;

import Models.Usuarios;
import Models.UsuariosDao;
import Views.FrmLogin;
import Views.PanelAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener {
    private Usuarios us;
    private UsuariosDao usDao;
    private FrmLogin views;

    public LoginController(Usuarios us, UsuariosDao usDao, FrmLogin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnLogin.addActionListener(this);
        this.views.btnCancelar.addActionListener(this);
        this.views.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnLogin) {
            if (views.txtUsuario.getText().equals("") || String.valueOf(views.txtPassword.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Los campos están vacíos");
            } else {
                String Usuario = views.txtUsuario.getText();
                String Password = String.valueOf(views.txtPassword.getPassword());
                us = usDao.login(Usuario, Password);
                if (us.getUsuario() != null) {
                    PanelAdmin admin = new PanelAdmin();
                    admin.setVisible(true);
                    this.views.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                }
            }
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(pregunta == 0){
                System.exit(0);
            }
        }
    }
}