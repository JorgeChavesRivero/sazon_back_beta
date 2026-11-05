package com.sazon.nutricion.servicio;

import com.sazon.nutricion.modelos.ObjetivoNutricional;
import java.util.List;

public interface ObjetivoNutricionalServicio {

    ObjetivoNutricional crear(ObjetivoNutricional objetivoNutricional);

    ObjetivoNutricional buscarPorId(Long id);

    List<ObjetivoNutricional> listarTodos();

    ObjetivoNutricional actualizar(Long id, ObjetivoNutricional objetivoNutricional);

    boolean eliminar(Long id);

    List<ObjetivoNutricional> listarPorIdPerfilAlimentario(Long idPerfilAlimentario);
}
