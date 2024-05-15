package br.comfabrciocurvello.testemaven;

import org.junit.Assert;
import org.junit.Test;

import br.comfabrciocurvello.testemaven.model.ContraCheque;


public class ContraChequeTest {
	
	@Test
	public void relatorioTest() {
	String nomeTest = "Manoel";
	double salarioBrutoTest = 6000.00;
	double totalDescontosTest = 1000.00;
	ContraCheque c1 = new ContraCheque
	(nomeTest,salarioBrutoTest, 
			totalDescontosTest);
	
	//Ação
	c1.relatorio();	
	
	// verificação
	Assert.assertEquals("FALHA NO ATRIBUTO NOME", nomeTest, c1.getNome());
	
	Assert.assertEquals("Falha no atributo ", salarioBrutoTest,c1.getSalarioBruto(),0.01);
	
	Assert.assertEquals("Falha no atributo", totalDescontosTest, c1.getTotalDescontos(), 0.01);
	
	Assert.assertEquals("Falha no salarioLiquido", (salarioBrutoTest - totalDescontosTest), c1.getSalarioLiquido(), 0.01);
	
}
}
