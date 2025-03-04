# Proyecto Restaurante
>Por Juan Angel Rivera Torres, Montserrat Perez Landin, Ximena Rodriguez Rodriguez alumnos del TECNM en Celaya
## Cosas por hacer
- [ ] Terminar de generar todas las tablas
- [ ] Hacer que todos puedan usar el submódulo
- [ ] Generar todos los modelos DAO
- [ ] Vincular tablas con DAO
- [ ] Generar interfaz para cada DAO
- [ ] Generar interfaces generales

## Comandos básicos a usar
- **Para manejar rutas en el proyecto**


  Para volver al directorio raiz.
```bash
cd ..
```
Para ingresar al submodulo restaurante.
```bash
cd modulo
```

- **Para añadir una aportación al proyecto**
Para verificar que archivos se van a actualizar.
```bash
git status
```
Para añadir todos los archivos modificados localmente.
```bash
git add .
```
Para etiquetar el paquete a enviar.
```bash
git commit -a -m "Nombre del paquete"
```
Para subir los cambios a GitHub.
```bash
git push origin main
```
Para actualizar repositorio local.
```bash
git pull origin main
```

- **Para mysql (en la carpeta bin)** 
Para iniciar sesión como un rol.
```bash
mysql -u nombre_del_rol -p;
```
Para cerrar sesión.
```bash
quit;
```
Para seleccionar la base de datos a usar.
```bash
use Nombre_base_de_datos;
```
Muestra las tablas de la base de datos seleccionada.
```bash
show tables;
```
Muestra como está estructurada una tabla seleccionada.
```bash
decribe Nombre_tabla;
```
Muestra todos los registros de una tabla.
```bash
SELECT * FROM Nombre_tabla;
```
Para crear una nueva tabla en la base de datos.
```bash
CREATE TABLE Nombre_tabla (parametro1, parametro2, ..., parametron);
```
