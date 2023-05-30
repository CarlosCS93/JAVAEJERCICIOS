/*
 * d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).

Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.*/

package Entidad;

import java.util.Date;


public class Cuota {

    private int numeroCuota;
    private int montoTotalCuota;
    private boolean cancelado;
    private Date fechaVencimiento;
    private Forma_Pago formaPago;
    
    
}
