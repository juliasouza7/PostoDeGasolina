package postoprog;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Bomba1 {
    DecimalFormat df = new DecimalFormat("###,##0.00");

    double litrosgas;
    double dinheirogas;
    double litrosadit;
    double dinheiroadit;

    double litrosdagas;
    double litrosdaadit;
    double dinheirodagas;
    double dinheirodaadit;

    double conta;
    double total;
    double percentual1 = 10.0 / 100.0;
    double percentual2 = 2.0 / 100.0;

    double litrooleo;
    double qtdoleo;

    int clientes;
    int clientes1, clientes2, clientes3, clientes4;
    double litrostotais1;
    double dinheirototal1;

    void bomba1() {
        int opcao;
        int janela;
        int janelapre;
        int janela3;
        int valorFinal;

        clientes = 0;
        clientes1 = 0;
        clientes2 = 0;
        clientes3 = 0;
        clientes4 = 0;
        dinheirodagas = 0;
        dinheirodaadit = 0;
        litrosdagas = 0;
        litrosdaadit = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que você deseja?" + "\n 1) Gasolina Comum" + "\n" + " 2) Gasolina Aditivada " + "\n" + " 3) Óleo"+"\n" + " 4) Mudar de bomba "));

            if (opcao == 1) {
                janela = Integer.parseInt(JOptionPane.showInputDialog("Vai abastecer por litro ou por valor?" + "\n" + "1) Litros" + "\n" + "2) Valor"));

                switch (janela) {

                    case 1:
                        litrosgas = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheirogas = litrosgas * 4.569;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litrosgas)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheirogas)) + " reais");
                        clientes1 = clientes1 + 1;
                        break;

                    case 2:
                        dinheirogas = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litrosgas = dinheirogas / 4.569;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheirogas)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litrosgas)) + " litros");
                        clientes1 = clientes2 + 1;
                        break;
                }
            }

            if (opcao == 2) {
                janelapre = Integer.parseInt(JOptionPane.showInputDialog(null, "Vai abastecer por litro ou por valor?" + "\n" + "1)Litros" + "\n" + "2)Valor"));
               
                switch (janelapre) {
                    case 1:
                        litrosadit = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));
                        dinheiroadit = litrosadit * 4.699;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(litrosadit)) + " litros");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(dinheiroadit)) + "reais");
                        clientes3 = clientes3 + 1;
                        break;

                    case 2:
                        dinheiroadit = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade?"));
                        litrosadit = dinheiroadit / 4.699;
                        JOptionPane.showMessageDialog(null, "Você abasteceu: " + (df.format(dinheiroadit)) + " reais");
                        JOptionPane.showMessageDialog(null, "São " + (df.format(litrosadit)) + " litros");
                        clientes4 = clientes4 + 1;
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
                        JOptionPane.showMessageDialog(null, "São " +(df.format(qtdoleo)) + " reais");
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
                
                litrosdagas = litrosdagas + litrosgas;
                dinheirodagas = litrosdagas + litrosgas;
                litrosdaadit = litrosdaadit + litrosadit;
                dinheirodaadit = dinheirodaadit + dinheiroadit;
                clientes = clientes1 + clientes2 + clientes3 + clientes4;
                litrostotais1 = litrosdagas + litrosdaadit;
                dinheirototal1 = dinheirodagas + dinheirodaadit;
                total = qtdoleo+dinheirototal1;
                
                valorFinal = Integer.parseInt(JOptionPane.showInputDialog("Valor final R$ " + total + " . Como você deseja pagar?"
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

    void cortedebomba() {

        JOptionPane.showMessageDialog(null, "Bomba1"
                + "\n O total de litros da Gasolina Comum no dia de hoje foi: " + litrosdagas + " litros "
                + "\n O total de dinheiro gasto na Gasolina Comum foi: " + dinheirodagas + " reais"
                + "\n O total de litros de Gasolina Aditivada no dia de hoje foi: " + litrosdaadit + " litros "
                + "\n O total de dinheiro gasto na Gasolina Aditivada foi: " + dinheirodaadit + " reais"
                + "\n Na bomba 1, o total de clientes foi: " + clientes + " clientes");
    }
}
