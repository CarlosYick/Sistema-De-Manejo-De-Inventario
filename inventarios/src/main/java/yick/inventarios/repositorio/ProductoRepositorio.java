package yick.inventarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import yick.inventarios.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {
}
