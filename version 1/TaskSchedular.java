import java.util.*;

class Task {
    int id;
    int priority;
    int executionTime;
    int arrivalOrder;

    Task(int id, int priority, int executionTime, int arrivalOrder) {
        this.id = id;
        this.priority = priority;
        this.executionTime = executionTime;
        this.arrivalOrder = arrivalOrder;
    }
}

class TaskSchedular {
    private PriorityQueue<Task> pq;
    private int counter = 0;

    public TaskSchedular() {
        pq = new PriorityQueue<>((a, b) -> {
            if (a.priority != b.priority)
                return b.priority - a.priority; // higher priority first
            if (a.executionTime != b.executionTime)
                return a.executionTime - b.executionTime; // shorter time first
            return a.arrivalOrder - b.arrivalOrder; // earlier task first

        });

    }


    public void addTask(int id, int priority, int executionTime) {
        pq.offer(new Task(id, priority, executionTime, counter++));
    }

    public Task getNextTask() {
        return pq.poll();
    }

    public List<Task> getAllTasks() {
        List<Task> result = new ArrayList<>();
        PriorityQueue<Task> temp = new PriorityQueue<>(pq);
        while (!temp.isEmpty()) {
            result.add(temp.poll());
        }
        return result;
    }


    public static void main(String[] args) {
        TaskSchedular scheduler = new TaskSchedular();
        scheduler.addTask(1, 3, 10);
        scheduler.addTask(2, 5, 5);
        scheduler.addTask(3, 5, 2);
        scheduler.addTask(4, 3, 1);
        Task task;
        while ((task = scheduler.getNextTask()) != null) {
            System.out.println(
                    "Task ID: " + task.id +
                            ", Priority: " + task.priority +
                            ", Time: " + task.executionTime
            );
        }
    }
}
