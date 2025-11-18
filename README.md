🪙 Conversor de Monedas – Challenge Alura Latam & Oracle ONE
<p align="center"> <img src="https://i.postimg.cc/ZnSVJBq9/Captura-de-pantalla-2025-11-17-185011.png" alt="Portada del Proyecto: Conversor de Moneda"> </p>
📑 Índice

🚀 Descripción del Proyecto

🛠️ Tecnologías Utilizadas

📁 Estructura del Proyecto

▶️ Cómo Ejecutarlo

🌐 API Utilizada

📌 Estado del Proyecto

👨‍💻 Autor

🚀 Descripción del Proyecto

Este es un conversor de monedas desarrollado en Java, realizado como parte del Challenge de Alura Latam en alianza con Oracle ONE.

El programa se ejecuta desde consola y permite convertir diferentes divisas utilizando datos en tiempo real obtenidos desde una API externa.

🛠️ Tecnologías Utilizadas

☕ Java 17

🌐 HTTP Client nativo de Java

🔄 API ExchangeRate API/Alura

🧰 IntelliJ IDEA / VSCode

🧪 JSON y manejo de respuestas

📁 Estructura del Proyecto
📁 src/
└── PrincipalCodigo/
    ├── AnalizandoJson.java        # Procesa y organiza los datos recibidos en formato JSON
    ├── ConsultarMonedaApi.java    # Realiza la petición HTTP a la API de tasas de cambio
    ├── Conversor.java             # Lógica principal de conversión entre monedas
    └── Menu.java                  # Menú interactivo y flujo del programa

▶️ Cómo Ejecutarlo
1️⃣ Clona el repositorio
git clone https://github.com/Felipe3838/Desafio-conversor-De-Moneda.git

2️⃣ Entra en la carpeta
cd Desafio-conversor-De-Moneda

3️⃣ Ejecuta el programa

Puedes compilarlo desde consola con:

javac src/PrincipalCodigo/*.java
java src/PrincipalCodigo/Menu


O simplemente correrlo desde tu IDE (IntelliJ / VSCode).

🌐 API Utilizada

El programa obtiene las tasas de cambio en tiempo real desde una API de conversión de moneda.

Se usan datos en formato JSON que luego son procesados dentro de la clase AnalizandoJson.

📌 Estado del Proyecto

🚧 En desarrollo – Se planea agregar:

Menú más interactivo ✔️

Nuevas monedas

Manejo de excepciones

Validación de entrada del usuario

👨‍💻 Autor

Brayan Felipe Muñoz
📚 Estudiante – Alura Latam & Oracle ONE
💼 Linkedin (opcional si quieres agregarlo)
