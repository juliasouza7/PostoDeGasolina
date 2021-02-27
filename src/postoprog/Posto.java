package postoprog;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Posto implements ActionListener {

    Bomba1 objbomba1 = new Bomba1();
    Bomba2 objbomba2 = new Bomba2();
    Bomba3 objbomba3 = new Bomba3();
    Bomba4 objbomba4 = new Bomba4();
    Bomba5 objbomba5 = new Bomba5();
    Bomba6 objbomba6 = new Bomba6();
    JFrame janela = new JFrame();
    JLabel label = new JLabel("Selecione uma bomba:");
    JButton botao = new JButton("OK");
    JComboBox combo = new JComboBox();

    public Posto() {
        janela.setSize(500, 500);
        janela.setTitle("Posto de Gasolina - Júlia Costa de Souza");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout(FlowLayout.CENTER));
	
        ImageIcon imagem = new ImageIcon(getClass().getResource("download2.png"));
        imagem.setImage(imagem.getImage().getScaledInstance(275, 275, 200));
        JLabel label = new JLabel(imagem);
        janela.add(label);
        janela.add(combo);
        janela.add(botao);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        botao.addActionListener(this);

        combo.addItem("Bomba1: Gasolina Comum | Gasolina Aditivada");
        combo.addItem("Bomba2: Gasolina Aditivada | Álcool");
        combo.addItem("Bomba3: Álcool | Diesel Comum");
        combo.addItem("Bomba4: Diesel Comum | Diesel S10");
        combo.addItem("Bomba5: Diesel S10 | Gasolina Comum");
        combo.addItem("Bomba6: GNV - Gás Natural Veicular");
        combo.addItem("Mostrar utilização de todas as bombas");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao) {

            switch ((String) combo.getSelectedItem()) {
                case "Bomba1: Gasolina Comum | Gasolina Aditivada":
                    objbomba1.bomba1();
                    break;
                case "Bomba2: Gasolina Aditivada | Álcool":
                    objbomba2.bomba2();
                    break;
                case "Bomba3: Álcool | Diesel Comum":
                    objbomba3.bomba3();
                    break;
                case "Bomba4: Diesel Comum | Diesel S10":
                    objbomba4.bomba4();
                    break;
                case "Bomba5: Diesel S10 | Gasolina Comum":
                    objbomba5.bomba5();
                    break;
                case "Bomba6: GNV - Gás Natural Veicular":
                    objbomba6.bomba6();
                    break;
                case "Mostrar utilização de todas as bombas":
                    objbomba1.cortedebomba();
                    objbomba2.cortedebomba2();
                    objbomba3.cortedebomba3();
                    objbomba4.cortedebomba4();
                    objbomba5.cortedebomba5();
                    objbomba6.cortedebomba6();
                    JOptionPane.showMessageDialog(null, "Bomba 1: " + objbomba1.litrostotais1 + " Litros; " + objbomba1.dinheirototal1 + " reais; " + objbomba1.clientes + " Clientes"
                            + "\nBomba2: " + objbomba2.litrostotais2 + " Litros; " + objbomba2.dinheirototal2 + " reais; " + objbomba2.clientes2 + " Clientes"
                            + "\nBomba3: " + objbomba3.litrostotais3 + " Litros; " + objbomba3.dinheirototal3 + " reais; " + objbomba3.clientes3 + " Clientes"
                            + "\nBomba4: " + objbomba4.litrostotais4 + " Litros; " + objbomba4.dinheirototal4 + " reais; " + objbomba4.clientes4 + " Clientes"
                            + "\nBomba5: " + objbomba5.litrostotais5 + " Litros; " + objbomba5.dinheirototal5 + " reais; " + objbomba5.clientes5 + " Clientes"
                            + "\nBomba6: " + objbomba6.litrostotais6 + " Litros; " + objbomba6.dinheirototal6 + " reais; " + objbomba6.clientes6 + " Clientes");
                    break;

            }

        }
    }
}
