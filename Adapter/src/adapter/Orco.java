/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author juliana
 */
public class Orco extends Personaje{

    @Override
    public String golpear() {
       return "Orco golpeando";
    }

    @Override
    public String correr() {
        return "Orco corriendo";
    }

    @Override
    public String saltar() {
        return "Orco saltando";
    }
}
