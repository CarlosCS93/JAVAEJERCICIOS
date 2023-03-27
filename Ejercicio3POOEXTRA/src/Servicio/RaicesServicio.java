/*
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package Servicio;

import Entidad.Raices;

public class RaicesServicio {

    public double discriminante(Raices r) { // le paso un parametro de tipo Raices

        double discriminante = (((Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC())));

     //  r.setDiscrimimnante(discriminante);  como tengo un atributo discriminante tengo que modificar el valor

        return discriminante;

    }

    public boolean tieneRaices(Raices r) {

        return discriminante(r) > 0; // puedo hacer la validacion pasandole el metodo directamente porque es de la misma clase

    }

    public boolean tieneRaiz(Raices r) {

        return discriminante(r) == 0;
    }

    public void obtenerRaices(Raices r) {

        if (tieneRaices(r)) {
            double s1 = (-r.getB() + (Math.sqrt(discriminante(r)))) / (2 * r.getA());
            System.out.println("Solucion s1");
            System.out.println(s1);
            double s2 = (-r.getB() - (Math.sqrt(discriminante(r)))) / (2 * r.getA());
            System.out.println("Solucion s2");
            System.out.println(s2);
        }

    }

    public void obtenerRaiz(Raices r) {

        if (tieneRaiz(r)) {
            double s = (-r.getB() + (Math.sqrt(discriminante(r)))) / (2 * r.getA());
            System.out.println("Unica solucion");
            System.out.println(s);
        }

    }

    public void calcular(Raices r) {

        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("No tiene solucion");
        }
    }

    /*public double getDiscriminante(double a, double b, double c) {

        double discriminante = (((Math.pow(b, 2)) - 4) * a * c);

        return discriminante;
    }

    public boolean tieneRaices(Double discriminante) {
        Raices r = new Raices();

        return r.getDiscrimimnante() >= 0;

    }

    public boolean tieneRaiz(Double discriminante) {
        Raices rc = new Raices();

        return rc.getDiscrimimnante() < 0;

    }*/
}
