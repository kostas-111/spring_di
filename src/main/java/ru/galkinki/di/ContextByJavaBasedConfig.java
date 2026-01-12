package ru.galkinki.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.galkinki.di.model.StartUI;

/*
ApplicationContext умеет анализировать сразу целые пакеты.
Чтобы Spring понимал, какие метаданные необходимы для создания объекта можно использовать специальные аннотации.
Для этого добавим в модели аннотацию: @Component

Как видим, теперь мы создаем контекст и всего лишь передаем ему адрес пакета,
где находятся классы, предназначенные для помещения в контекст.

Отличия BeanFactory и ApplicationContext.
Интерфейс BeanFactory — это самая базовая версия контейнеров IoC,
а интерфейс ApplicationContext - это один из потомков, который расширяет возможности BeanFactory .
BeanFactory загружает компоненты по запросу, а ApplicationContext загружает все компоненты при запуске .
Таким образом, BeanFactory легче по сравнению с ApplicationContext.
ApplicationContext обладает гораздо более широким функционалом, чем BeanFactory.
 */
public class ContextByJavaBasedConfig {
  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext("ru.galkinki.di.model");
    var ui = context.getBean(StartUI.class);
    ui.add("Petr Arsentev");
    ui.add("Ivan ivanov");
    ui.print();
  }
}
