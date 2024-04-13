package services;

import entities.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductoServiceImpl implements ProductoService{
    private static AtomicLong sequence = new AtomicLong();
    private static List<Producto> lista = new ArrayList<Producto>(){{
        add(new Producto(sequence.incrementAndGet(), "Audifonos", "Sony", "Bluetooth", 100 ));
    }};

    @Override
    public List<Producto> listar() {
        return lista;
    }

    @Override
    public Producto buscar(Long id) {
        for(Producto e: lista){
            if(e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }

    @Override
    public void Crear(Producto producto) {
        lista.add(new Producto(sequence.incrementAndGet(),
                producto.getNombre(), producto.getMarca(), producto.getDescripcion(), producto.getPrecio()));
    }

    @Override
    public void Actualizar(Long id, Producto producto) {
        for (int i = 0; i < lista.size(); i++) {
            Producto p = lista.get(i);
            if (p.getId().equals(id)) {
                lista.set(i, producto);
            }
        }


    }

    @Override
    public void Eliminar(Long id) {
        lista.removeIf(producto -> producto.getId().equals(id));
    }
}
