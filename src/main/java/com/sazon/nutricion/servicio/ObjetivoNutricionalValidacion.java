package com.sazon.nutricion.servicio;

import com.sazon.nutricion.modelos.ObjetivoNutricional;

public interface ObjetivoNutricionalValidacion {

    /**
     * Valida el nombre del objetivo.
     */
    void validarNombreObjetivo(String nombreObjetivo);

    /**
     * Valida la descripción del objetivo.
     */
    void validarDescripcion(String descripcion);

    /**
     * Valida las calorías objetivo.
     */
    void validarCaloriasObjetivo(Double caloriasObjetivo);

    /**
     * Valida la fecha de inicio.
     */
    void validarFechaInicio(String fechaInicio);

    /**
     * Valida el id del perfil alimentario asociado.
     */
    void validarIdPerfilAlimentario(Long idPerfilAlimentario);

    /**
     * Valida el objeto completo.
     */
    void validarObjetivoNutricionalCompleto(ObjetivoNutricional objetivoNutricional);
}
