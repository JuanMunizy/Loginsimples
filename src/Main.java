import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setBounds(400, 400, 400, 400);
        janela.setLayout(null);

        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setBounds(50, 50, 100, 30);
        janela.add(labelUsuario);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(50, 80, 150, 30);
        janela.add(campoUsuario);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(50, 150, 100, 30);
        janela.add(labelSenha);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(50, 180, 150, 30);
        janela.add(campoSenha);

        JButton botaoLogar = new JButton("Login");
        botaoLogar.setBounds(50, 230, 150, 30);
        janela.add(botaoLogar);

        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());

                System.out.printf("Você está fazendo o login com:\nUsuário: %s\nSenha: %s\n", usuario, senha);

                campoUsuario.setText("");
                campoSenha.setText("");
            }
        });
    }
