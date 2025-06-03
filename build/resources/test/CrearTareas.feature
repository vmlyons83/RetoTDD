Feature: Creación de tareas de uaurio
  Como usuario de la API de tareas,
  Quiero poder crear una nueva tarea con título, descripción y estado,
  Para que pueda registrar mis pendientes y organizarlos dentro de una aplicación web o móvil

  Scenario: Creación de una nueva tarea
  Given que el usuario necesita crear una nueva tarea
  When el usuario ingresa el titulo y la descripción de la tarea
  Then el sistema le permite almacenar la tarea

  Scenario: Guardar una nueva tarea
  Given que el usuario necesita guardar una nueva tarea
  When el usuario ingresa el titulo y deja la descripción en blanco
  Then el sistema no le permite almacenar la tarea

  Scenario: Guardar una nueva tarea
  Given que el usuario necesita guardar una nueva tarea
  When el usuario ingresa la descripción y deja el título en blanco
  Then el sistema no le permite almacenar la tarea

  Scenario: Tarea completada
  Given que el usuario necesita crear una nueva tarea
  When el usuario ingresa el titulo y la descripción de la tarea
  Then el sistema actualiza el estado de la tarea en completado
