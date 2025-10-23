# (Pixel_And_Logic)
## Integrantes del equipo

- González Morales Bernardo Jesé 
- Hernández Delgado katya
- Ortiz Chavez Renata Lizbeth
- Pilgram Montes de Oca Jacqueline
- Brittany Itzel Sánchez Mora

___

## Descripcion

El sistema Coffee Track es una aplicación diseñada para la gestión interna de una cafetería móvil. Su propósito principal es optimizar el control de pedidos, productos y roles del personal, garantizando un funcionamiento eficiente y ordenado dentro del negocio. Este sistema está destinado únicamente al uso de los empleados; los clientes no tienen acceso directo. Las órdenes se registran de manera interna por medio del mesero, quien las recibe verbalmente y las ingresa al sistema.

El sistema cuenta con tres tipos de usuarios: administrador, mesero y cocinero. El administrador tiene el control total de la aplicación. Es responsable de registrar y gestionar las cuentas de los empleados, así como de administrar el menú mediante la creación, modificación o eliminación de productos y categorías. Además, puede consultar reportes y el historial de pedidos, pero no tiene permitido tomar órdenes directamente.

El mesero es el encargado de registrar los pedidos de los clientes. Puede crear, modificar, consultar y cancelar órdenes, además de verificar su estado durante el proceso. Por su parte, el cocinero visualiza los pedidos ingresados por los meseros y actualiza su estado, pasando de “nuevo” a “en preparación” y finalmente a “listo para servir”.

El sistema permite la gestión de productos y categorías del menú, los cuales incluyen información como nombre, descripción, precio, categoría y disponibilidad. Los pedidos se registran con un número de orden, fecha, mesero asignado, lista de productos, cantidades y precio total calculado automáticamente. Cada pedido atraviesa diferentes estados operativos: “nuevo”, “en preparación”, “listo para servir” y “servido”. Además, el sistema conserva un historial completo de pedidos realizados y cancelados.

En cuanto a la seguridad, Coffee Track incluye un sistema de autenticación con límite de tres intentos de inicio de sesión, tras los cuales la cuenta se bloquea temporalmente por quince minutos. Los usuarios pueden recuperar su contraseña mediante un token enviado a su correo electrónico, el cual expira en quince minutos. También pueden editar su perfil personal, aunque no tienen permiso para modificar su rol dentro del sistema. Las contraseñas deben cumplir con ciertos requisitos de complejidad, incluyendo el uso de caracteres especiales y mayúsculas.

El diseño del sistema no cuenta con una guía de estilo definida, por lo que el equipo de desarrollo tiene libertad creativa para proponerlo, utilizando Figma para el diseño de las interfaces. El uso de imágenes para ilustrar los productos del menú es opcional.

En conjunto, Coffee Track representa una herramienta completa y segura para la administración interna de una cafetería móvil, facilitando la organización de tareas entre el personal, mejorando la atención al cliente y garantizando un control efectivo de las operaciones diarias.

___