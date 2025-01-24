# Microservicio de Simulador

## Descripción

Este microservicio se encarga de simular las condiciones de diferentes productos financieros, como préstamos, tarjetas de crédito e inversiones, para los clientes de Bancolombia. Permite a los clientes obtener una visión previa de las características del producto, como tasas de interés, plazos, cuotas mensuales, etc., antes de tomar una decisión.

## Arquitectura

El microservicio de Simulador sigue la arquitectura limpia de Bancolombia, con los siguientes componentes:

### Domain

* **Entidades:** Define las entidades del dominio, como `Simulacion`, `Cliente`, `Producto` y `ReglaNegocio`.
* **Reglas de negocio:** Implementa las reglas de negocio relacionadas con la simulación de productos financieros.

### Use Cases

* **Simular producto:**  Orquesta el flujo para simular un producto financiero, incluyendo la obtención de datos del cliente, la aplicación de reglas de negocio y el cálculo de las condiciones del producto.

### Infrastructure

* **Driven Adapters:**
    * **Repositorio de Simulaciones:**  Persiste las simulaciones en una base de datos.
    * **API Client para Perfil de Cliente:**  Obtiene la información del cliente desde el microservicio de Perfil de Cliente.
    * **API Client para Catálogo de Productos:** Obtiene la información de los productos desde el microservicio de Catálogo de Productos.
    * **API Client para Reglas de Negocio:** Consulta las reglas de negocio aplicables a la simulación.
* **Entry Points:**
    * **Controlador REST:**  Expone las APIs REST para que los clientes puedan solicitar simulaciones.

## Dependencias

* **Microservicio de Perfil de Cliente:**  Para obtener la información del cliente.
* **Microservicio de Catálogo de Productos:** Para obtener la información de los productos.
* **Microservicio de Reglas de Negocio:** Para aplicar las reglas de negocio.
* **Base de datos:** Para persistir las simulaciones.

##  Flujo de trabajo

1.  El cliente solicita una simulación a través del API REST.
2.  El controlador REST recibe la solicitud y la envía al Use Case "Simular producto".
3.  El Use Case obtiene la información del cliente desde el microservicio de Perfil de Cliente.
4.  El Use Case obtiene la información del producto desde el microservicio de Catálogo de Productos.
5.  El Use Case consulta al microservicio de Reglas de Negocio para aplicar las reglas de negocio.
6.  El Use Case calcula las condiciones del producto simulado.
7.  El Use Case guarda la simulación en la base de datos a través del Repositorio de Simulaciones.
8.  El Use Case devuelve la simulación al controlador REST.
9.  El controlador REST envía la respuesta al cliente.
