/******************************************
 * RONILDO OLIVEIRA DA SILVA - 36673
 * CIÊNCIA DA COMPUTAÇÃO
 * 
 * ESTRUTURA DE DADOS AVANCADA
 *  
 * ALGORITMO DE KRUSKAL
 */
package ufc.eda.kruskal.main;
import javax.swing.JFrame;

import ufc.eda.kruskal.algoritmo.Kruskal;
import ufc.eda.kruskal.gui.ExibirCaminho;

public class Main {
	public static void main(String[] args) {
		
		int numeroPontos = 150;
		Kruskal k = new Kruskal(numeroPontos);	
		
		JFrame frame;
		frame=new ExibirCaminho(k.getMenorGrafo());
		frame.setVisible(true);
	}
}
