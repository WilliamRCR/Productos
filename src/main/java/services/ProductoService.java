package services;



import entities.Producto;

import java.util.List;

public interface ProductoService {

    public List<Producto> listar();
    public Producto buscar(Long id);
    public void Crear(Producto producto);


}
