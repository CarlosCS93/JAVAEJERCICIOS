/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.egg;

import Entidad.Objeto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class COLECCIONESEGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("<<<LISTAS>>>");
        // ArrayList: Arreglo de tamaño variable, su tamaño aumenta dinamicamente,
        // es el tipo mas comun
        // Forma de escribir y tipo de dato (Mayuscula la primera letra)
        //ArrayList + <Tipo de Dato> + nombre variable = "new" ArrayList +();
        ArrayList<Integer> num = new ArrayList(); // Numero entero
        ArrayList<Double> dec = new ArrayList(); // Numero decimal
        ArrayList<Long> numl = new ArrayList(); // Entero largo
        ArrayList<Character> carac = new ArrayList(); // Caracter
        ArrayList<Boolean> ban = new ArrayList(); // Logico true o false

        //LinkedList: Lista de doble enlace, mejor para agregar y quitar elementos
        // pero peor para usar los metodos get y set
        //LinkedList + <Tipo de Dato> + nombre variable = "new" LinkedList +();
        LinkedList<Integer> nume = new LinkedList(); // Numero entero
        LinkedList<Double> deci = new LinkedList(); // Numero decimal
        LinkedList<Long> num2 = new LinkedList(); // Entero largo
        LinkedList<Character> caracter = new LinkedList(); // Caracter
        LinkedList<Boolean> band = new LinkedList(); // Logico true o false

        //<<<CONJUNTOS>>>
        //HashSet: Utiliza una tabla hash para darle un valor unico(codigo) a cada elemento y 
        // evitar los duplicados
        HashSet<String> nombre = new HashSet();

        // TreeSet: Se implementa utilizando una estructura de arbol
        TreeSet<Integer> numeros = new TreeSet();
        // LinkedHashSet: Esta entre el HashSet y TreeSet, se implementa como una lista vinculada
        //que se ejecuta a travez de esa lista proporcionando el orden de insercion
        LinkedHashSet<String> frases = new LinkedHashSet();

        //<<<MAPAS>>>: Los mapas modelan un objeto a traves de una llave y un valor
        //Forma de escritura
        // Tipo de mapa + <Llave, Tipo de Dato> + nombre variable = new + Tipo de mapa ();
        //llave = Integer
        //HashMap: Es un mapa implementado a traves de una tabla hash, las llaves 
        // se almacenan utilizando un algoritmo de hash solo para las llaves y evitar 
        // que  se repitan
        HashMap<Integer, String> persona = new HashMap();
        //
        //TreeMap: Es un mapa qu ordena los elementos de manera ascendente a traves de las llaves
        TreeMap<Integer, String> personaA = new TreeMap();
        //LinkedHashMap: Es un HashMap que conserva el orden de insercion
        LinkedHashMap<Integer, String> personaB = new LinkedHashMap();

        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> c = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();

        //AÑADIR ELEMENTOS EN UNA COLECCION
        // "Listas y Conjuntos" se usa la funcion --- add();
        // "Mapas" se usa la funcion --- put(llave, valor);
        // Ejemplo con tipo de dato especifico
        ArrayList<Integer> nu = new ArrayList();
        int ja = 4;
        int jaa = 5;
        int jaaa = 6;
        int jaaaa = 7;
        int jaaaaa = 8;

        nu.add(ja); // agregamos el primer numero a la lista en la posicion 0.
        nu.add(jaa);
        nu.add(jaaa);
        nu.add(jaaaa);
        nu.add(jaaaaa);

        System.out.println(nu);

        // Tipo Objeto 
        Objeto people = new Objeto("Luna", "Victoria");

        ArrayList<Objeto> g = new ArrayList();
        g.add(people);
        System.out.println(g);

        HashSet<String> gente = new HashSet();
        String na = "Juan";
        String ne = "Margarita";
        String ni = "Javier";
        String no = "Iliana";
        String si = "Lunita";

        gente.add(si);
        gente.add(ne);
        gente.add(ni);
        gente.add(no);
        gente.add(na);
        System.out.println(gente.size());
        System.out.println(gente);

        // Tipo Objeto
        HashSet<Objeto> ej = new HashSet();
        ej.add(people);
        System.out.println(ej);

        HashMap<Integer, String> dni = new HashMap();
        int nui = 23002643;
        String usuario = "Carlos";
        int auxi = 23002748;
        String usuarioi = "Evelin";
        int nuii = 233343;
        String usuarioo = "Javier";
        int auxx = 243983;
        String usuariooo = "Iliana";
        int xi = 112345;
        String usuarioooo = "Victoria";
        dni.put(nui, usuario); //Agregamos la llave y el valor.
        dni.put(auxi, usuarioi);
        dni.put(nuii, usuarioo);
        dni.put(auxx, usuariooo);
        dni.put(xi, usuarioooo);
        System.out.println(dni);

        // BORRAR ELEMENTOS 
        //LISTAS: Se pueden mediante 2 metodos
        // remove(int indice); borra un elemento en especifico segun su indice
        // remove(elemento); borra la primera aparicion de un elemento especificado
        System.out.println("**********************");
        nu.remove(0);

        //CONJUNTOS: Se puede mediante 1 metodo debido a que no                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
        gente.remove("Lunita");

        // MAPAS: Se puede eleminar un objeto mediante lo mas importante que es la llave
        dni.remove(112345);
        System.out.println(nu);
        System.out.println(gente);
        System.out.println(dni);

        System.out.println("**************************");

        // RECORRER UNA COLLECTION
        //LISTA ARRAYLIST
        for (Integer lista : nu) {
            System.out.println(lista);
        }
        //CONJUNTO HASHSET
        for (String conjunto : gente) {
            System.out.println(conjunto);
        }
        // MAPAS HASHMAP
        // entry.getKey trae las llaves del mapa
        // entry.getValue trae los datos o valores del mapa

        for (Map.Entry<Integer, String> mapas : dni.entrySet()) {
            System.out.println("dni: " + mapas.getKey() + ", nombre: " + mapas.getValue());
        }

        // Sin Map.Entry:
        //Mostrar solo las llaves
        for (Integer llave : dni.keySet()) {
            System.out.println("Llave: " + llave);
        }

        //Mostrar solo los valores o datos del mapa
        for (String valor : dni.values()) {
            System.out.println("Nombre: " + valor);
        }

        System.out.println("DETECCION DE ERRORES");
        HashMap < Integer, String> per = new HashMap();
        int j1 = 324;
        int j2 = 456;
        String w1 = "Harry";
        String w2 = "Severus";
        per.put(j1,w1);
        per.put(j2,w2);
        System.out.println(per);
        
        
        System.out.println("*****************");
        System.out.println("ITERADOR");
        Iterator iterator = nu.iterator(); //Se instancia el objeto iterator con el nombre de la lista
        System.out.println("ELEMENTOS DE LA LISTA: ");
        int i=0;
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext()+" ");
            i++;
        }
        System.out.println();
    }

}
