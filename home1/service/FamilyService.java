package home1.service;

import home1.model.FamilyTree;
import home1.model.Human;
import home1.model.IO;
import home1.ui.View;

import java.util.Comparator;

public class FamilyService {
    private FamilyTree<Human> familyConnect;
    private IO serialize;

    public FamilyService(FamilyTree<Human> familyConnect, IO serialize) {
        this.familyConnect = familyConnect;
        this.serialize = serialize;
    }

    public void setView(View view) {
        view.setPresenter(this::handleUserInput);
    }

    private void handleUserInput(int choice) {
        switch (choice) {
            case 1:
                addHumanNew();
                break;
            case 2:
                familyPrint();
                break;
            case 3:
                humanSearch();
                break;
            case 4:
                saveFamily();
                break;
            case 5:
                loadFamily();
                break;
            case 6:
                sortFamilyName();
                break;
            case 7:
                sortFamilyAge();
                break;
            case 8:
                end();
                break;
            default:
                // Обработка некорректного ввода
        }
    }

    private void addHumanNew() {
        // Логика добавления человека
    }

    private void familyPrint() {
        // Логика вывода семейного древа
    }

    private void humanSearch() {
        // Логика поиска человека
    }

    private void saveFamily() {
        // логика сохранения семьи
        familyConnect.saveObj(serialize);
    }

    private void loadFamily() {
        // Логика загрузки семьи
        serialize.load("TreeFamily.data");
    }

    private void sortFamilyName() {
        // Логика сортировки по имени
        familyConnect.sort(Comparator.comparing(Human::getName));
    }

    private void sortFamilyAge() {
        // логика сортировки по возрасту
        familyConnect.sort(Comparator.comparingInt(Human::getAge));
    }

    private void end() {
        // Дополнительные действия при завершении программы
    }
}