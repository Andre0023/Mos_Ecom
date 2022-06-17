Feature: Тест

  Background: Главная страница сайта
    Given Открыть сайт "https://mosecom.mos.ru"


  Scenario: заполнение формы 1
    When Прокрутка экрана вниз
    And Заполняем форму
    And Нажать кнпку Отправить
