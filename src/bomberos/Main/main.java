
package bomberos.Main;

import bomberos.AccesoADatos.BrigadaData;
import bomberos.AccesoADatos.CuartelData;
import bomberos.AccesoADatos.SiniestroData;
import bomberos.AccesoAdatos.BomberoData;
import bomberos.Entidades.Bombero;
import bomberos.Entidades.Brigada;
import bomberos.Entidades.Siniestro;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        //Bombero nuevo
   /*Bombero bom =new Bombero(123123123, "marco polo", "A +", LocalDate.of(1980, 11, 22)," +01112121", 10, true);
   BomberoData bomDB =new BomberoData();
   bomDB.nuevoBombero(bom);
    */    
     //Bombero modificar
     /*
     Bombero bom =new Bombero(19,123123123, "maria polo", "A +", LocalDate.of(1980, 11, 22)," +01112121", 10, true);
     BomberoData bomDB =new BomberoData();
     bomDB.modificarBombero(bom);
     */
     //Eliminar bombero de forma logica
     /*
     Bombero bom =new Bombero(19,123123123, "maria polo", "A +", LocalDate.of(1980, 11, 22)," +01112121", 10, true);
     BomberoData bomDB= new BomberoData();
     bomDB.eliminarBombero(123123123);
    */
    //crear brigada nueva 
    /*
    Brigada bri =new Brigada("Cobra", "derrames industriales", true, 1);
    BrigadaData briDB =new BrigadaData();
    briDB.nuevaBrigada(bri);
    */
    // Modifica una brigada  su especialidad
    /*
    Brigada bri = new Brigada("Cobra", "derrames industriales", true, 1);
    BrigadaData briDB =new BrigadaData();
    briDB.cambiarEspecialidadBrigada("derrames quimicos", 11);
    */
    // obtener brigadas listas 
    /*
    Brigada bri = new Brigada();
    BrigadaData briDB = new BrigadaData ();
    
     List <Brigada>briga=briDB.obtenerBrigadas();
    if(briga.isEmpty()){
        System.out.println("no se encontraron brigadas activos ");
    
    }else{
        for(Brigada briGada:briga){
            System.out.println("NOMBRE"+briGada.getNombre_br());
            System.out.println("ESPECIALIDAD"+briGada.getEspecialidad());
            System.out.println("ESTADO"+briGada.isLibre());
            System.out.println("CODIGO BRIGADA"+" "+briGada.getCodBrigada());
            System.out.println("CODIGO DE CUARTEL"+ " "+briGada.getCodCuartel());
            System.out.println("-----------------");
        }

    
    }*/
    // ocupar brigada  
    
    BrigadaData briDB = new BrigadaData();
    briDB.ocuparBrigada(true, 9);
    
    
    // Disponibilidad de brigada 
    /*
    BrigadaData briDB = new BrigadaData();
    briDB.disponibilidadBrigada(11);
   */
    // Cambiar especialidad 
    /*
    BrigadaData briDB =new BrigadaData();
    briDB.cambiarEspecialidadBrigada("explosivos ", 10);
    */
    // obtener especialidad de brigada 
    /*
    BrigadaData briDB = new BrigadaData();
        System.out.println(briDB.obtenerEspecialidadBrigada(10));
    
    //Asignar bomberos a una lista 
     //BomberoData bomDB =new BomberoData();
    //bomDB.asignarBrigada(5, 11)
}*/
    

        Siniestro siniestro1 = new Siniestro();
            SiniestroData siniestroData = new SiniestroData();
    List<Siniestro> siniestros = siniestroData.listarSiniestros();

    if (siniestros.isEmpty()) {
        System.out.println("La lista de siniestros está vacía.");
    } else {
        System.out.println("Siniestros encontrados:");
        for (Siniestro siniestro : siniestros) {
            System.out.println("Código: " + siniestro.getCodigo());
            System.out.println("Tipo: " + siniestro.getTipo());
            System.out.println("Fecha de siniestro: " + siniestro.getFecha_siniestro());
            System.out.println("Coordenada X: " + siniestro.getCoord_X());
            System.out.println("Coordenada Y: " + siniestro.getCoord_Y());
            System.out.println("Detalles: " + siniestro.getDetalles());
            System.out.println("Fecha de resolución: " + siniestro.getFecha_resol());
            System.out.println("Puntuación: " + siniestro.getPuntuacion());
            System.out.println("Código de brigada: " + siniestro.getCodBrigada());
        }
    }
    }
}