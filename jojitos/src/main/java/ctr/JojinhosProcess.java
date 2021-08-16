package ctr;

import java.util.ArrayList;

import vo.Jojinho;
import vo.dao.JojinhoDAO;

public class JojinhosProcess {

	
	public static ArrayList<Jojinho> jogos = new ArrayList<>();
	public static JojinhoDAO cd = new JojinhoDAO();
	public static void testes() {
		jogos.add(new Jojinho("Stardew Valley", "Digital", "L", "RPG/Simulação", "26/02/2016"));
		
		jogos.add(new Jojinho("Mirror's Edge Catalyst", "Física", "16", "Plataforma/Ação", "7/06/2016"));
		
		jogos.add(new Jojinho("Black", "Física", "16", "FPS", "23/02/2006"));
		
		jogos.add(new Jojinho("Human: Fall Flat", "Digital", "L","Quebra-cabeça","22/07/2016"));
		
	    jogos.add(new Jojinho("South Park: A Fenda que Abunda Força", "Digital", "16","RPG", "17/10/2017"));
	}
}
