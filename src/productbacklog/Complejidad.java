/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productbacklog;

/**
 *
 * @author miria
 */
public class Complejidad {
    
    String tipo;
    int S, M,C;
    
    public  Complejidad(){
        this.tipo = "";
        this.C = 0;
        this.M = 0;
        this.S = 0;
    }
     public  Complejidad(String tipo, int S, int M, int C){
        this.tipo = tipo;
        this.C = S;
        this.M = M;
        this.S = C;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getS() {
        return S;
    }

    public void setS(int S) {
        this.S = S;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }
}
