/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyperlinkkk.validationnnn;

/**
 *
 * @author NEXT STORE
 */
public class linkanddepth {
    
    private String link;
       private int depth;
       private int threads;
       linkanddepth(String link ,int depth,int threads){
       this.link=link;
       this.depth=depth;
       this.threads=threads;
       }

        linkanddepth(String link ,int depth){
       this.link=link;
       this.depth=depth;
  
       }
    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "linkanddepth{" + "link=" + link + ", depth=" + depth + ", threads=" + threads + '}';
    }

  
    
}
