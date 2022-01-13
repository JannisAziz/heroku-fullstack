package de.jannisaziz.backend;

import de.jannisaziz.backend.controller.CustomListController;
import de.jannisaziz.backend.database.CustomListDatabase;
import de.jannisaziz.backend.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = CustomListDatabase.class)
public class BackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Autowired
    CustomListController<TodoItem> todoListController;

    @Autowired
    CustomListController<ShoppingItem> shoppingListController;

    public void run(String... args) throws Exception {

        /*
        CustomList<TodoItem> testTodoList = new CustomList<TodoItem>("Todo_List", Arrays.asList(new TodoItem("do 1", "do something", false), new TodoItem("do 2", "do something", false)));
        CustomList<ShoppingItem> testShoppingList = new CustomList<ShoppingItem>("Netto List", Arrays.asList(new ShoppingItem("Banana", 2), new ShoppingItem("Apple", 6)));

        todoListController.addList(testTodoList);
        shoppingListController.addList(testShoppingList);

        System.out.println(todoListController.getAllLists());
        System.out.println(shoppingListController.getAllLists());
        */
    }
}
