package umg.edu.gt.test.EjercicioLinkedList;

public class LinkedListEjercicios {
    package umg.edu.gt.test.EjercicioLinkedList;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Collections;

    public class LinkedListEjercicios {

        // Problema 1: Eliminar duplicados dejando la primera aparición
        public LinkedList<Integer> eliminarDuplicados(LinkedList<Integer> lista) {
            HashSet<Integer> set = new HashSet<>();
            LinkedList<Integer> resultado = new LinkedList<>();

            for (Integer num : lista) {
                if (set.add(num)) {
                    resultado.add(num);
                }
            }
            return resultado;
        }

        // Problema 2: Invertir la lista sin usar otra estructura de datos
        public LinkedList<String> invertirLista(LinkedList<String> lista) {
            for (int i = 0; i < lista.size() / 2; i++) {
                String temp = lista.get(i);
                lista.set(i, lista.get(lista.size() - 1 - i));
                lista.set(lista.size() - 1 - i, temp);
            }
            return lista;
        }

        // Problema 3: Intercalar dos listas ordenadas
        public LinkedList<Integer> intercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
            LinkedList<Integer> resultado = new LinkedList<>();
            int i = 0, j = 0;

            while (i < lista1.size() && j < lista2.size()) {
                if (lista1.get(i) <= lista2.get(j)) {
                    resultado.add(lista1.get(i++));
                } else {
                    resultado.add(lista2.get(j++));
                }
            }

            while (i < lista1.size()) {
                resultado.add(lista1.get(i++));
            }

            while (j < lista2.size()) {
                resultado.add(lista2.get(j++));
            }

            return resultado;
        }
    }




}
