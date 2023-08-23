# UniviersidadSpring
Aplicacion Monolitica Spring-Thymeleaf-MySQL

Descripción de la Aplicación Monolítica:

La aplicación monolítica está diseñada para gestionar y mostrar información sobre personas y sus saldos. Se basa en un patrón arquitectónico monolítico, lo que significa que todos los componentes y funcionalidades están integrados en una sola aplicación. En tu caso, parece que estás desarrollando una aplicación web que permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los registros de personas.

La aplicación cuenta con una interfaz web que permite a los usuarios interactuar con los datos de personas y saldos a través de un navegador web. A continuación, se detallan las características clave de tu aplicación:

Listado de Personas:
Al acceder a la página principal de la aplicación, los usuarios pueden ver una lista de todas las personas registradas en el sistema. La lista incluye detalles como el nombre de la persona y su saldo. También se calcula y muestra el saldo total de todas las personas registradas, lo que brinda una vista general de la situación financiera general.

Agregar Nueva Persona:
La aplicación permite a los usuarios agregar nuevas personas al sistema. Al acceder a la página de agregar persona, los usuarios pueden ingresar los detalles de la nueva persona, incluido su nombre y saldo. Una vez completados los campos, los usuarios pueden guardar la información, lo que agrega una nueva entrada a la lista de personas.

Editar Persona:
Los usuarios pueden editar los detalles de una persona existente accediendo a la página de edición. Al proporcionar el ID de la persona que desean editar, los usuarios pueden actualizar su nombre y saldo. Los cambios se reflejan en la lista de personas y en el saldo total.

Eliminar Persona:
La aplicación permite a los usuarios eliminar personas del sistema. Al acceder a la página de eliminación y proporcionar el ID de la persona que se va a eliminar, la persona se elimina de la lista y su saldo se excluye del saldo total.

Seguridad y Control de Acceso en la Aplicación:

En la aplicación, se ha implementado un sistema de seguridad para garantizar que los usuarios adecuados tengan acceso a las partes correctas de la aplicación. Esto se logra a través de la autenticación y la autorización.

Autenticación:

La autenticación es el proceso mediante el cual los usuarios se identifican en la aplicación. Los usuarios deben ingresar sus credenciales (nombre de usuario y contraseña) en un formulario de inicio de sesión. La aplicación verifica estas credenciales y, si son correctas, permite que los usuarios accedan a sus cuentas.

Autorización:

La autorización es el sistema que controla qué acciones y partes de la aplicación pueden realizar los usuarios después de autenticarse. Esto se basa en roles predefinidos. Por ejemplo, algunos usuarios pueden tener roles "ADMIN" que les permiten realizar cambios importantes, mientras que otros pueden tener roles "USER" que solo les permiten acceder a ciertas áreas.

Protección de Recursos:

Los recursos son las páginas o funciones de la aplicación a las que los usuarios pueden acceder. Se han establecido reglas para cada recurso en función de los roles de los usuarios. Por ejemplo, solo los usuarios con el rol "ADMIN" pueden editar, agregar o eliminar ciertos elementos, mientras que otros pueden acceder a áreas generales.

Manejo de Errores:

Si un usuario intenta acceder a un recurso para el que no tiene permiso, la aplicación mostrará un mensaje de error o lo redirigirá a una página de error. Esto garantiza que los usuarios solo accedan a las partes que les corresponden según sus roles.

Protección de Contraseñas:

Las contraseñas de los usuarios se almacenan de manera segura en la aplicación utilizando un método de cifrado avanzado. Esto asegura que incluso si alguien accede a la base de datos, no podrá ver las contraseñas reales de los usuarios.

