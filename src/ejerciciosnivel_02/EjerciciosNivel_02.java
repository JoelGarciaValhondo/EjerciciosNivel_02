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

    /**
     * PRIMER EJERCICIO LISTAPALABRAS
     * @param listaPalabras, lista de palabras para ver si es una escalera de palabras.
     * @return 
     */
    
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
    
    /**
     * SEGUNDO EJERCICIO costeErroresADN
     * @param cadena1 primera cadena a comparar.
     * @param cadena2 segunda cadena a comparar.
     * @return 
     */
    
    private int costeErroresADN (String cadena1, String cadena2){
        int contador = 0;
        for(int i=0; i < cadena1.length(); i++){
            if(cadena1.charAt(i)=='-' || cadena2.charAt(i)=='-'){
                contador++;
                contador++;
            }else if((cadena1.charAt(i) == 'A' && cadena2.charAt(i) != 'T') ||
                    (cadena1.charAt(i) == 'C' && cadena2.charAt(i) != 'G') ||
                    (cadena1.charAt(i) != 'A' && cadena2.charAt(i) == 'T') ||
                    (cadena1.charAt(i) != 'C' && cadena2.charAt(i) == 'G')){
                contador++;  
            }
        }
        return contador;
    }
    
    public int strStr(String str1, String str2){
        //EN LA VIDA REAL SE SA .find PARA QUE TE DEVUELVA EL VALOR.
        int posicion = -1;
        for(int i=0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(0)){
                posicion = i;
                int j=0;
                while((j < str2.length() && i < str1.length()) && str1.charAt(i) == str2.charAt(j)){
                    i++;
                    j++;                       
                }
                if(j == str2.length()){ //encuentra la palabra.
                    return posicion;
                }
                if(i == str1.length()){ //se termina la palabra 1 y no cabe la 2.
                     return -1;
                }
                //si llega aqui es porque ha salido del while porque las letras
                //son diferentes.
                i = posicion;
                posicion =-1;
            }
        }
        return posicion;
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
        //test segundo ejercicio.
        System.out.println(e.costeErroresADN("ACGT", "TGCA")); //0
        System.out.println(e.costeErroresADN("A-C-G-T-ACGT", "TTGGCCAATGCA")); //8
        System.out.println(e.costeErroresADN("AAAAAAAA", "TTTATTTT")); //1
        System.out.println(e.costeErroresADN("GATTACA", "CTATT-T")); //3
        System.out.println(e.costeErroresADN("CAT-TAG-ACT", "GTATATCCAAA")); // 6
        System.out.println(e.costeErroresADN("--------", "ACGTACGT")); //16
        System.out.println(e.costeErroresADN("TAATAA", "ATTATT")); //0
        System.out.println(e.costeErroresADN("GGGA-GAATATCTGGACT", "CCCTACTTA-AGACCGGT")); //6
        //test tercer ejercicio.
        System.out.println(e.strStr("HOLA_MUNDO", "MU")); //5
        System.out.println(e.strStr("HOLA_MUNDO", "ME")); //-1
        System.out.println(e.strStr("HOLA_MUNDO", "DO")); //8
    }
    
}
