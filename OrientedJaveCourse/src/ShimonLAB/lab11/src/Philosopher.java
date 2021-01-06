import java.util.List;
import java.util.concurrent.locks.Lock;

public class Philosopher implements IPhilosopher {
    private int place;
    private List<Fork> forks;
    private int meals;
    public Lock lock;
    private RandomSleep randomSleep;
    private boolean isEating;
    private int count;

    public Philosopher(int place, List<Fork> forks, int meals, Lock lock) {
        this.place = place;
        this.forks = forks;
        this.meals = meals;
        this.lock = lock;
        this.isEating =false;
        this.count = 0;
        this.randomSleep = new RandomSleep(50);
    }

    @Override
    public boolean isEating() {
        return isEating;
    }

    @Override
    public int getPlace() {
        return this.place;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void run() {
        Fork leftFork = forks.get(place % forks.size());
        Fork rightFork = forks.get((place+1) % forks.size());
        while (count < meals){
            randomSleep.sleep(); // the Philosopher is thinking
            lock.lock();
            synchronized (leftFork){
                leftFork.setOwner(place);
                synchronized (rightFork){
                    rightFork.setOwner(place);
                    lock.unlock();
                    isEating = true;
                    count++;
                    randomSleep.sleep();
                    isEating = false;
                }
                leftFork.setOwner(0);
                rightFork.setOwner(0);
            }
        }
    }
}
