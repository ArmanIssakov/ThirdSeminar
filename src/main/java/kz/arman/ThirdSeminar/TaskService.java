package kz.arman.ThirdSeminar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/*
    Добавление задачи.
    Просмотр всех задач.
    Просмотр задач по статусу (например, "завершена", "в процессе", "не начата").
    Изменение статуса задачи.
    Удаление задачи.*/
@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task addTask(Task task) {
        task.setEndTime(LocalDateTime.now());
        return taskRepository.save(task);
    }

    public List<Task> showAllTasks() {
        return taskRepository.findAll();
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
