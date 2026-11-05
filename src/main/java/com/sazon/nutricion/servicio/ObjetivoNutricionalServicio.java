package com.sazon.nutricion.servicio;

import com.sazon.nutricion.modelo.ObjetivoNutricional;
import java.util.List;

public interface ObjetivoNutricionalServicio {

    /**
     * Guarda un nuevo objetivo nutricional y lo devuelve con su id asignado.
     */
    ObjetivoNutricional crear(ObjetivoNutricional objetivoNutricional);

    /**
     * Devuelve el objetivo nutricional que tenga ese id, o null si no existe.
     */
    ObjetivoNutricional buscarPorId(Long id);

    /**
     * Devuelve todos los objetivos nutricionales; si no hay ninguno, una lista vacía (nunca null).
     */
    List<ObjetivoNutricional> listarTodos();

    /**
     * Reemplaza los datos del objetivo nutricional que tenga ese id y lo devuelve; null si no existe.
     */
    ObjetivoNutricional actualizar(Long id, ObjetivoNutricional objetivoNutricional);

    /**
     * Borra el objetivo nutricional que tenga ese id; true si lo borró, false si no existía.
     */
    boolean eliminar(Long id);

    /**
     * Devuelve los objetivos nutricionales que tengan ese idPerfilAlimentario.
     */
    List<ObjetivoNutricional> listarPorIdPerfilAlimentario(Long idPerfilAlimentario);
}
