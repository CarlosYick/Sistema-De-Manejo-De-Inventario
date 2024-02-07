package yick.inventarios.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity                 //Entidad
@Data                   //Añade metodos set y get de cada atributo
@NoArgsConstructor      //Agrega Constructor Vacio a la clase
@AllArgsConstructor     //Agrega Constructor Con todos los argumentos a la clase
@ToString
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //AutoIncrementable
    Integer idProducto;
    String descripcion;
    Double precio;
    Integer existencia;

}
