package Controlador;
import javax.swing.JOptionPane;

public class IngresoParametros extends PrologMetodos{
  //  PrologMetodos pm=new PrologMetodos();
    String temperatura="",dolorcabeza="",tos="",manchasrojas="",diarrea="",vomito="";
    String mensaje="Sintomas elejidos: "+"\n",enfermedad="";
 
    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getDolorcabeza() {
        return dolorcabeza;
    }

    public void setDolorcabeza(String dolorcabeza) {
        this.dolorcabeza = dolorcabeza;
    }

    public String getTos() {
        return tos;
    }

    public void setTos(String tos) {
        this.tos = tos;
    }

    public String getManchasrojas() {
        return manchasrojas;
    }

    public void setManchasrojas(String manchasrojas) {
        this.manchasrojas = manchasrojas;
    }

    public String getDiarrea() {
        return diarrea;
    }

    public void setDiarrea(String diarrea) {
        this.diarrea = diarrea;
    }

    public String getVomito() {
        return vomito;
    }

    public void setVomito(String vomito) {
        this.vomito = vomito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    
    
////////////////////////////////////Mensaje de sintomas del paciente ////////////////////////////////////////    
    public String SintomasGripeoPaludismo(String fiebre){
        temperatura=fiebre;           
        mensaje=mensaje+"fiebre de: "+temperatura;
        mensaje=mensaje+", tos";
        mensaje=mensaje+", dolor de cabeza";
       return mensaje; 
    }

    public String SintomasDengue(String fiebre){
        temperatura=fiebre;           
        mensaje=mensaje+"fiebre de: "+temperatura;
        mensaje=mensaje+", tos";
        mensaje=mensaje+", dolor de cabeza";
        mensaje=mensaje+", manchas rojas";
       return mensaje; 
    }
    public String SintomasSika(String fiebre){
        temperatura=fiebre;           
        mensaje=mensaje+"fiebre de: "+temperatura;
        mensaje=mensaje+", tos";
        mensaje=mensaje+", dolor de cabeza";
        mensaje=mensaje+", manchas rojas";
        mensaje=mensaje+", diarrea";
        mensaje=mensaje+", vomito";
       return mensaje; 
    }
    
////////////////////////////////Diagnostico de enfermedades//////////////////////////////////////////////////
    
//diagnostico de gripe y paludismo
    public String Diagnostico1y2(String fiebre){
     try{
            temperatura=fiebre;
            dolorcabeza="dolorCb";
            tos="tos";       
            enfermedad=ConsultarEnfermedad(temperatura,dolorcabeza,tos);        
     }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Ejecute la coneccion para obtener el resultado");
         
     }
     return enfermedad;
    }
    
//dianostico de dengue    
    public String Diagnostico3(String fiebre){
     try{
            temperatura=fiebre;
            dolorcabeza="dolorCb";
            tos="tos";
            manchasrojas="manchasrojas";
            enfermedad=(ConsultarDengue(temperatura,dolorcabeza,tos,manchasrojas));  
     }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Ejecute la coneccion para obtener el resultado");
         
     }
    return enfermedad;
    }
//dianostico de sika    
    public String Diagnostico4(String fiebre){
        
     try{
        int f;
            temperatura=fiebre;
            dolorcabeza="dolorCb";
            tos="tos";
            manchasrojas="manchasrojas";
            diarrea="diarrea";
            vomito="vomito";
            enfermedad=(ConsultarSika(temperatura,dolorcabeza,tos,manchasrojas,diarrea,vomito));  
     }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Ejecute la coneccion para obtener el resultado");
         
     }
     return enfermedad;
    }
 
}

