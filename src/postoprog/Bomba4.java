package postoprog;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Bomba4 {
    DecimalFormat df = new DecimalFormat("###,##0.00");

    double litrosdiesel2;
    double dinheirodiesel2;
    double litross10;
    double dinheiros10;

    double conta;
    double total;
    double percentual1 = 10.0 / 100.0;
    double percentual2 = 2.0 / 100.0;

    double litrooleo;
    double qtdoleo;

    double litrosdodiesel2;
    double litrosdos10;
    double dinheirododiesel2;
    double dinheirodos10;
    int clientes4;
    int clientes13, clientes14, clientes15, clientes16;
    double litrostotais4;
    double dinheirototal4;

    void bomba4() {
        int opcao;
        int janela;
        int janelapre;
        int janela3;
        int valorFinal;

        clientes4 = 0;
        clientes13 = 0;
        clientes14 = 0;
        clientes15 = 0;
        clientes16 = 0;
        dinheirododiesel2 = 0;
        dinheirodos10 = 0;
        litrosdodiesel2 = 0;
        litrosdos10 = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja?" + "\n 1)Diesel comum" + "\n" + " 2)Diesel S10" + "\n" + "\n" + " 3) Óleo" + "\n" + " 4) Mudar de bomba"));

            if (opcao == 1) {
                janela = Integer.parseInt(JOptionPane.showInputDialog("Vai abastecer por litro ou por valor?" + "\n" + "1) Litros" + "\n" + "2) Valor"));

                switch (janela) {

                    case 1:
                        litrosdiesel2 = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheirodiesel2 = litrosdiesel2 * 3.790;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litrosdiesel2)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheirodiesel2)) + "reais");
                        clientes13 = clientes13 + 1;
                        break;

                    case 2:
                        dinheirodiesel2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litrosdiesel2 = dinheirodiesel2 / 3.790;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheirodiesel2)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litrosdiesel2)) + "litros");
                        clientes14 = clientes14 + 1;
                        break;
                }
            }
            
            if (opcao == 2) {
                janelapre = Integer.parseInt(JOptionPane.showInputDialog("Quanto vai abastecer?"+ "\n1)Litros"+ "\n2)Dinheiro"));
               
                switch (janelapre) {
                    case 1:
                        litross10 = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheiros10 = litross10 * 3.839;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litross10)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheiros10)) + " reais");
                        clientes15 = clientes15 + 1;
                        break;
                        
                    case 2:
                        dinheiros10 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litross10 = dinheiros10 / 3.839;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheiros10)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litross10)) + " litros");
                        clientes16 = clientes16 + 1;
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
                
                litrosdodiesel2 = litrosdodiesel2 + litrosdiesel2;
                dinheirododiesel2 = litrosdodiesel2 + litrosdiesel2;
                litrosdos10 = litrosdos10 + litross10;
                dinheirodos10 = dinheirodos10 + dinheiros10;
                clientes4 = clientes13 + clientes14 + clientes15 + clientes16;
                litrostotais4 = litrosdodiesel2 + litrosdos10;
                dinheirototal4 = dinheirododiesel2 + dinheirodos10;
                total = qtdoleo+dinheirototal4;

                valorFinal = Integer.parseInt(JOptionPane.showInputDialog("Valor final R$ " +(df.format(total))  + " . Como você deseja pagar?"
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

    void cortedebomba4() {

        JOptionPane.showMessageDialog(null, "Bomba4"
                + "\n O total de litros do Diesel Comum hoje foram: " + litrosdodiesel2 + " litros "
                + "\n O total de dinheiro gasto no Diesel Comum foi: " + dinheirododiesel2 + " reais"
                + "\n O total de litros de Diesel - S10 foram: " + litrosdos10 + " litros "
                + "\n O total de dinheiro gasto no Diesel - S10 foi: " + dinheirodos10 + " reais"
                + "\n Na bomba 4, o total de clientes foi: " + clientes4 + " clientes");
    }

}
