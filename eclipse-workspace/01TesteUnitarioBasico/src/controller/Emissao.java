package controller;

import model.ContraCheque;

public class Emissao {
public static void main(String[] args) {
	ContraCheque contracheque = 
	ContraCheque.questionario();
	contracheque.relatorio();
}
}
