public class Animal {

    public int age;
    public int weight;
    public boolean isEating;
    public boolean isRunning;

    public Animal(int age, int weight, boolean isEating, boolean isRunning) {
        this.age = age;
        this.weight = weight;
        this.isEating = isEating;
        this.isRunning = isRunning;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isEating() {
        return isEating;
    }

    public void setEating(boolean eating) {
        isEating = eating;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
