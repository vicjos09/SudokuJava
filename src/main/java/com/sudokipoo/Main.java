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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Sudoku pa=new Sudoku();
          int[][] matrix={{0,0,6,8,0,0,0,9,4},
                          {0,2,0,0,6,0,7,0,0},
                          {7,0,0,4,0,2,0,0,0},
                          {0,0,0,0,0,0,0,1,0},
                          {6,4,0,0,2,8,3,5,0},
                          {0,9,0,5,0,1,0,0,2},
                          {4,0,2,6,0,3,0,0,5},
                          {0,0,0,0,1,0,0,0,3},
                          {8,0,9,0,0,0,1,2,0}};
       pa.setModelValues(matrix);
    
       
        if (pa.solve(0,0)) {
            pa.imprimir();
        }else{
            System.out.println("Sin solucion");
        }
       
    }
     
    
    
}
