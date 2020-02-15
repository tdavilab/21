Feature: Validar juego 21

Scenario: verificar mazo
Given inicia juego
When llenar mazo
Then validar que el numero de cartas en el mazo sea 52

Scenario: verificar cartas repartidas
Given juego iniciado
When repartir cartas
Then verificar que el total de cartas repartidas sea 4

Scenario: verificar puntaje
Given mostrar cartas
When calcula puntaje
Then verifica ganador


