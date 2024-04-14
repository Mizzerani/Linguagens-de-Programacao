import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame {
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton JButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton JButtonAposta3 = new JButton("Apostar par ou ímpar");

    public Main() {
        this.setTitle("Lotofácil - Início");
        this.setSize(400, 200);
        painel.setBackground(new Color(255, 255, 255));
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));
        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
        });
        JButtonAposta2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               aposta2();
           }
        });
        JButtonAposta3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               aposta3();
           }
        });

        painel.add(jButtonAposta1);
        painel.add(JButtonAposta2);
        painel.add(JButtonAposta3);

        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private static void aposta1() {
        ImageIcon icon = new ImageIcon("sorteio.png");
        Object numeroApostado = JOptionPane.showInputDialog(null,"Digite um número de 0 a 100","Aposta 1",JOptionPane.INFORMATION_MESSAGE,icon,null,"");
        int numeroApostadoInt = Integer.parseInt(numeroApostado.toString());
        Random rdn = new Random();
        int numeroSorteado = rdn.nextInt(101);
        if(numeroApostadoInt == numeroSorteado){
            JOptionPane.showMessageDialog(null,"Parabens!!! Você ganhou Mil reais!!!","Aposta 1",JOptionPane.INFORMATION_MESSAGE,icon);
        }else{
            JOptionPane.showMessageDialog(null,"Que pena... Você perdeu.","Aposta 1",JOptionPane.INFORMATION_MESSAGE,icon);
        }
    }

    private static void aposta2() {
        String letraApostada = JOptionPane.showInputDialog(null,"Digite uma letra:");
        char letraApostadaChar = letraApostada.toUpperCase().charAt(0);
        char letraviciada = 'M';
        if(letraApostadaChar == letraviciada) {
            JOptionPane.showMessageDialog(null, "Parabens!!! Você ganhou quinhentos reais!!!");
        }else {
            JOptionPane.showMessageDialog(null,"Que pena... Você errou...");
        }
    }

    private static void aposta3() {
        String numeroApostado = JOptionPane.showInputDialog(null, "Digite um número qualquer:");
        int numeroApostadoInt = Integer.parseInt(numeroApostado);
        if(numeroApostadoInt % 2 == 0){
            JOptionPane.showMessageDialog(null,"Parabens!!! Voce ganhou cem reais!!");
        }else{
            JOptionPane.showMessageDialog(null,"Que pena... Você perdeu!");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}