Feature: Validar juego 21
Scenario: verificar mazo
Given inicia juego
When llenar mazo
Then validar cartas
Scenario: verificar puntaje
Given juego iniciado
When calcula puntaje
Then verifica ganador


