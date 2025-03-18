package umg.edu.gt.test.EjercicioLinkedList;

public class LinkedListEjerciciosTest {

    package umg.edu.gt.test.EjercicioLinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.Arrays;

    public class LinkedListEjerciciosTest {

        LinkedListEjercicios ejercicios = new LinkedListEjercicios();

        // 🔹 Test para el Problema 1: Eliminar duplicados
        @Test
        public void testEliminarDuplicadosEjemplo1() {
            LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
            LinkedList<Integer> resultadoEsperado = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

            assertEquals(resultadoEsperado, ejercicios.eliminarDuplicados(lista));
        }

        @Test
        public void testEliminarDuplicadosEjemplo2() {
            LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 1, 1, 1));
            LinkedList<Integer> resultadoEsperado = new LinkedList<>(Arrays.asList(1));

            assertEquals(resultadoEsperado, ejercicios.eliminarDuplicados(lista));
        }

        @Test
        public void testEliminarDuplicadosForzarError() {
            LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 5));
            LinkedList<Integer> resultadoErroneo = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 5)); // Resultado incorrecto intencionalmente

            assertNotEquals(resultadoErroneo, ejercicios.eliminarDuplicados(lista));
        }

        // 🔹 Test para el Problema 2: Invertir la lista
        @Test
        public void testInvertirListaEjemplo1() {
            LinkedList<String> lista = new LinkedList<>(Arrays.asList("a", "b", "c", "d"));
            LinkedList<String> resultadoEsperado = new LinkedList<>(Arrays.asList("d", "c", "b", "a"));

            assertEquals(resultadoEsperado, ejercicios.invertirLista(lista));
        }

        @Test
        public void testInvertirListaEjemplo2() {
            LinkedList<String> lista = new LinkedList<>(Arrays.asList("x", "y", "z"));
            LinkedList<String> resultadoEsperado = new LinkedList<>(Arrays.asList("z", "y", "x"));

            assertEquals(resultadoEsperado, ejercicios.invertirLista(lista));
        }

        @Test
        public void testInvertirListaForzarError() {
            LinkedList<String> lista = new LinkedList<>(Arrays.asList("a", "b", "c"));
            LinkedList<String> resultadoErroneo = new LinkedList<>(Arrays.asList("a", "b", "c")); // No está invertida, error forzado

            assertNotEquals(resultadoErroneo, ejercicios.invertirLista(lista));
        }

        // 🔹 Test para el Problema 3: Intercalar dos listas ordenadas
        @Test
        public void testIntercalarListasEjemplo1() {
            LinkedList<Integer> lista1 = new LinkedList<>(Arrays.asList(1, 3, 5));
            LinkedList<Integer> lista2 = new LinkedList<>(Arrays.asList(2, 4, 6));
            LinkedList<Integer> resultadoEsperado = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

            assertEquals(resultadoEsperado, ejercicios.intercalarListas(lista1, lista2));
        }

        @Test
        public void testIntercalarListasEjemplo2() {
            LinkedList<Integer> lista1 = new LinkedList<>(Arrays.asList(1, 2, 3));
            LinkedList<Integer> lista2 = new LinkedList<>(Arrays.asList(4, 5, 6));
            LinkedList<Integer> resultadoEsperado = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

            assertEquals(resultadoEsperado, ejercicios.intercalarListas(lista1, lista2));
        }

        @Test
        public void testIntercalarListasForzarError() {
            LinkedList<Integer> lista1 = new LinkedList<>(Arrays.asList(1, 2, 3));
            LinkedList<Integer> lista2 = new LinkedList<>(Arrays.asList(4, 5, 6));
            LinkedList<Integer> resultadoErroneo = new LinkedList<>(Arrays.asList(1, 4, 2, 5, 3, 6)); // Orden incorrecto

            assertNotEquals(resultadoErroneo, ejercicios.intercalarListas(lista1, lista2));
        }
    }

}
