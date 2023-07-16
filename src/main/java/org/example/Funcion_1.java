package org.example;

import java.util.Objects;

public class Funcion_1 {
    public static int calcular (int a, int b, String consul){
      if(Objects.equals(consul, "suma")){
          return a + b;
      } else if (Objects.equals(consul, "multiplicacion")) {
          return a * b;
      }
        return 6;
    };


};
