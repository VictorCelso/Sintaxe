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
        Sintaxe root;
        Sintaxe node;
        Sintaxe exp1 = Sintaxe.createRoot("/");
        Sintaxe exp2 = Sintaxe.createRoot("*");
        exp1.leftNode = Sintaxe.createRoot("*");
        root = exp1.leftNode;
        root.leftNode = Sintaxe.createRoot("+");
        root.rightNode = Sintaxe.createRoot("4");
        node = root.rightNode;
        root = root.leftNode;
        root.leftNode = Sintaxe.createRoot("4");
        root.rightNode = Sintaxe.createRoot("3");
        node = root.rightNode;
        root = root.leftNode;
        exp1.rightNode = Sintaxe.createRoot("*");
        node = exp1.rightNode;
        node.leftNode = Sintaxe.createRoot("2");
        node.rightNode = Sintaxe.createRoot("3");
        System.out.println(orderRead(exp1));
        System.out.println(preOrderRead(exp1));
        System.out.println(posOrderRead(exp1));
        exp2.leftNode = Sintaxe.createRoot("+");
        root = exp2.leftNode;
        root.leftNode = Sintaxe.createRoot("8");
        root.rightNode = Sintaxe.createRoot("2");
        exp2.rightNode = Sintaxe.createRoot("/");
        root = exp2.rightNode;
        root.leftNode = Sintaxe.createRoot("8");
        root.rightNode = Sintaxe.createRoot("4");
        System.out.println(orderRead(exp2));
        System.out.println(preOrderRead(exp2));
        System.out.println(posOrderRead(exp2));
        
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
            leitura += root.value;
            leitura += preOrderRead(root.leftNode);            
            leitura += preOrderRead(root.rightNode);
        }
        return leitura;
    }

    private static String posOrderRead(Sintaxe root) {
        String leitura = "";
        if (root != null) {
            leitura += posOrderRead(root.leftNode);
            leitura += posOrderRead(root.rightNode);
            leitura += root.value;            
        }
        return leitura;
    }

}
