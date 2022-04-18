Feature: Добавить случайный товар в корзину

  Background:
    Given Пользователь авторизован на сайте

  @hooks
    @close
  Scenario Outline:
    When Я навожу мышь на раздел Приключения
    And Я кликаю  на кнопку игры "Coromon"
    And Добавляю в корзину Игру "Coromon"
    Then Проверяем корректность суммы заказа
    Examples:
    | summ |
    | 549  |


