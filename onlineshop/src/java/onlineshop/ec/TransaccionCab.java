
package onlineshop.ec;

import java.sql.Date;

public class TransaccionCab {
int transaccion_cab_id; // (PK)
int usuario_id; // (FK)
Date fecha;
int total;
String direccion_entrega;
int medio_pago; //0 Efectivo, 1 Tarjeta de Credito
int NroTarjeta; //solo si id_medio_pago == 1
String estado; //I Ingresado

    public TransaccionCab() {
    } 
}

