/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniades.salguero;

/**
 *
 * @author Usuario
 */
public class cslproducto {

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float Valor() {
        return valor;
    }

    public void Valor(float valor) {
        this.valor = valor;
    }

    public unidad Unidad() {
        return _unidad;
    }

    public void Unidad(unidad _unidad) {
        this._unidad = _unidad;
    }
    
    public enum unidad{litro, metro, libras };
            
    private int _id;
    private String _nombre;
    private float valor;
    private unidad _unidad;

    public cslproducto(int _id, String _nombre, float valor, unidad _unidad) {
        this._id = _id;
        this._nombre = _nombre;
        this.valor = valor;
        this._unidad = _unidad;
    }

    
    }
 