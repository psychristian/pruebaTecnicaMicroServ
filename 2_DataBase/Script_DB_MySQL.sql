use `xprueba` ;

-- DROP TABLE TiposIdentificacion
CREATE TABLE TiposIdentificacion (
	id INT AUTO_INCREMENT PRIMARY KEY,
	codtpident VARCHAR(2),
	desctpident VARCHAR(50)
);
-- SQLINES LICENSE FOR EVALUATION USE ONLY
INSERT INTO TiposIdentificacion (codtpident,desctpident)
SELECT 'CC','Cedula de Ciudadania' UNION
SELECT 'RC','Registro Civil'  UNION
SELECT 'TI','Tarjeta de identidad' UNION
SELECT 'CE','Cedula de Extranjeria' UNION
SELECT 'NI','Nit';
 
/*******************************************************************************************************************/
-- DROP TABLE PlanesMP
CREATE TABLE PlanesMP (
	id INT AUTO_INCREMENT PRIMARY KEY,
	codigoplan VARCHAR(10),
	nombreplan VARCHAR(100)
);

-- SQLINES LICENSE FOR EVALUATION USE ONLY
INSERT INTO PlanesMP (codigoplan,nombreplan)
SELECT '01','Plan Mercurio Basic' UNION
SELECT '02','Plan Saturno Standard'  UNION
SELECT '03','Plan Jupiter Premium';

/*******************************************************************************************************************/
-- DROP TABLE Clientes
CREATE TABLE Clientes (
	id INT AUTO_INCREMENT PRIMARY KEY,
	idtpidentcliente INT not null,
	numidentcliente VARCHAR(30) not null,
	nombre1 VARCHAR(80) not null,
	nombre2 VARCHAR(80),
	apellido1 VARCHAR(80) not null,
	apellido2 VARCHAR(80),
	direccionresid VARCHAR(200),
	numcelular VARCHAR(20),
	email VARCHAR(100),
	fecnacimiento DATE,
	idplan INT not null,
    FOREIGN KEY (idtpidentcliente) REFERENCES TiposIdentificacion (id),
    FOREIGN KEY (idplan) REFERENCES PlanesMP (id)
);

INSERT INTO Clientes (id, idtpidentcliente,NumIdentCliente,Nombre1,Nombre2,Apellido1,Apellido2,DireccionResid,NumCelular,Email,FecNacimiento,idplan)
SELECT 1, 4,'2233344','Kylian','Andres','Mbappé','Lottin','Calle 93 # 15','300223399','Kylian@kemail.com','20010301',3 UNION
SELECT 2, 1,'8866655','Radamel','Falcao','Garcia','Zárate','Kra 7 # 120','310028202','falcao@yemail.com','19990501',2;
 