# Plataforma Monolítica Spring-Thymeleaf-MySQL para Gestión y Conexión Financiera

Esta plataforma monolítica ha sido concebida para facilitar la gestión y visualización de datos concernientes a individuos y sus balances financieros. Siguiendo una estructura arquitectónica unificada, todos los componentes y funcionalidades se encuentran integrados en un solo entorno. En este contexto, te encuentras en proceso de desarrollo de una aplicación web que permite realizar operaciones de Crear, Leer, Actualizar y Eliminar (CRUD) en registros vinculados a individuos.

La plataforma dispone de una interfaz web que otorga a los usuarios la habilidad de interactuar con información relacionada a individuos y sus respectivos saldos, a través de un navegador web. A continuación, se detallan las características clave de esta innovadora herramienta:

- Exploración de Individuos:
Al acceder a la página principal de la plataforma, los usuarios pueden acceder a un listado exhaustivo de todos los individuos registrados en el sistema. Este listado abarca datos tales como nombres y saldos de las personas. De igual forma, se calcula y muestra el total de los saldos acumulados de todos los individuos registrados, proporcionando así una panorámica global de la situación financiera en conjunto.

- Incorporación de Nuevos Individuos:
La plataforma permite a los usuarios la inclusión de nuevos individuos en el sistema. Al acceder a la página destinada a la incorporación de personas, los usuarios pueden ingresar información esencial, como nombres y saldos de los individuos. Una vez completados estos campos, los usuarios pueden almacenar los datos, generando así una nueva entrada en el listado de personas.

- Modificación de Datos Individuales:
Los usuarios cuentan con la posibilidad de ajustar la información de individuos existentes mediante el acceso a la página de edición. Al proporcionar el ID del individuo que desean modificar, los usuarios pueden actualizar datos como nombres y saldos. Estas modificaciones se reflejan tanto en la lista general de individuos como en el saldo global.

- Eliminación de Registros:
La plataforma brinda a los usuarios la facultad de eliminar individuos del sistema. Al acceder a la página destinada a la eliminación y suministrar el ID del individuo seleccionado, el individuo se excluye de la lista y su saldo ya no se considera en el cálculo del saldo global.

# Seguridad y Gestión de Acceso en la Plataforma:

En la plataforma, se ha implementado un sólido sistema de seguridad con el propósito de garantizar que los usuarios autorizados accedan únicamente a las áreas correspondientes. Este objetivo se alcanza mediante la autenticación y la autorización.

- Autenticación:
La autenticación consiste en el proceso mediante el cual los usuarios validan su identidad en la plataforma. Al ingresar sus credenciales, como el nombre de usuario y la contraseña, en un formulario de inicio de sesión, la plataforma verifica la autenticidad de estos datos. Si son correctos, los usuarios obtienen acceso a sus respectivas cuentas.

- Autorización:
La autorización regula las acciones y áreas de la plataforma a las cuales los usuarios pueden acceder tras haber completado el proceso de autenticación. Este sistema se basa en roles predefinidos. Algunos usuarios pueden poseer roles "ADMIN", otorgándoles la capacidad de realizar cambios sustanciales, mientras que otros usuarios podrían tener roles "USER", limitando su acceso a áreas específicas.

- Resguardo de Recursos:
Los recursos engloban las páginas y funciones a las cuales los usuarios pueden acceder en la plataforma. Se han establecido normas que determinan qué recursos pueden ser accedidos según el rol del usuario. Por ejemplo, solo aquellos con el rol "ADMIN" pueden llevar a cabo ediciones, agregados o eliminaciones de elementos específicos, mientras que otros pueden acceder a áreas más generales.

- Manejo de Errores:
En caso de que un usuario intente acceder a un recurso para el cual no tiene los permisos necesarios, la plataforma exhibirá un mensaje de error o redirigirá al usuario hacia una página designada para este propósito. Esto asegura que los usuarios únicamente accedan a las áreas correspondientes a sus roles.

- Protección de Contraseñas:
Las contraseñas de los usuarios son resguardadas de manera segura en la plataforma, empleando un método de cifrado avanzado. Esto garantiza que, incluso si alguien obtuviera acceso a la base de datos, no sería capaz de visualizar las contraseñas reales de los usuarios.
