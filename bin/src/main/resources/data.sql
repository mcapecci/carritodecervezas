insert into PROYECTO (id, nombre, anio_inicio, anio_fin)
values
(1,'Proyecto 1',2017,2019),
(2,'Proyecto 2',2018,2020),
(3,'Proyecto 3',2018,2020),
(4,'Proyecto 4',2017,2019);

insert into INCISO_PROYECTO (id, nombre, anio, monto, id_proyecto)
values
(1,'Inciso A',2017,4500.00,1),
(2,'Inciso B',2017,1500.00,1),
(3,'Inciso C',2018,2000.00,1),
(4,'Inciso A',2019,3000.00,1),
(5,'Inciso B',2018,1.00,2),
(6,'Inciso A',2019,1.00,2);
