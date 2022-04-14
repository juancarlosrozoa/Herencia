public class App {
    public static void main(String[] args) throws Exception {
       
        //Crea ahora un objeto de la clase Cliente
        //que debe tener como propiedades la edad, el telefono, el nombre y el credito, 
         //tienes que darles valor y mostrarlas por pantalla.
        Cliente cliente =new Cliente();
        
        cliente.setNombre("Juan");
        System.out.println(cliente.getNombre());
        
        cliente.setEdad(22);
        System.out.println(cliente.getEdad());

        cliente.setTelefono(1234567890);
        System.out.println(cliente.getTelefono());
        
        cliente.setCredito(1000);
        System.out.println(cliente.getCredito());
    

    // Clase trabajador
        Trabajador trabajador =new Trabajador();

        trabajador.setNombre("Carlos");
        System.out.println(trabajador.getNombre());

        trabajador.setEdad(20);
        System.out.println(trabajador.getEdad());

        trabajador.setTelefono(987654321);
        System.out.println(trabajador.getTelefono());

        trabajador.setSalario(2000);
        System.out.println(trabajador.getSalario());
             
        }
}

 //Crea una clase Persona con las siguientes variables:
            //La edad
            //El nombre
            // El teléfono
class Persona {
    int edad;
    String nombre;
    int telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
//crea una nueva clase Cliente que herede de Persona
//esta nueva clase tendrá la variable credito solo para esa clase
class Cliente extends Persona {
    
    private int credito;

    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
    
   
}

//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, 
// y con una variable salario que solo tenga la clase Trabajador.
    
class Trabajador extends Persona {
    
    private int salario;

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
   
}