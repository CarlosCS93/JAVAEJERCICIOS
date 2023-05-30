package Persistencia;

// me interesa que hereden de DAO
import Entidades.Producto;

public final class ProductoDAO extends DAO { // me interesa que nadie herede de esta clase

    public void guardarProducto(Producto p) throws Exception {

        try {
            if (p == null) {
                throw new Exception("Debe indicar un producto");
            }

            String sql = "INSERT INTO Producto codigo, nombre, precio, codigo_Fabricante " + "VALUES ( '" + p.getCodigo() + "' , '" + p.getNombre() + "' , '"
                    + p.getPrecio() + "' , '" + p.getCodigoFabricante() + "');";
            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

        public void modificarProducto (Producto p) throws Exception {
        try {
            if (p == null) {
                throw new Exception("Debe indicar que producto dessea modificar");
            }
            String sql = "UPDATE Producto SET "
                    + " nombre = '" + p.getNombre() + "' , precio = '" + p.getPrecio()+ "' , codigo_fabricante = " + p.getCodigoFabricante()
                    + " WHERE id = '" + p.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

}
