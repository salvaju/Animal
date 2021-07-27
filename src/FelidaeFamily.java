public class FelidaeFamily extends Animal{

    public String meowSound;

    public FelidaeFamily(int age, int weight, boolean isEating, boolean isRunning, String meowSound) {
        super(age, weight, isEating, isRunning);
        this.meowSound = meowSound;
    }

    public String getMeowSound() {
        return meowSound;
    }

    public void setMeowSound(String meowSound) {
        this.meowSound = meowSound;
    }
}
