

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("David");
        persona.setEdad(25);
        persona.setTelefono(3024325);
        
       

        //Cliente
        Cliente cliente = new Cliente();
        cliente.setCredito(3500);
        cliente.setEdad(45);
        cliente.setNombre("Kyle");
        cliente.setTelefono(777999);
        System.out.println("NOMBRE CLIENTE: "+cliente.getNombre()+"\nTelefono: "+cliente.getTelefono()+
            "\nEdad: "+cliente.getEdad()+"\nCredito: "+cliente.getCredito());

    
            
        //Trabajador 
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(32);
        trabajador.setNombre("Pablo");
        trabajador.setTelefono(865362);
        trabajador.setSalario(2500);
        System.out.println("NOMBRE TRABAJADOR: "+trabajador.getNombre()+ "\nTelefono: "+trabajador.getTelefono()+"\nEdad: "+trabajador.getEdad()+
             "\nSalario: "+trabajador.getSalario());   
    }

}


 class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad; 
    }

    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(int telefono){
        this.telefono =telefono; 
    }

    public int getTelefono(){
        return this.telefono;
    }
}

 class Cliente extends Persona{
    private int credito;
    

    public int getCredito(){
        return this.credito;
    }

    public void setCredito(int credito){
    this.credito = credito;

    }
}

 class Trabajador extends Persona{
    
    private int salario;


 public int getSalario(){
    return this.salario;

    }

public void setSalario(int salario){
    this.salario = salario;

   }
}


