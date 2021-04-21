package br.com.edesio.campo_minado;

import br.com.edesio.campo_minado.modelo.Tabuleiro;
import br.com.edesio.campo_minado.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		//Aqui você altera as configurações do jogo (coluna, linha, bombas)
		Tabuleiro tabuleiro = new Tabuleiro(8,8,6);
		new TabuleiroConsole(tabuleiro);
	}
}
