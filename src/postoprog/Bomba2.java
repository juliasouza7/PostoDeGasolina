package postoprog;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Bomba2 {
    DecimalFormat df = new DecimalFormat("###,##0.00");

    double litrosadit2;
    double dinheiroadit2;
    double litrosalc;
    double dinheiroalc;

    double conta;
    double total;
    double percentual1 = 10.0 / 100.0;
    double percentual2 = 2.0 / 100.0;

    double litrosdaadit2;
    double litrosdoalc;
    double dinheirodaadit2;
    double dinheirodoalc;

    double litrooleo;
    double qtdoleo;

    int clientes2;
    int clientes5, clientes6, clientes7, clientes8;
    double litrostotais2;
    double dinheirototal2;

    void bomba2() {
        int opcao;
        int janela;
        int janelapre;
        int janela3;
        int valorFinal;

        clientes2 = 0;
        clientes5 = 0;
        clientes6 = 0;
        clientes7 = 0;
        clientes8 = 0;
        dinheirodaadit2 = 0;
        dinheirodoalc = 0;
        litrosdaadit2 = 0;
        litrosdoalc = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja?" + "\n 1) Gasolina Aditivada" + "\n" + " 2) Álcool" + "\n" + " 3) Óleo" + "\n" + " 4) Mudar de bomba"));

            if (opcao == 1) {
                janela = Integer.parseInt(JOptionPane.showInputDialog("Vai abastecer por litro ou por valor?" + "\n" + "1) Litros" + "\n" + "2) Valor"));

                switch (janela) {

                    case 1:
                        litrosadit2 = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheiroadit2 = litrosadit2 * 4.699;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litrosadit2)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheiroadit2)) + " reais");
                        clientes5 = clientes5 + 1;
                        break;

                    case 2:
                        dinheiroadit2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litrosadit2 = dinheiroadit2 / 4.699;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheiroadit2)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litrosadit2)) + " litros");
                        clientes6 = clientes6 + 1;
                        break;
                }
            }
            
            if (opcao == 2) {
               janelapre = Integer.parseInt(JOptionPane.showInputDialog("Quanto vai abastecer?"+ "\n1)Litros"+ "\n2)Dinheiro"));
                switch (janelapre) {
                    case 1:
                        litrosalc = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheiroalc = litrosalc * 3.699;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litrosalc)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheiroalc)) + " reais");
                        clientes7 = clientes7 + 1;
                        break;
                    case 2:
                        dinheiroalc = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litrosalc = dinheiroalc / 3.699;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheiroalc)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litrosalc)) + " litros");
                        clientes8 = clientes8 + 1;
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
                        JOptionPane.showMessageDialog(null, "São " + (df.format(qtdoleo)) + "reais");
                        break;
                        
                }
                
                litrosdaadit2 = litrosdaadit2 + litrosadit2;
                dinheirodaadit2 = litrosdaadit2 + litrosadit2;
                litrosdoalc = litrosdoalc + litrosalc;
                dinheirodoalc = dinheirodoalc + dinheiroalc;
                clientes2 = clientes5 + clientes6 + clientes7 + clientes8;
                litrostotais2 = litrosdaadit2 + litrosdoalc;
                dinheirototal2 = dinheirodaadit2 + dinheirodoalc;
                total = qtdoleo+dinheirototal2;
                
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

    void cortedebomba2() {

        JOptionPane.showMessageDialog(null, "Bomba2"
                + "\n O total de litros da gasolina Aditivada foi: " + litrosdaadit2 + " litros "
                + "\n O total de dinheiro gasto na gasolina Aditivada foi: " + dinheirodaadit2 + " reais"
                + "\n O total de litros de Álcool no dia de hoje foram: " + litrosdoalc + " litros "
                + "\n O total de dinheiro gasto no Álcool foi: " + dinheirodoalc + " reais"
                + "\n Na bomba 2, o total de clientes foi: " + clientes2 + " clientes");
    }
}
