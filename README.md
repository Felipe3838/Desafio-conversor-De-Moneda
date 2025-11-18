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

🌐 HTTP Client de Java

🔄 API de tasas de cambio

🧰 IntelliJ IDEA / VSCode

🧪 JSON

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

Compila y ejecuta desde consola:

javac src/PrincipalCodigo/*.java
java src/PrincipalCodigo/Menu


O simplemente ejecútalo desde tu IDE.

🌐 API Utilizada

El programa obtiene tasas de cambio en tiempo real desde una API externa en formato JSON, la cual es procesada dentro de AnalizandoJson.java.

📌 Estado del Proyecto

🚧 En desarrollo
Mejoras futuras:

Nuevas monedas

Mejor manejo de errores

Validación avanzada de datos

Menú más intuitivo

👨‍💻 Autor

Brayan Felipe Muñoz
Estudiante – Alura Latam & Oracle ONE
