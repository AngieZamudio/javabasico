package ejercicios;

public class Ejercicios4 {
    public static void main(String[] args){
        SmartDevice smartDevice = new SmartDevice();
        smartDevice.mostrarSpecs();
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.mostrarSpecs();
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.mostrarSpecs();
    }

}

 class SmartDevice {
    String software;
    String hardware;
    float ram;
    int memoryCapacity;

    public SmartDevice(){
        this.software = null;
        this.hardware = null;
        this.ram = 0;
        this.memoryCapacity = 0; //
    }

    public void mostrarSpecs(){
        System.out.println("");
        System.out.println("Software: " + software);
        System.out.println("Hardware: " + hardware);
        System.out.println("Ram: " + ram);
        System.out.println("Memory capacity: " + memoryCapacity);
    }
}

 class SmartPhone extends SmartDevice {
    String phoneProvider;

    public SmartPhone(){
        this.phoneProvider = "No definido";
    }

    @Override
    public void mostrarSpecs() {
        super.mostrarSpecs();
        System.out.println("Screen size: " + phoneProvider);
    }
}

 class SmartWatch extends SmartDevice {
    String healthData;

     public SmartWatch(){
         this.healthData = "No definido";
     }

    @Override
    public void mostrarSpecs() {
        super.mostrarSpecs();
        System.out.println("Screen size: " + healthData);
    }
}
