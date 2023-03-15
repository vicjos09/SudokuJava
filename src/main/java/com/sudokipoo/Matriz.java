/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudokipoo;

/**
 *
 * @author Joseph
 */
public class Matriz {
    int[][] modelo= new int[9][9];
    
    
    Matriz(){
        for(int fila=0;fila<9;fila++){
            for(int col=0;col<9;col++){
                modelo[fila][col]=0;
            }
        }
    }
    
    public void setDato(int fila,int col,int dato){
           modelo[fila][col]=dato;
    }
    
    public int getDato(int fila,int col){
        return modelo[fila][col];
    }

    
    public void imprimir(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                     System.out.print(modelo[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
    
}
