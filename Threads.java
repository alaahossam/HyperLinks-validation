/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyperlinkkk.validationnnn;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Threads extends Thread {

    private String link;
    private int depth;
    private int maxDepth;
    private int threading;
    
    public Threads(String link, int depth, int maxDepth,int threading) {
        this.link = link;
        this.depth = depth;
        this.maxDepth = maxDepth;
        this.threading=threading;
    }
    
    @Override
    public void run() {
        try {
            try {
                LinkValidation.validateURL(link, depth, maxDepth,threading);
            } catch (InterruptedException ex) {
                Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
