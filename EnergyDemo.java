abstract class EnergySource {
    String sourceId;
    String sourceName;
    double energyGenerated; 

    public EnergySource(String sourceId, String sourceName, double energyGenerated) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }

    public abstract double calculateEfficiency();

    public void displayDetails() {
        System.out.println("Details-");
        System.out.println("Source ID        : " + sourceId);
        System.out.println("Source Name      : " + sourceName);
        System.out.println("Energy Generated : " + energyGenerated + " kWh");
    }
}

class SolarEnergy extends EnergySource {
    public SolarEnergy(String sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }

    @Override
    public double calculateEfficiency() {
        return (energyGenerated / 5000.0) * 100.0;
    }
}

class WindEnergy extends EnergySource {
    public WindEnergy(String sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }

    @Override
    public double calculateEfficiency() {
        return (energyGenerated / 8000.0) * 100.0;
    }
}

public class EnergyDemo {
    public static void main(String[] args) {
        EnergySource s1 = new SolarEnergy("SOL-101", "Sahara Solar Farm", 4200.0);
        System.out.println("=== Solar Energy Source Details ===");
        s1.displayDetails();
        System.out.printf("Efficiency       : %.2f%%\n\n", s1.calculateEfficiency());

        
        EnergySource s2 = new WindEnergy("WND-202", "North Sea Wind Park", 6400.0);
        System.out.println("=== Wind Energy Source Details ===");
        s2.displayDetails();
        System.out.printf("Efficiency       : %.2f%%\n", s2.calculateEfficiency());
    }
}