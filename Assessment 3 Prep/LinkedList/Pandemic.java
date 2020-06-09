public class Pandemic {
    
    private String country;
    private int population;
    private int infected; 
    private int discharged;
    private int death;
   
    public Pandemic(String c, int p, int i, int discharged, int death) {
        
        country = c;
        population = p;
        infected = i;
        this.discharged = discharged;
        this.death = death;
    }
    
    public String getCountry() {
        
        return country;
    }
    
    public int getPopulation() {
        
        return population;
    }
    
    public String toString() {
    
        return "Country: " + country + ", Population: " + population + ", Infected: " + infected + ", Discharged: " + discharged + ", Death: " + death;
    }
    
    public int percentageInfected() {
        
        int percentage;
        
        percentage = (infected/population) * 100;
        
        return percentage;
    }
}