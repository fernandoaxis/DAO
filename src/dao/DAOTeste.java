package dao;

import br.com.dominio.DAO;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();
		String sql = "insert into pessoas (nome, codigo) values (?)";
		
		System.out.println(dao.incluir(sql, "João da Silva", 1000));
		System.out.println(dao.incluir(sql, "Julia da Conceicao", 1001));
		System.out.println(dao.incluir(sql, "Djalma Pereira", 1002));
		
		dao.close();

	}
}
