class Encapsulation{
    public static void main(String args[]) {
        CarDetails CD = new CarDetails();
        System.out.println("Setting values: Please wait.");
        CD.setEngineName("127-kilowatt electric motor (BMW i3)");
        CD.setOilLevel(100);
        System.out.println("Getting Values:");
        System.out.println("Engine Name: "+CD.getEngineName());
        System.out.println("Oil Level: "+CD.getOilLevel());
    }
}