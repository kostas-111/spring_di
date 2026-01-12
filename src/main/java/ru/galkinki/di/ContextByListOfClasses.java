package ru.galkinki.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.galkinki.di.model.StartUI;
import ru.galkinki.di.model.Store;

/*
BeanFactory содержит только методы получения бинов.
У BeanFactory есть расширенный интерфейс ApplicationContext.
Часть конфигурирования теперь выполняет сам ApplicationContext.
Однако, программисту все равно нужно загружать нужные классы в контекст явно.
 */
public class ContextByListOfClasses {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(Store.class, StartUI.class);
    context.refresh();
    StartUI ui = context.getBean(StartUI.class);
    ui.add("Galkin Konstantin");
    ui.add("Ivan ivanov");
    ui.print();
  }
}
