package postoprog;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Bomba5 {
    DecimalFormat df = new DecimalFormat("###,##0.00");

    double litross102;
    double dinheiros102;
    double litrosgas2;
    double dinheirogas2;

    double conta;
    double total;
    double percentual1 = 10.0 / 100.0;
    double percentual2 = 2.0 / 100.0;

    double litrooleo;
    double qtdoleo;

    double litrosdos102;
    double litrosdagas2;
    double dinheirodos102;
    double dinheirodagas2;
    int clientes5;
    int clientes17, clientes18, clientes19, clientes20;
    double litrostotais5;
    double dinheirototal5;

    void bomba5() {
        int opcao;
        int janela;
        int janelapre;
        int janela3;
        int valorFinal;

        clientes5 = 0;
        clientes17 = 0;
        clientes18 = 0;
        clientes19 = 0;
        clientes20 = 0;
        dinheirodos102 = 0;
        dinheirodagas2 = 0;
        litrosdos102 = 0;
        litrosdagas2 = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja?" + "\n 1) Diesel S10" + "\n" + " 2) Gasolina Comum" + "\n" + "\n" + " 3) Óleo " + "\n" + " 4) Mudar de bomba"));

            if (opcao == 1) {
                janela = Integer.parseInt(JOptionPane.showInputDialog("Vai abastecer por litro ou por valor?" + "\n" + "1) Litros" + "\n" + "2) Valor"));

                switch (janela) {

                    case 1:
                        litross102 = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheiros102 = litross102 * 3.839;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litross102)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheiros102)) + " reais");
                        clientes17 = clientes17 + 1;
                        break;

                    case 2:
                        dinheiros102 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litross102 = dinheiros102 / 3.839;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheiros102)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litross102)) + " litros");
                        clientes18 = clientes18 + 1;
                        break;

                }
            }
            if (opcao == 2) {
                janelapre = Integer.parseInt(JOptionPane.showInputDialog("Quanto vai abastecer?"+ "\n1)Litros"+ "\n2)Dinheiro"));
                
                switch (janelapre) {
                    
                    case 1:
                        litrosgas2 = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheirogas2 = litrosgas2 * 4.569;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litrosgas2)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheirogas2)) + "reais");
                        clientes19 = clientes19 + 1;
                        break;
                        
                    case 2:
                        dinheirogas2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litrosgas2 = dinheirogas2 / 4.569;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheirogas2)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litrosgas2)) + "litros");
                        clientes20 = clientes20 + 1;
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
                
                litrosdos102 = litrosdos102 + litross102;
                dinheirodos102 = litrosdos102 + litross102;
                litrosdagas2 = litrosdagas2 + litrosgas2;
                dinheirodagas2 = dinheirodagas2 + dinheirogas2;
                clientes5 = clientes17 + clientes18 + clientes19 + clientes20;
                litrostotais5 = litrosdos102 + litrosdagas2;
                dinheirototal5 = dinheirodos102 + dinheirodagas2;
                total = qtdoleo+dinheirototal5;
                
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

    void cortedebomba5() {

        JOptionPane.showMessageDialog(null, "Bomba5"
                + "\n O total de litros de Diesel - S10 hoje foram: " + litrosdos102 + " litros "
                + "\n O total de dinheiro gasto no Diesel - S10 foi: " + dinheirodos102 + " reais"
                + "\n O total de litros de Gasolina foram: " + litrosdagas2 + " litros "
                + "\n O total de dinheiro gasto na Gasolina foi:  " + dinheirodagas2 + " reais"
                + "\n Na bomba 5, o total de clientes foi: " + clientes5 + " clientes");
    }

}
