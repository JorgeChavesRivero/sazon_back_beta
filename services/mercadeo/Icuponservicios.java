
public interface Icuponservicios {
    Cupon crear(Cupon cupon);
    Cupon buscarPorId(Long id);
    List<Cupon> listarTodos();
    Cupon actualizar(Long id, Cupon cupon);
    boolean eliminar(Long id);
    List<Cupon> listarPorCampana(Long idCampana);
}
