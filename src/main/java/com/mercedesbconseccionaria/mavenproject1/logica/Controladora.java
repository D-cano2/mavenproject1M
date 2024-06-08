/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercedesbconseccionaria.mavenproject1.logica;

import com.mercedesbconseccionaria.mavenproject1.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author canod
 */
public class Controladora {
ControladoraPersistencia controlPersis = new ControladoraPersistencia();
   
public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
       Automovil auto = new Automovil();
       auto.setModelo(modelo);
       auto.setMarca(marca);
       auto.setMotor(motor);
       auto.setColor(color);
       auto.setPatente(patente);
       auto.setCantPuertas(cantPuertas);
       
       controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
       return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
      controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
      return controlPersis.traerAutos(idAuto);
    }

    public void modificarAutomovil(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
      auto.setColor(color);
      auto.setModelo(modelo);
      auto.setMarca(marca);
      auto.setPatente(patente);
      auto.setMotor(motor);
      auto.setCantPuertas(cantPuertas);
      
      //le pido a la persi 
      controlPersis.modificarAuto(auto);
    }

  

   
    
}
