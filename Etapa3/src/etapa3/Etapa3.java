/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa3;

import java.util.Scanner;

/**
 *
 * @author Lacerda
 */
public class Etapa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n, m;
        do{
            System.out.println("digite o numero de linhas da tabela");
            n = Integer.parseInt(scanner.nextLine());
        }while(n < 1 || n > 101);
        do{
            System.out.println("digite o numero de colunas da tabela");
            m = Integer.parseInt(scanner.nextLine());
        }while(m < 1 || m > 101);
        String[][] tabela = new String[n][m];
        PercorreGrid p = new PercorreGrid();
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[0].length; j++) {
                tabela[i][j] = "0";
                System.out.print(tabela[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("total de visitas: "+p.percorre(tabela));
    }
    
}
