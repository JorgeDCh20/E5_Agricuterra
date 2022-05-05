package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Factor;

public interface IFactorService {

	public void insert(Factor f);

	public List<Factor> list();

	public void update(Factor f);
}
