package vo.dao;

import vo.Jojinho;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class JojinhoDAO {
	
	private Jojinho jogo;
	private ArrayList<Jojinho>jogos;
	private BufferedWriter bw;
	private BufferedReader br;
	private String arquivo = "c:\\dbs\\jogos.csv";

	public ArrayList<Jojinho> abrir() {
		jogos = new ArrayList<>();
try {
	br = new BufferedReader(new FileReader (arquivo));
String linha = "";
while ((linha = br.readLine()) !=null) {
	String[] campos = linha.split(";");
	jogo = new Jojinho (campos[0], campos[1], campos[2], campos[3], campos[4]);
	jogos.add(jogo);
}
br.close();
}catch (IOException e) {
	System.out.println("Erro ao abrir arquivo: " + e);
}
return jogos;
}

public boolean
salvar(ArrayList<Jojinho> vs) {
	try {
	bw = new BufferedWriter(new FileWriter(arquivo, false));
	for (Jojinho p: vs) {
		bw.write(p.toCSV());
	}
	bw.close();
	return true;
	} catch(IOException e) {
		System.out.println("Erro ao gravar arquivo: " + e);
		return false;
	   }
	}
}
