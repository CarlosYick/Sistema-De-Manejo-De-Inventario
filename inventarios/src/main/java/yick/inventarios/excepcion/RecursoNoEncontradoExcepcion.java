package yick.inventarios.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Como la usaremos en una respuesta de tipo rest agregamos ResponseStatus
//El not_found es porque es un recurso no encontrado
//RuntimeException es porque va a ser una excepcion no obligatoria
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNoEncontradoExcepcion extends RuntimeException{
    public RecursoNoEncontradoExcepcion(String mensaje){
        super(mensaje);
    }
}
