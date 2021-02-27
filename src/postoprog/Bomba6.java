package postoprog;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Bomba6 {
    DecimalFormat df = new DecimalFormat("###,##0.00");
    
    double litrosgnv;
    double dinheirognv;
    double litrosgnv2;
    double dinheirognv2;

    double conta;
    double total;
    double percentual1 = 10.0 / 100.0;
    double percentual2 = 2.0 / 100.0;

    double litrosdognv;
    double litrosdognv2;
    double dinheirodognv;
    double dinheirodognv2;

    double litrooleo;
    double qtdoleo;

    int clientes6;
    int clientes21, clientes22, clientes23, clientes24;
    double litrostotais6;
    double dinheirototal6;

    void bomba6() {
        int opcao;
        int janela;
        int janelapre;
        int janela3;
        int valorFinal;

        clientes6 = 0;
        clientes21 = 0;
        clientes22 = 0;
        clientes23 = 0;
        clientes24 = 0;
        dinheirodognv = 0;
        dinheirodognv2 = 0;
        litrosdognv = 0;
        litrosdognv2 = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja?" + "\n 1)GNV - Gás Natural Veicular" + "\n" + " 2)GNV - Gás Natural Veicular" + "\n" + " 3) Óleo" + "\n" + " 4) Mudar de bomba"));

            if (opcao == 1) {
                janela = Integer.parseInt(JOptionPane.showInputDialog("Vai abastecer por litro ou por valor?" + "\n" + " 1)Litros" + "\n" + " 2)Valor"));

                switch (janela) {

                    case 1:
                        litrosgnv2 = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheirognv2 = litrosgnv2 * 3.739;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litrosgnv2)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheirognv2)) + " reais");
                        clientes21 = clientes21 + 1;
                        break;

                    case 2:
                        dinheirognv2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litrosgnv2 = dinheirognv2 / 3.739;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheirognv2)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litrosgnv2)) + " litros");
                        clientes24 = clientes24 + 1;
                        break;
                }
            }
            if (opcao == 2) {
                janelapre = Integer.parseInt(JOptionPane.showInputDialog("Quanto vai abastecer?" + "\n1)Litros"+ "\n2)Dinheiro"));
                
                switch (janelapre) {
                    
                    case 1:
                        litrosgnv = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheirognv = litrosgnv * 3.739;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litrosgnv)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheirognv)) + " reais");
                        clientes23 = clientes23 + 1;
                        break;
                    case 2:
                        dinheirognv = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litrosgnv = dinheirognv / 3.739;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheirognv)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litrosgnv)) + " litros");
                        clientes24 = clientes24 + 1;
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
                
                litrosdognv = litrosdognv + litrosgnv;
                dinheirodognv = litrosdognv + litrosgnv;
                litrosdognv2 = litrosdognv2 + litrosgnv2;
                dinheirodognv2 = dinheirodognv2 + dinheirognv2;
                clientes6 = clientes21 + clientes24 + clientes23 + clientes24;
                litrostotais6 = litrosdognv + litrosdognv2;
                dinheirototal6 = dinheirodognv + dinheirodognv2;
                total = qtdoleo+dinheirototal6;

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

    void cortedebomba6() {

        JOptionPane.showMessageDialog(null, "Bomba6"
                + "\n O total de litros na 1ª bomba de GNV foi: " + litrosdognv + " litros "
                + "\n O total de dinheiro gasto na na 1ª bomba de GNV foi: " + dinheirodognv + " reais"
                + "\n O total de litros na 2ª bomba de GNV no dia de hoje foram: " + litrosdognv2 + " litros "
                + "\n O total de dinheiro gasto na 2ª bomba de GNV foi: " + dinheirodognv2 + " reais"
                + "\n Na bomba 6, o total de clientes foi: " + clientes6 + " clientes");
    }

}
