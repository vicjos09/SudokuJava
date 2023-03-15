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
public class Sudoku extends Matriz {
    
    Sudoku(){
        super();       
    }
    
    public void setModelValues(int[][] valores){
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                modelo[i][j]=valores[i][j];
            }
        }                
    }
    
    public boolean checkRow(int fila,int num){
        for (int i = 0; i < 9; i++) {
              if (modelo[fila][i]==num) {
                return false;
            }
        }
        return true;
    }
    public boolean checkCol(int col,int num){
        for (int i = 0; i < 9; i++) {
              if (modelo[i][col]==num) {
                return false;
            }
        }
        return true;
    }
    public boolean checkBox(int fila,int col,int num){
        fila=(fila/3)*3;
        col=(col/3)*3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.getDato(fila+i, col+j)==num) return false; 
            }
        }
        return true;
    }
    
    public boolean solve(int fila, int col){
        if (fila==9) {
            fila=0;
            if (++col==9) {
                return true;
            }
        }
        if(modelo[fila][col]!=0)
          return solve(fila+1,col);
        
        for (int val = 1; val <= 9; ++val) {
            if (checkBox(fila, col, val) && checkCol(col, val) && checkRow(fila, val)) {
               
                this.setDato(fila, col, val);
                if (solve(fila+1,col)) {
                    return true;
                }
            }
        }
        this.setDato(fila,col,0);
    
        return false;
        
    }
    
    
    
    
}
