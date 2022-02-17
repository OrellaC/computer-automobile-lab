package MorningLab;

//Create a Computer class that has 3 variables.
// The first variable will have a name.
// The second variable will be the year of the computer.
// Last the final variable will be the cost of the computer.
// All 3 variable will be private fields and must use getters to retrieve the data and setters to set the variables.

public class Computer {
    private String name;
    private int year;
    private int cost;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public int getYear() {
        this.year = year;
    }

    public void setYear(int year){
        return year;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }



    public static void main(String[] args) {
    }
    public void print(){
        System.out.println(name + year + cost);
    }
}