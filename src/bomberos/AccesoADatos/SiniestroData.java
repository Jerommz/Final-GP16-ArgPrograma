package bomberos.AccesoADatos;

import bomberos.AccesoAdatos.Conexion;
import bomberos.Entidades.Cuartel;
import bomberos.Entidades.Siniestro;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SiniestroData {

    private Connection con;
    private CuartelData cuartelDB;
    private Cuartel cuartel;
    private Siniestro siniestro;

    public SiniestroData() {
        con = Conexion.getConnection();
    }

    public void cargarSiniestro(Siniestro siniestro) {
        String sql = "INSERT INTO siniestro(tipo, fecha_siniestro, coord_X, coord_Y, detalles, fecha_resol, puntuacion, codBrigada) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFecha_siniestro()));
            ps.setInt(3, siniestro.getCoord_X());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setDate(6, Date.valueOf(siniestro.getFecha_resol()));
            ps.setInt(7, siniestro.getPuntuacion());
            ps.setInt(8, siniestro.getCodBrigada());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Siniestro registrado con Código N°: " + siniestro.getCodigo());
            } else {
                JOptionPane.showMessageDialog(null, "Siniestro no registrado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public List<Siniestro> consultarSiniestros48hs(Siniestro sinie) {
        con = Conexion.getConnection();
        List<Siniestro> accidentes = new ArrayList<>();
        String sql = "SELECT * FROM siniestro WHERE fecha_siniestro >= (CURDATE() - INTERVAL 1 DAY) OR fecha_resol >= (CURDATE() - INTERVAL 1 DAY)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Siniestro siniestro = new Siniestro();

                siniestro.setCodigo(rs.getInt("codigo"));
                siniestro.setTipo(rs.getString("tipo"));
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setDetalles(rs.getString("detalles"));
                siniestro.setCoord_X(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));

                siniestro.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                siniestro.setCodBrigada(rs.getInt("codBrigada"));
                accidentes.add(siniestro);
            }

            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos siniestro 48 hs ");
        }
        return accidentes;
    }

    public List<Siniestro> listarSiniestros() {
        List<Siniestro> accidentes = new ArrayList<>();
        String sql = "SELECT codigo, tipo, fecha_siniestro, coord_X, coord_Y, detalles, fecha_resol, puntuacion, codBrigada FROM siniestro";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                siniestro = new Siniestro();
                siniestro.setCodigo(rs.getInt("codigo"));
                siniestro.setTipo(rs.getString("tipo"));
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setDetalles(rs.getString("detalles"));
                siniestro.setCoord_X(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));

                siniestro.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                siniestro.setCodBrigada(rs.getInt("codBrigada"));
                accidentes.add(siniestro);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return accidentes;
    }

    public void anotarTerminacionDeSiniestro(int codigo, LocalDate fecha_resol, int puntuacion) {
        String sql = "UPDATE siniestro SET fecha_resol = ?, puntuacion = ? WHERE codigo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha_resol));
            ps.setInt(2, puntuacion);
            ps.setInt(3, codigo);
            int afectadasFilas = ps.executeUpdate();
            if (afectadasFilas > 0) {
                JOptionPane.showMessageDialog(null, "Siniestro finalizado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

//    public String cuartelMasCercano() {
//        String cuartelMasCercano = null;
//        String sql = "SELECT siniestro.codigo AS siniestro_codigo, MIN(SQRT(POW(cuartel.coord_X - siniestro.coord_X, 2) + POW(cuartel.coord_Y - siniestro.coord_Y, 2))) AS distancia_minima, cuartel.codCuartel AS cuartel_Mas_Cercano FROM cuartel CROSS JOIN siniestro GROUP BY siniestro.codigo, cuartel.codCuartel ORDER BY distancia_minima LIMIT 0,25";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                double distancia_minima = rs.getDouble("distancia_minima");
//                cuartelMasCercano = rs.getString("cuartel_Mas_Cercano");
//                JOptionPane.showMessageDialog(null, "El cuartel más cercano se encuentra a una distancia de: " + distancia_minima);
//                JOptionPane.showMessageDialog(null, "El codigo del cuartel mas cercano es: " + cuartelMasCercano);
//            } else {
//                JOptionPane.showMessageDialog(null, "No se encontro la ubicacion.");
//            }
//            ps.close();
//            rs.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
//        }
//        return cuartelMasCercano;
//    }
    public void modificarSiniestro(Siniestro siniestro) {
        String sql = "UPDATE siniestro SET tipo = ?, fecha_siniestro = ?, coord_X = ?, coord_Y = ?, detalles = ?, fecha_resol = ?, puntuacion = ?, codBrigada = ? WHERE codigo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, siniestro.getTipo());
            ps.setTimestamp(2, Timestamp.valueOf(siniestro.getFecha_siniestro().atStartOfDay()));
            ps.setInt(3, siniestro.getCoord_X());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setTimestamp(6, Timestamp.valueOf(siniestro.getFecha_resol().atStartOfDay()));
            ps.setInt(7, siniestro.getPuntuacion());
            ps.setInt(8, siniestro.getCodBrigada());
            ps.setInt(9, siniestro.getCodigo());
            int exito = ps.executeUpdate();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Siniestro modificado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el siniestro.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

}
