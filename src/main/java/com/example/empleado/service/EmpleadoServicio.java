package com.example.empleado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empleado.model.Empleado;
import com.example.empleado.repository.EmpleadoRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServicio {

    private final EmpleadoRepositorio empleadoRepositorio;

    @Autowired
    public EmpleadoServicio(EmpleadoRepositorio empleadoRepositorio) {
        this.empleadoRepositorio = empleadoRepositorio;
    }

    public List<Empleado> obtenerTodosLosEmpleados() {
        return empleadoRepositorio.findAll();
    }

    public Optional<Empleado> obtenerEmpleadoPorId(Long id) {
        return empleadoRepositorio.findById(id);
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    public void eliminarEmpleado(Long id) {
        empleadoRepositorio.deleteById(id);
    }
}
