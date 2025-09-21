import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField; // [00:18:36]
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

        JLabel labelSenha = new JLabel("Senha:"); // [00:19:36]
        labelSenha.setBounds(50, 150, 100, 30); // [00:19:58]
        janela.add(labelSenha); // [00:20:30]

        JPasswordField campoSenha = new JPasswordField(); // [00:18:36]
        campoSenha.setBounds(50, 180, 150, 30); // [00:18:58]
        janela.add(campoSenha); // [00:19:18]

        JButton botaoLogar = new JButton("Login");
        botaoLogar.setBounds(50, 230, 150, 30); // [00:20:49]
        janela.add(botaoLogar);

        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText(); // [00:22:06]
                String senha = new String(campoSenha.getPassword()); // [00:22:18] (recomendação de uso de getPassword() [00:22:43])

                System.out.printf("Você está fazendo o login com:\nUsuário: %s\nSenha: %s\n", usuario, senha); // [00:23:19]

                campoUsuario.setText(""); // [00:24:28]
                campoSenha.setText(""); // [00:24:40]
            }
        });
    }
}