/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario.Main;

import Inventario.SQLite.Conexion;
import Inventario.Vistas.Login;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Login ventana = new Login();
        ventana.setVisible(true);
        Conexion.conectar();
        
    }
}
