package level_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {

    public static void main (String [] args) throws IOException {

        System.out.println("Ingrese un texto de entrada: ");
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String entrada = scan.readLine();
        char[] palabraAcaracter = entrada.toCharArray();
        Character[] a = new Character[27];
        Character[] b = new Character[27];
        String resultado = "";
        arrayMinusculas(a);
        arrayMayusculas(b);
        for(int i = 0; i < palabraAcaracter.length  ; i++) {
            for (int j = 0; j < 27; j++) {
                if (palabraAcaracter[i] == a[j]) {
                    resultado = resultado + b[j];
                }
            }
            if (i >= resultado.length()) {
                resultado = resultado + palabraAcaracter[i];
            }

        }
        System.out.println("resultado = " + resultado);
    }

    public static Character[] arrayMinusculas(Character[] abecedarioEnMinusculas) {
        abecedarioEnMinusculas[0] = 'a';
        abecedarioEnMinusculas[1] = 'b';
        abecedarioEnMinusculas[2] = 'c';
        abecedarioEnMinusculas[3] = 'd';
        abecedarioEnMinusculas[4] = 'e';
        abecedarioEnMinusculas[5] = 'f';
        abecedarioEnMinusculas[6] = 'g';
        abecedarioEnMinusculas[7] = 'h';
        abecedarioEnMinusculas[8] = 'i';
        abecedarioEnMinusculas[9] = 'j';
        abecedarioEnMinusculas[10] = 'k';
        abecedarioEnMinusculas[11] = 'l';
        abecedarioEnMinusculas[12] = 'm';
        abecedarioEnMinusculas[13] = 'n';
        abecedarioEnMinusculas[14] = 'ñ';
        abecedarioEnMinusculas[15] = 'o';
        abecedarioEnMinusculas[16] = 'p';
        abecedarioEnMinusculas[17] = 'q';
        abecedarioEnMinusculas[18] = 'r';
        abecedarioEnMinusculas[19] = 's';
        abecedarioEnMinusculas[20] = 't';
        abecedarioEnMinusculas[21] = 'u';
        abecedarioEnMinusculas[22] = 'v';
        abecedarioEnMinusculas[23] = 'w';
        abecedarioEnMinusculas[24] = 'x';
        abecedarioEnMinusculas[25] = 'y';
        abecedarioEnMinusculas[26] = 'z';
        return abecedarioEnMinusculas;
    }
      public static Character[] arrayMayusculas(Character[] abecedarioMayusculas) {

      abecedarioMayusculas[0] = 'A';
      abecedarioMayusculas[1] = 'B';
      abecedarioMayusculas[2] = 'C';
      abecedarioMayusculas[3] = 'D';
      abecedarioMayusculas[4] = 'E';
      abecedarioMayusculas[5] = 'F';
      abecedarioMayusculas[6] = 'G';
      abecedarioMayusculas[7] = 'H';
      abecedarioMayusculas[8] = 'I';
      abecedarioMayusculas[9] = 'J';
      abecedarioMayusculas[10] = 'K';
      abecedarioMayusculas[11] = 'L';
      abecedarioMayusculas[12] = 'M';
      abecedarioMayusculas[13] = 'N';
      abecedarioMayusculas[14] = 'Ñ';
      abecedarioMayusculas[15] = 'O';
      abecedarioMayusculas[16] = 'P';
      abecedarioMayusculas[17] = 'Q';
      abecedarioMayusculas[18] = 'R';
      abecedarioMayusculas[19] = 'S';
      abecedarioMayusculas[20] = 'T';
      abecedarioMayusculas[21] = 'U';
      abecedarioMayusculas[22] = 'V';
      abecedarioMayusculas[23] = 'W';
      abecedarioMayusculas[24] = 'X';
      abecedarioMayusculas[25] = 'Y';
      abecedarioMayusculas[26] = 'Z';

          return abecedarioMayusculas;
      }





}


