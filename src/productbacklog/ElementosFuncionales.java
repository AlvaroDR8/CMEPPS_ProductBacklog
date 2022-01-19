/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productbacklog;

/**
 *
 * @author usuario
 */
public class ElementosFuncionales {

    private String nomGrupoLogico;
    private String nomTipoComponente;
    private int nFicheros;
    private int nDatosElementalesEnt;
    private int nDatosElementalesSal;

    public ElementosFuncionales() {
        nomGrupoLogico = "";
        nomTipoComponente = "";
        nFicheros = 0;
        nDatosElementalesEnt = 0;
        nDatosElementalesSal = 0;
    }

    public String getNomGrupoLogico() {
        return nomGrupoLogico;
    }

    public void setNomGrupoLogico(String nomGrupoLogico) {
        this.nomGrupoLogico = nomGrupoLogico;
    }

    public String getNomTipoComponente() {
        return nomTipoComponente;
    }

    public void setNomTipoComponente(String nomTipoComponente) {
        this.nomTipoComponente = nomTipoComponente;
    }

    public int getnFicheros() {
        return nFicheros;
    }

    public void setnFicheros(int nFicheros) {
        this.nFicheros = nFicheros;
    }

    public int getnDatosElementalesEnt() {
        return nDatosElementalesEnt;
    }

    public void setnDatosElementalesEnt(int nDatosElementalesEnt) {
        this.nDatosElementalesEnt = nDatosElementalesEnt;
    }

    public int getnDatosElementalesSal() {
        return nDatosElementalesSal;
    }

    public void setnDatosElementalesSal(int nDatosElementalesSal) {
        this.nDatosElementalesSal = nDatosElementalesSal;
    }
    

}
