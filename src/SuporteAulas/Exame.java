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
public class Exame extends MomentoAvaliacao{
    Questao questoes;

    public Questao getQuestoes() {
        return questoes;
    }

    public void setQuestoes(Questao questoes) {
        this.questoes = questoes;
    }

    public Exame(Questao questoes) {
        this.questoes = questoes;
    }
    
}
