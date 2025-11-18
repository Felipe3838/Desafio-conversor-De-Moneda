🪙 Conversor de Monedas – Challenge Alura Latam & Oracle ONE
<p align="center"> <img src="https://i.postimg.cc/ZnSVJBq9/Captura-de-pantalla-2025-11-17-185011.png" alt="Portada del Proyecto: Conversor de Moneda" width="400"> </p> <p align="center">📛 Badges</p> <p align="center"> <img src="https://img.shields.io/badge/STATUS-En%20Desarrollo-green"> <img src="https://img.shields.io/badge/Java-17-blue"> <img src="https://img.shields.io/badge/Alura-Latam-orange"> <img src="https://img.shields.io/badge/Oracle-ONE-red"> </p>
📑 Índice

📘 Descripción del Proyecto

🛠️ Funcionalidades

🧠 Tecnologías utilizadas

📂 Estructura del Proyecto

▶️ Cómo usar este proyecto

💻 Validaciones implementadas

💡 Posibles mejoras futuras

👨‍💻 Autor

📄 Licencia

📘 Descripción del Proyecto

Este proyecto es un Conversor de Monedas en Java, desarrollado como parte del Challenge Alura Latam – Oracle ONE.

Permite convertir valores entre distintas monedas usando una API de tasas de cambio en tiempo real, a través de un menú interactivo ejecutado por consola.

Su objetivo es reforzar conceptos de:

Lógica de programación

Consumo de APIs

Manejo de JSON

Validaciones y flujo de control

🛠️ Funcionalidades

✔️ Menú interactivo por consola

✔️ Conversión entre distintas monedas (COP, USD, EUR, ARS, etc.)

✔️ Consumo de API para obtener tasas actualizadas

✔️ Procesamiento de JSON recibido desde la API

✔️ Cálculo automático del valor convertido

✔️ Opción para salir del programa

🧠 Tecnologías utilizadas

Java 17

<p align="center"> <img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" width="120"> </p>

HTTP Client

JSON Parsing

Programación orientada a objetos (POO)

📂 Estructura del Proyecto
📁 src/
└── PrincipalCodigo/
    ├── AnalizandoJson.java        # Procesa y organiza los datos del JSON recibido
    ├── ConsultarMonedaApi.java    # Realiza la petición HTTP a la API
    ├── Conversor.java             # Lógica principal del conversor
    └── Menu.java                  # Control del menú y flujo del programa

▶️ Cómo usar este proyecto
1. Clonar el repositorio
git clone https://github.com/Felipe3838/Desafio-conversor-De-Moneda.git

2. Abrirlo en tu IDE preferido

(IntelliJ IDEA, Eclipse, VSCode con Java, etc.)

3. Ejecutar el método main()

Ejemplo:

public static void main(String[] args) {
    Menu menu = new Menu();
    menu.mostraMenu();
}

4. Interactuar con el menú en consola

Selecciona la conversión

Ingresa el valor

Recibe el resultado formateado

💻 Validaciones implementadas

❌ Rechazo de valores negativos

❌ Rechazo de caracteres no numéricos

❌ Manejo de excepciones en caso de error de API

✔️ Validación de opciones incorrectas en el menú

💡 Posibles mejoras futuras

Implementar interfaz gráfica (JavaFX/Swing)

Agregar más monedas

Guardar historial de conversiones

Añadir pruebas unitarias (JUnit)

Manejo avanzado de errores

👨‍💻 Autor

Brayan Felipe Muñoz S

GitHub: @Felipe3838

LinkedIn: https://www.linkedin.com/in/brayan-felipe-mu%C3%B1oz/

📄 Licencia

Este proyecto fue creado con fines educativos como parte del programa
Oracle Next Education – Alura Latam.
Libre para usar, modificar y compartir.

Si quieres, también puedo hacer:
✨ Una versión con separadores más elegantes
📌 Una versión con GIF de ejemplo
🎨 Una versión estilo profesional (GitHub Pro)
