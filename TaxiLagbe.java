public class TaxiLagbe {
    public String taxiNumber;
    public String area;
    public int Passenger;
    public int fare;
    public String [] names= new String[4];
    public void storeInfo(String taxiNumber,String area) {
        this.taxiNumber = taxiNumber;
        this.area = area;
    }
    public void printDetails() {
        System.out.println("Taxi number: "+taxiNumber);
        System.out.println("This taxi can cover "+ area + " area");
        System.out.println("Total Passengers: " + Passenger);
        System.out.println("Passenger Lists: ");
        if(Passenger>0) {
            for(int i=0;i<Passenger;i++) {
                System.out.print(names[i] + " ");
            }
            System.out.println();
        }
        System.out.println("Total collected fare: " + fare + " Taka");
    }
    public void addPassenger(String name, int fare) {
        if(Passenger<4) {
            names[Passenger] = name;
            Passenger++;
            this.fare += fare;
        System.out.println("Dear " + name + "! Welcome to TaxiLagbe");
        }
        else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
    public void addPassenger(String name, int fare, String name2, int fare2) {
        if(Passenger<4) {
        addPassenger(name, fare);
        }
        if(Passenger<4) {
            addPassenger(name2, fare2);
        }
        else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
}