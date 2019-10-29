/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa3;

/**
 *
 * @author Lacerda
 */
public class PercorreGrid {
    
    public String percorre(String[][] tabela){
        int i = 0;
        int j = 0;
        int contador=1;
        String[] direcoes = new String[4];
        int oI = i;
        int oJ = j;
        int direcao = 1;
        int tentativa = 0;
        tabela[i][j] = "1";
        while(tentativa <4){
            if(direcao ==4){
                direcao = 0;
            }
            if(direcao==0){
                oI = i-1;
                oJ = j;
                System.out.println("vira pra cima");
            }else if(direcao==1){
                oJ = j+1;
                oI = i;
                System.out.println("vira pra direita");
            }else if(direcao==2){
                oI = i+1;
                oJ = j;
                System.out.println("vira pra baixa  -- oI:"+oI+"  oJ:"+oJ);
            }else if(direcao==3){
                oJ = j-1;
                oI = i;
                System.out.println("vira pra esquerda");
            }
            if((oI >= 0 && oI < tabela.length) && (oJ >= 0 && oJ < tabela[0].length) && tabela[oI][oJ].equals("0")){
                String dire="";
                if(direcao == 0){
                    dire="cima";
                }else if(direcao == 1){
                    dire="direita";
                }else if(direcao == 2){
                    dire="baixo";
                }else if(direcao == 3){
                    dire="esquerda";
                }
                System.out.println("pula para o lado "+dire);
                i = oI;
                j = oJ;
                contador++;
                tabela[i][j] = ""+contador;
                tentativa = 0;
                direcao++;
                System.out.println("tabela["+i+"]["+j+"]: "+tabela[i][j]+"  -- oI: "+oI+" , oJ: "+oJ);
            }else{
                tentativa++;
                direcao++;
                
                System.out.println("tente denovo, tentativas restantes: "+tentativa);
            }
            System.out.println("  -- oI: "+oI+" , oJ: "+oJ);
            for (int k = 0; k < tabela.length; k++) {
                for (int l = 0; l < tabela[0].length; l++) {
                    if(i == k && j == l ){
                        System.out.print("[{"+tabela[k][l]+"}]");
                    }else{
                        System.out.print("[ "+tabela[k][l]+" ]");
                    }
                    
                }
                System.out.println("");
            }
            
            
        }
         
        return contador+"";
    }
    
}
