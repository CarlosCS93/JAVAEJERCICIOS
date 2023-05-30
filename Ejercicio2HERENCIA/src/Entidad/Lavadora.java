/*
 * 
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
package Entidad;


public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, char cEnergia, String gamaColor, int peso) {
        super(precio, cEnergia, gamaColor, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {

        super.crearElectrodomestico();
        System.out.println("Ingrese el tamaño de la carga");
        this.carga = super.getScan().nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (this.carga > 30) {
            super.setPrecio(super.getPrecio()+500);
        }
        
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    
   

    
    
    
    

}
