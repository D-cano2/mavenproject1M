/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercedesbconseccionaria.mavenproject1.persistencia;

import com.mercedesbconseccionaria.mavenproject1.logica.Automovil;
import com.mercedesbconseccionaria.mavenproject1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author canod
 */
public class ControladoraPersistencia {
AutomovilJpaController autoJpa = new AutomovilJpaController();
  
public void agregarAutomovil(Automovil auto) {
      autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
      return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
    try {
        autoJpa.destroy(idAuto);
    } catch (NonexistentEntityException ex) {
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public Automovil traerAutos(int idAuto) {
    return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
    try {
        autoJpa.edit(auto);
    } catch (Exception ex) {
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
}
