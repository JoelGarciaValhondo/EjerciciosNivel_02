/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosnivel_02;

/**
 *
 * @author Joel García Valhondo
 */
public class EjerciciosNivel_02 {

    public boolean esEscaleraDePalabras(char[][] listaPalabras){
        for(int i=0; i < listaPalabras.length-1; i++){
            int contador = 0;
            for(int j=0; j < listaPalabras[0].length; j++){
                if(listaPalabras[i][j] != listaPalabras[i+1][j]){
                    contador++;
                }
            }
            if(contador != 1){ //si es distinto de uno es porque se diferencian en más de un caracter.
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        //test primer ejercicio.
        char[][] listaPalabras = {
            {'P', 'A', 'T', 'A'}, 
            {'P', 'A', 'T', 'O'}, 
            {'R', 'A', 'T', 'O'}, 
            {'R', 'A', 'M', 'O'}, 
            {'G', 'A', 'M', 'O'}, 
            {'G', 'A', 'T', 'O'}, 
            {'M', 'A', 'T', 'O'},
        };
        EjerciciosNivel_02 e = new EjerciciosNivel_02();
        System.out.println(e.esEscaleraDePalabras(listaPalabras));
    }
    
}
