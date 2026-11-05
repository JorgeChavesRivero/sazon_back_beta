import java.util.List;

public interface IComidaPlanificadaServicio {

ComidaPlanificada crear(ComidaPlanificada comidaPlanificada);
ComdidaPlanificada buscarPorId (Long id);
List<ComidaPlanificada> listarTodos();
ComidaPlanificada actualizar (Long id, ComidaPlanifica comidaPlanificada);
boolean eliminar (Long id);
List<ComidaPlanificada> listarPorIdPlanSemanal(Long idPlanSemanal);

}

}
