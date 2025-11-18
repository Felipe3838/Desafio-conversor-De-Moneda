<h1 align="center">🪙 Conversor de Monedas – Challenge Alura Latam & Oracle ONE</h1> <p align="center"> <img src="https://i.postimg.cc/ZnSVJBq9/Captura-de-pantalla-2025-11-17-185011.png" alt="Portada del Proyecto: Conversor de Moneda" width="400"> </p> <p align="center">📛 Badges</p> <p align="center"> <img src="https://img.shields.io/badge/STATUS-En%20Desarrollo-green"> <img src="https://img.shields.io/badge/Java-17-blue"> <img src="https://img.shields.io/badge/Alura-Latam-orange"> <img src="https://img.shields.io/badge/Oracle-ONE-red"> </p>
📑 Índice 📑

Descripción del Proyecto

Funcionalidades

Tecnologías utilizadas

Estructura del Proyecto

Cómo usar este proyecto

Validaciones implementadas

Posibles mejoras futuras

Autor

Licencia

:books: Descripción del Proyecto

Este proyecto es un Conversor de Monedas desarrollado en Java, como parte del Challenge Alura Latam – Oracle Next Education (ONE).

El objetivo principal es permitir al usuario convertir valores entre diferentes monedas consultando una API de tasas de cambio en tiempo real.
El programa funciona desde consola, mostrando un menú interactivo que permite seleccionar el tipo de conversión deseada y ver los resultados de forma clara.

:wrench: Funcionalidades

✔️ Menú interactivo por consola
El usuario elige el tipo de conversión mediante opciones numéricas.

✔️ Conversión entre diferentes monedas
Dependiendo de lo implementado, por ejemplo:

COP → USD

USD → COP

COP → EUR

COP → ARS

Entre otras.

✔️ Consumo de API externa (Exchange Rate API u otra)
El programa obtiene las tasas actualizadas realizando una solicitud HTTP.

✔️ Procesamiento de JSON
Se extraen valores específicos para realizar cálculos.

✔️ Cálculo automático del valor convertido
Se muestra el resultado con formato legible.

✔️ Opción para salir del programa

🧠 Tecnologías utilizadas

Java 17

<p align="center"> <img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" width="120"> </p>

HTTP Client para consultar la API

JSON para procesar los datos recibidos

:card_file_box: Estructura del Proyecto
📁 src/
└── PrincipalCodigo/
    ├── AnalizandoJson.java        # Procesa y organiza los datos del JSON recibido
    ├── ConsultarMonedaApi.java    # Realiza la petición HTTP a la API
    ├── Conversor.java             # Lógica principal del conversor
    └── Menu.java                  # Control del menú y flujo del programa

🛠️ ¿Cómo usar este proyecto?

Clona el repositorio

git clone https://github.com/Felipe3838/Desafio-conversor-De-Moneda.git


Abre el proyecto en tu IDE favorito
(IntelliJ IDEA, Eclipse, VS Code con extensión Java, etc.)

Ejecuta la clase donde tengas el método main, por ejemplo:

public static void main(String[] args) {
    Menu menu = new Menu();
    menu.mostraMenu();
}


Interactúa con el menú en consola

Selecciona la conversión deseada

Ingresa el valor

Mira el resultado calculado

:computer: Validaciones implementadas

❌ No se permiten valores vacíos o no numéricos

❌ No se permiten valores negativos

❌ Manejo de errores si la API falla

✔️ Verificación de opciones incorrectas en el menú

💡 Posibles mejoras futuras

Agregar interfaz gráfica (Swing / JavaFX)

Añadir más monedas disponibles

Guardar historial de conversiones

Implementar manejo de excepciones más detallado

Crear pruebas unitarias (JUnit)

👨‍💻 Autor

Brayan Felipe Muñoz S

GitHub: @Felipe3838

LinkedIn: https://www.linkedin.com/in/brayan-felipe-mu%C3%B1oz/

📃 Licencia

Proyecto desarrollado con fines educativos como parte del programa
Oracle Next Education – Alura Latam.
Libre para usar, modificar y compartir.
