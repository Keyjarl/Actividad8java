import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Captura de datos del primer perro
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del primer perro:");
        String raza1 = JOptionPane.showInputDialog("Ingrese la raza del primer perro:");
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del primer perro:"));
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del primer perro:"));

        // Instancia del primer perro
        Perro perro1 = new Perro();
        perro1.setNombre(nombre1);
        perro1.setRaza(raza1);
        perro1.setEdad(edad1);
        perro1.setPeso(peso1);

        // Captura de datos del segundo perro
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo perro:");
        String raza2 = JOptionPane.showInputDialog("Ingrese la raza del segundo perro:");
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del segundo perro:"));
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del segundo perro:"));

        // Instancia del segundo perro
        Perro perro2 = new Perro();
        perro2.setNombre(nombre2);
        perro2.setRaza(raza2);
        perro2.setEdad(edad2);
        perro2.setPeso(peso2);

        // Invocación de los métodos
        perro1.comer("croquetas", 100);
        System.out.println(perro1.getNombre() + " dice: " + perro1.ladrar());

        perro2.comer("carne", 200);
        System.out.println(perro2.getNombre() + " dice: " + perro2.ladrar());
    }
}
