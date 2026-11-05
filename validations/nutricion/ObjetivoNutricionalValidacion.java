package validations.nutricion;

import models.nutricion.ObjetivoNutricional;

public interface ObjetivoNutricionalValidacion {

    void validarNombreObjetivo(String nombreObjetivo);

    void validarDescripcion(String descripcion);

    void validarCaloriasObjetivo(Double caloriasObjetivo);

    void validarFechaInicio(String fechaInicio);

    void validarIdPerfilAlimentario(Long idPerfilAlimentario);

    void validarObjetivoNutricionalCompleto(ObjetivoNutricional objetivoNutricional);
}
