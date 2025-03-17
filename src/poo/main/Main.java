package poo.main;

import poo.persona.Coche;
import poo.persona.CuentaBancaria;
import poo.persona.Empleado;
import poo.persona.Persona;

public class Main {
    public static void main(String[] args) {
        //Probando funcionalidad clase Persona
        System.out.println("*** Mostrando Información en clase Persona ***");
        Persona persona = new Persona("Israel", 30);
        persona.saludar();
        System.out.println();
        //Probando funcionalidad clase Coche
        System.out.println("*** Mostrando Información en clase Coche ***");
        Coche coche = new Coche("Toyota", "C-HR", 2021);
        coche.acelerar();
        System.out.println();
        //Probando funcionalidad clase Cuenta Bancaria
        System.out.println("*** Mostrando Información en clase Cuenta Bancaria ***");
        CuentaBancaria cuentaBancaria = new CuentaBancaria(500);
        cuentaBancaria.saldoActual();
        cuentaBancaria.depositar(200);
        cuentaBancaria.saldoActual();
        cuentaBancaria.retirar(15.9);
        cuentaBancaria.saldoActual();
        System.out.println();
        //probando herencia de persona y empleado
        Empleado empleado = new Empleado("Israel", 30, 3000, "Programador");
        System.out.println(empleado);
        empleado.setSalario(4000);
        System.out.println("El nuevo salario del empleado es: " + empleado.getSalario());
    }
}
