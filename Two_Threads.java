// Выполнила: Журавлева Арина Дмитриевна ПИ21-2в
// Задача 1 (19.11)
// Напишите программу, в которой создаются два потока, которые выводят на консоль своё имя по очереди.
class StepThread extends Thread {
// Общий для двух потоков lock.
    private Object lock;

    public StepThread(Object object) {
        this.lock = object;
    }

// Выводится имя потока, потом поток засыпает, перед этим уведомив другой поток, о том, что теперь его очередь. 
// После вызова первым потоком lock.notify() второй поток не просыпается сразу, а ждёт, пока lock не будет освобождён. 
// Когда это происходит, уже вызван метод lock.wait(), и первый поток ждёт своей очереди. И так по кругу.

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    System.out.println(getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Two_Threads {
    public static void main(String[] strings) {
        Object lock = new Object();
        new StepThread(lock).start();
        new StepThread(lock).start();
    }
}