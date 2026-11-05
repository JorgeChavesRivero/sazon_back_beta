import java.util.List;

import models.nutricion.PerfilAlimentario;

public interface PerfilAlimentarioServicio {
    PerfilAlimentario crear(PerfilAlimentario perfilAlimentario);
    PerfilAlimentario buscarPorId(Long id);
    List<PerfilAlimentario> listarTodos();
    PerfilAlimentario actualizar(Long id, PerfilAlimentario perfilAlimentario);
    boolean eliminar(Long id);
    List<PerfilAlimentario> listarPorIdUsuario(Long idUsuario);
}
