/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.RequestProcessor;

/**
 *
 * @author v.tassinari
 */
public class Testes {

    /*int criticalRegion = 0;
    int runTime = 0;
    int turn = 0;
    boolean flag[] = new boolean[2];
    TestTestAndSetLock lockSet = new TestTestAndSetLock();

    private class processePlus extends Thread {

        public void run() {
            while (runTime < 50) {
                try {
                    System.out.println("Plus");
                    flag[0] = true;
                    turn = 1;
                    while (flag[1] && turn == 1){
                        System.out.println("Esperando a vez de Plus turn: "+turn);
                        Thread.sleep(1);
                    }
                    criticalRegion++;
                    System.out.println("Região critica plus " + criticalRegion);
                    flag[0] = false;
                    
                    System.out.println(criticalRegion);
                    runTime++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Testes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class processeMinus extends Thread {

        public void run() {
            while(lockSet.tryLock()){
                System.out.println("");
            }
            /*while (runTime < 50) {
                try {
                    System.out.println("Minus");
                    flag[1] = true;
                    turn = 0;
                    while (flag[0] && turn == 0){
                        System.out.println("Esperando a vez de Minus turn: "+turn);
                        Thread.sleep(2);
                    }
                    criticalRegion--;
                    System.out.println("Região critica minus " + criticalRegion);
                    flag[1] = false;
                    
                    System.out.println(criticalRegion);
                    runTime++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Testes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public Testes() {
        processePlus plus = new processePlus();
        processeMinus minus = new processeMinus();
        plus.start();
        minus.start();
    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Testes t = new Testes();
        Sintaxe right;
        Sintaxe left;
        Sintaxe
        Sintaxe exp1 = Sintaxe.createRoot("/");
        Sintaxe exp2 = Sintaxe.createRoot("*");
        left = exp1.createLeftNode("*", exp1);
        right = exp1.createRightNode("*", exp1);
        right = right.createLeftNode(value, left)
    }

    private static String orderRead(Sintaxe root) {
        String leitura = "";
        if (root != null) {
            leitura += orderRead(root.leftNode);
            leitura += root.value;
            leitura += orderRead(root.rightNode);
        }
        return leitura;
    }

    private static String preOrderRead(Sintaxe root) {
        String leitura = "";
        if (root != null) {
            leitura += orderRead(root.leftNode);
            leitura += root.value;
            leitura += orderRead(root.rightNode);
        }
        return leitura;
    }

    private static String posOrderRead(Sintaxe root) {
        String leitura = "";
        if (root != null) {
            leitura += orderRead(root.leftNode);
            leitura += root.value;
            leitura += orderRead(root.rightNode);
        }
        return leitura;
    }

}
