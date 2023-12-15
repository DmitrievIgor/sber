public class City {
    private int id;
    private String name;
    private String region;
    private String distinct;
    private int population;
    private String foundation;

    public City(int id, String name, String region, String distinct, int population) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.distinct = distinct;
        this.population = population;
    }

    public String toString() {
        return "City{name='" + this.name + "', region='" + this.region + "', distinct='" + this.distinct + "', population=" + this.population + ", foundation='" + this.foundation + "'}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistinct() {
        return this.distinct;
    }

    public void setDistinct(String distinct) {
        this.distinct = distinct;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFoundation() {
        return this.foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }
}
