# 🧾 Aplicación de Validación de Datos Personales (JavaFX + ValidatorFX)

Este proyecto es una aplicación desarrollada en **JavaFX** que permite **validar datos personales** de forma interactiva utilizando la librería **ValidatorFX**.  
Forma parte de la asignatura **Desarrollo de Interfaces** (2º DAM) y se ha implementado siguiendo el **patrón MVC (Modelo–Vista–Controlador)**.

---

## 🧩 Funcionalidades

El formulario permite introducir y validar los siguientes campos:

| Campo                     | Requerido | Validación                   |
|----------------------------|------------|-------------------------------|
| Nombre                     | ✅ Sí      | No vacío                      |
| Fecha de nacimiento         | ✅ Sí      | Numérica y válida             |
| Dirección                   | ❌ No      | Libre                         |
| Género                      | ✅ Sí      | Mujer / Hombre / Otro         |
| DNI                         | ✅ Sí      | Formato correcto (8 dígitos + letra) |
| Correo electrónico          | ✅ Sí      | Formato email válido          |
| Número de tarjeta de crédito| ❌ No      | Validación Luhn               |
| Código ISBN (10 o 13 dígitos)| ❌ No     | Validación de longitud        |
| CCC / IBAN                  | ❌ No      | Formato bancario válido       |

---

## ⚙️ Tecnologías utilizadas

- **JavaFX** → Interfaz gráfica moderna y flexible  
- **ValidatorFX** → Validación automática y visual de campos  
- **Maven** → Gestión de dependencias y empaquetado  
- **Patrón MVC** → Separación de la lógica, la vista y el controlador  

---

## 🏗️ Estructura del proyecto

```
src/
└── main/
├── java/
│ └── com/ud5/validaciondatos/
│ ├── App.java
│ ├── controller/
│ │ └── FormController.java
│ ├── model/
│ │ └── Usuario.java
│ └── util/
│ └── ValidatorUtils.java
└── resources/
├── com/ud5/validaciondatos/
| └──img/
|  └──screen.png
│ └── form-view.fxml
└── css/
└── style.css
```

---

## 🚀 Futuras mejoras

- 🔹 Activar y desactivar el botón “Enviar” automáticamente según el estado de los campos.  
- 🔹 Añadir un botón **“Limpiar formulario”** para restablecer todos los campos.  
- 🔹 Incorporar **ayuda contextual** o tooltips explicativos.  
- 🔹 Mejorar el diseño visual con CSS (colores, iconos, tipografía).  
- 🔹 Guardar y cargar datos previamente validados desde un archivo `.txt`.

---

## 🧑‍💻 Autor

**Eneko Guallart**  
📚 *2º DAM – Desarrollo de Interfaces*  
📆 2025  
💻 [GitHub](https://github.com/Dootez/ValidadorFX/) — Proyecto académico de validación de formularios en JavaFX.

---

## 📸 Vista previa

> *(Añade aquí una captura de tu aplicación si lo deseas, por ejemplo `resources/img/screenshot.png`)*

---
