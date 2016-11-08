/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuporteAulas;

/**
 *
 * @author UserPL022Pc10
 */
public class ProvaOral extends MomentoAvaliacao{
    
    int fluencia, dominioMateria;

    public ProvaOral(int fluencia, int dominioMateria) {
        this.fluencia = fluencia;
        this.dominioMateria = dominioMateria;
    }

    public int getFluencia() {
        return fluencia;
    }

    public void setFluencia(int novafluencia) {
        this.fluencia = novafluencia;
    }

    public int getDominioMateria() {
        return dominioMateria;
    }

    public void setDominioMateria(int dominioMateria) {
        this.dominioMateria = dominioMateria;
    }
    
   
}
