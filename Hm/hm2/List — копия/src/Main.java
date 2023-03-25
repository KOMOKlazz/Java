public class Main {
    public static void main(String[] args) {
        public class Main {
            public static void main(String[] args) {
                TaskManager taskManager = new TaskManager();

                // Import tasks from CSV file
                TaskImporter csvTaskImporter = new CsvTaskImporter("tasks.csv");
                List<Task> importedTasks = csvTaskImporter.importTasks();
                taskManager.addTasks(importedTasks);

                // Export tasks to JSON file
                TaskExporter jsonTaskExporter = new JsonTaskExporter("tasks.json");
                jsonTaskExporter.exportTasks(taskManager.getTasks());

                // Add new task
                Task newTask = new Task();
                newTask.setPriority(Priority.HIGH);
                newTask.setCreatedDate(LocalDate.now());
                newTask.setCreatedTime(LocalTime.now());
                newTask.setDeadline(LocalDateTime.of(2023, 4, 1, 12, 0));
                newTask.setAuthorName("John Doe");
                taskManager.addTask(newTask);

                // Print tasks
                List<Task> tasks = taskManager.getTasks();
                for (Task task : tasks) {
                    System.out.println(task);
                }
            }
        }

    }
}
