package br.com.opet.controller;

import javax.inject.Named;

import br.com.opet.model.Aluno;

@Named("appController")
public class AppController {
    public void salvar(Aluno a){
        a.salvar();
    }
}
