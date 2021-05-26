package main;

import javax.swing.*;

public class Main {

    public static void sacarValor(){
        try{
            int[] cedulas = {0,0,0,0,0}; //indices de 100, 50, 20, 10 e 5, respectivamente
            int[] notas = {100, 50, 20, 10, 5};
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar:"));
            double input = valor;

            //calculo de cédulas
            if (valor % 5 == 0 && valor > 0 ) {
                for (int i = 0; i < notas.length; i++){
                    while(valor >= notas[i]){
                        valor = valor - notas[i];
                        cedulas[i] += 1;
                    }
                }
                JOptionPane.showMessageDialog(null,"Saque de R$" + input + " efetuado! \n "+"\n Cédulas de 100: " + cedulas[0] + "\n Cédulas de 50: " + cedulas[1] + "\n Cédulas de 20: " + cedulas[2] + "\n Cédulas de 10: " + cedulas[3] + "\n Cédulas de 5: " + cedulas[4], "Cédulas sacadas", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "O caixa eletrônico aceita sacar somente valores múltiplos de 5!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }catch (NumberFormatException nfex){
            JOptionPane.showMessageDialog(null, "O caixa eletrônico aceita somente números!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        sacarValor();
    }
}