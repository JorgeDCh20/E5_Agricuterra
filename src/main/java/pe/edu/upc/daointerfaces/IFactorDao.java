package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Factor;

public interface IFactorDao {

	public void insert(Factor f);

	public List<Factor> list();

	public void update(Factor f);
}
