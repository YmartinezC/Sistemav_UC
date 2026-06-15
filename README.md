# 🛒 Sistema de Venta en Java y Access
### Trabajo realizado por Yimmy Martinez

---

## ✅ Requisitos

| Herramienta | Versión |
|---|---|
| NetBeans IDE | 8.x o superior |
| Java JDK | **1.8 (Java 8)** |

---

## 🚀 Cómo ejecutar

1. Abre **NetBeans IDE**
2. Ve a **File → Open Project...** y selecciona la carpeta `SistemaVentav2`
3. Verifica que los JARs en `librerias/` estén referenciados en **Properties → Libraries**
4. Asegúrate de que `sis_java.accdb` esté en la **raíz del proyecto**
5. Presiona **F6** para ejecutar

---

## 📦 Librerías utilizadas

| JAR | Uso |
|---|---|
| `ucanaccess-2.0.9.4.jar` | Conexión JDBC a Access |
| `jackcess-2.0.8.jar` | Lectura del `.accdb` |
| `commons-lang-2.6.jar` | Soporte UCanAccess |
| `commons-logging-1.1.1.jar` | Soporte UCanAccess |
| `hsqldb.jar` | Motor SQL embebido |
| `itextpdf-5.5.1.jar` | Generación de PDF |
| `jfreechart-1.0.19.jar` | Gráficos estadísticos |
| `jcommon-1.0.23.jar` | Soporte JFreeChart |
| `jcalendar-1.4.jar` | Selector de fechas |
| `AbsoluteLayout.jar` | Layout del diseñador Swing |

---

## ⚠️ Problemas comunes

**Error: "El archivo de base de datos no se encuentra"**
→ Verifica que `sis_java.accdb` esté en la raíz del proyecto, no dentro de `src/`.

**Error de librerías al abrir el proyecto**
→ Ve a *Properties → Libraries*, elimina las referencias rotas y agrega de nuevo los JARs desde `librerias/`.

**El proyecto no compila**
→ Este proyecto requiere **JDK 8**. En NetBeans ve a *Tools → Java Platforms* y asegúrate de tener JDK 8 como plataforma activa.

**`jcommon-1.0.23.jar` con ruta rota**
→ Elimina la referencia antigua y apunta al JAR dentro de la carpeta `librerias/` del proyecto.
