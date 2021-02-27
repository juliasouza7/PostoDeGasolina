package postoprog;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Bomba3 {
    DecimalFormat df = new DecimalFormat("###,##0.00");
   
    double litrosalc2;
    double dinheiroalc2;
    double litrosdiesel;
    double dinheirodiesel;

    double litrooleo;
    double qtdoleo;

    double conta;
    double total;
    double percentual1 = 10.0 / 100.0;
    double percentual2 = 2.0 / 100.0;

    double litrosdoalc2;
    double litrosdodiesel;
    double dinheirodoalc2;
    double dinheirododiesel;
    int clientes3;
    int clientes9, clientes10, clientes11, clientes12;
    double litrostotais3;
    double dinheirototal3;

    void bomba3() {
        int opcao;
        int valorFinal;
        int janela;
        int janelapre;
        int janela3;

        clientes3 = 0;
        clientes9 = 0;
        clientes10 = 0;
        clientes11 = 0;
        clientes12 = 0;
        dinheirodoalc2 = 0;
        dinheirododiesel = 0;
        litrosdoalc2 = 0;
        litrosdodiesel = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja?" + "\n 1) Álcool" + "\n" + " 2) Diesel " + "\n" + " 3) Óleo" + "\n" + " 4) Mudar de bomba "));

            if (opcao == 1) {
                janela = Integer.parseInt(JOptionPane.showInputDialog("Vai abastecer por litro ou por valor?" + "\n" + "1) Litros" + "\n" + "2) Valor"));

                switch (janela) {

                    case 1:
                        litrosalc2 = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheiroalc2 = litrosalc2 * 3.699;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litrosalc2)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheiroalc2)) + " reais");
                        clientes9 = clientes9 + 1;
                        break;

                    case 2:
                        dinheiroalc2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litrosalc2 = dinheiroalc2 / 3.699;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheiroalc2)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litrosalc2)) + " litros");
                        clientes10 = clientes10 + 1;
                        break;
                }
            }
            
            if (opcao == 2) {
                janelapre = Integer.parseInt(JOptionPane.showInputDialog("Quanto vai abastecer?"+ "\n1)Litros" + "\n2)Dinheiro"));
                
                switch (janelapre) {
                    
                    case 1:
                        litrosdiesel = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheirodiesel = litrosdiesel * 3.790;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litrosdiesel)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheirodiesel)) + " reais");
                        clientes11 = clientes11 + 1;
                        break;
                        
                    case 2:
                        dinheirodiesel = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litrosdiesel = dinheirodiesel / 3.790;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheirodiesel)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litrosdiesel)) + " litros");
                        clientes12 = clientes12 + 1;
                        break;
                }
            }
            
            if (opcao == 3) {
                janela3 = Integer.parseInt(JOptionPane.showInputDialog("Qual óleo vai querer? "
                        + "\nMarca quantidade e valor"
                        + "  \n------------------------------------------"
                        + "  \n1 Lubrax - Feroces, 1 litro, R$61,00      "
                        + "  \n2 Motul - 5100, 1 litro, R$42,83          "
                        + "  \n3 Mobil - Super Power, 1 litro, R$32,00   "
                        + "  \n4 Shell - Advance, 1 litro, R$28,00       "
                        + "  \n------------------------------------------"));
                
                switch (janela3) {
                    
                    case 1:
                        litrooleo = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        qtdoleo = litrooleo * 61;
                        JOptionPane.showMessageDialog(null, "São " + (df.format(qtdoleo)) + " reais");
                        break;

                    case 2:
                        litrooleo = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        qtdoleo = litrooleo * 42.83;
                        JOptionPane.showMessageDialog(null, "São " + (df.format(qtdoleo)) + " reais");
                        break;
                        
                    case 3:
                        litrooleo = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        qtdoleo = litrooleo * 32;
                        JOptionPane.showMessageDialog(null, "São " + (df.format(qtdoleo)) + " reais");
                        break;

                    case 4:
                        litrooleo = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        qtdoleo = litrooleo * 28;
                        JOptionPane.showMessageDialog(null, "São " + (df.format(qtdoleo)) + " reais");
                        break;
                }
                
                litrosdoalc2 = litrosdoalc2 + litrosalc2;
                dinheirodoalc2 = litrosdoalc2 + litrosalc2;
                litrosdodiesel = litrosdodiesel + litrosdiesel;
                dinheirododiesel = dinheirododiesel + dinheirodiesel;
                clientes3 = clientes9 + clientes10 + clientes11 + clientes12;
                litrostotais3 = litrosdoalc2 + litrosdodiesel;
                dinheirototal3 = dinheirodoalc2 + dinheirododiesel;
                total = qtdoleo+dinheirototal3;

                valorFinal = Integer.parseInt(JOptionPane.showInputDialog("Valor final R$ " + (df.format(total)) + " . Como você deseja pagar?"
                        + "  \n------------------------------------------"
                        + "  \n (1) À vista - 10% de desconto      "
                        + "  \n (2) Prazo 30 dias - Valor normal         "
                        + "  \n (3) Prazo mais de 30 dias - 2% de aumento "
                        + "  \n------------------------------------------"));
                
                switch (valorFinal) {

                    case 1:
                        conta = (total - (percentual1 * total));
                        JOptionPane.showMessageDialog(null, "São " + (df.format(conta)) + " reais");
                        break;

                    case 2:
                        conta = total;
                        JOptionPane.showMessageDialog(null, "São " + (df.format(conta)) + " reais");
                        break;

                    case 3:
                        conta = (total + (percentual2 * total));
                        JOptionPane.showMessageDialog(null, "São " + (df.format(conta)) + " reais");
                        break;
                }
            }
        } while (opcao != 4);
    }

    void cortedebomba3() {

        JOptionPane.showMessageDialog(null, "Bomba3"
                + "\n O total de litros de álcool de hoje foram: " + litrosdoalc2 + " litros "
                + "\n O total de dinheiro gasto no Álcool foi: " + dinheirodoalc2 + " reais"
                + "\n O total de litros de Diesel hoje foram: " + litrosdodiesel + " litros "
                + "\n O total de dinheiro gasto no Diesel foi: " + dinheirododiesel + " reais"
                + "\n Na bomba 3, o total de clientes foi: " + clientes3 + " clientes");
    }

}
