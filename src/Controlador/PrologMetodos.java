package Controlador;
import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author Isra
 */
public class PrologMetodos {

        static String m="";
        static String X="";
        //static String Y=""; 
        
    public String AbrirProlog(String archivo){
        String Msj;
        try{
            String open=  "consult('"+archivo+"')";
            Query BC =new Query(open);
            Msj="Consultando: "+(BC.hasSolution() ?"Correcto":"Incorrecto");
        }
            catch(Exception e)
            {
                Msj = "Ocurrio Un Error Al Abrir La Base De Conocimiento"+e;
            }
        return Msj;         
    }

    public String OpenProlog()
    {
        String msj=null;
       try 
       {
           String open="consult('diagEnfermedades.pl')";
           Query BC = new Query(open);
           msj="Consultando BC=enfermedades: "+(BC.hasSolution()? "correcto":"incorrecto");          
       } catch (Exception e){
           msj="Ocurrio problema en la conexion BC" +e;
       }
           return msj;
    }
    
    public String ConsultarEnfermedad(String fiebre,String dolorCb,String tos)
    {
            String Regla = "enfermoDe(X,"+fiebre+","+dolorCb+","+tos+")";
            System.out.println(""+Regla);
            Query Q1 = new Query (Regla);
            while( Q1.hasMoreSolutions() )
            {
            Map<String, Term> s4= Q1.nextSolution();
            X=String.valueOf(s4.get("X"));
            m=m+("esta enfermo de: "+X+"\n");   
            }
            return m;   
    }
    public String ConsultarDengue(String fiebre,String dolorCb,String tos, String manchasR)
    {
            String Regla = "enfermoDe(X,"+fiebre+","+dolorCb+","+tos+","+manchasR+")";
            System.out.println(""+Regla);
            Query Q1 = new Query (Regla);
            while( Q1.hasMoreSolutions() )
            {
            Map<String, Term> s4= Q1.nextSolution();
            X=String.valueOf(s4.get("X"));
            m=m+("esta enfermo de: "+X+"\n");   
            }
            return m;   
    }

    public String ConsultarSika(String fiebre,String dolorCb,String tos, String manchasR,String diarrea,String vomito)
    {
            String Regla = "enfermoDe(X,"+fiebre+","+dolorCb+","+tos+","+manchasR+","+diarrea+","+vomito+")";
            System.out.println(""+Regla);
            Query Q1 = new Query (Regla);
            while( Q1.hasMoreSolutions() )
            {
            Map<String, Term> s4= Q1.nextSolution();
            X=String.valueOf(s4.get("X"));
            m=m+("esta enfermo de: "+X+"\n");   
            }
            return m;   
    }
}
