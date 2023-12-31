package lab15;
public class MVCPattern {
    public static void main(String[] args) {
    // Создаем объекты модели, представления и контроллера
    Employee model = new Employee();
    EmployeeView view = new EmployeeView();
    EmployeeController controller = new EmployeeController(model, view);
    // Устанавливаем данные сотрудника через контроллер
    controller.setEmployeeName("Сергей Иванов");
    controller.setEmployeeSalary(130000);
    // Обновляем представление, чтобы отобразить измененные данные
    controller.updateView();
    }
}
