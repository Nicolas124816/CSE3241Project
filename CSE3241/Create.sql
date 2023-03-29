CREATE TABLE Container_Info(
   PackageID     INTEGER  NOT NULL
  ,Serial_Number INTEGER  NOT NULL
  ,PRIMARY KEY(PackageID, Serial_Number)
);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (1,723);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (2,724);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (3,725);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (4,726);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (5,727);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (6,728);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (7,729);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (8,730);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (9,731);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (10,732);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (11,733);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (12,734);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (13,735);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (14,736);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (15,737);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (16,738);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (17,739);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (18,740);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (19,741);
INSERT INTO Container_Info(PackageID,Serial_Number) VALUES (20,742);

CREATE TABLE Drone(
   Serial_Number     INTEGER  NOT NULL PRIMARY KEY 
  ,Weight_Capacity   INTEGER  NOT NULL
  ,Volume_Capacity   INTEGER  NOT NULL
  ,Distance_Autonomy INTEGER  NOT NULL
  ,max_speed         INTEGER  NOT NULL
  ,status            VARCHAR(20) NOT NULL
  ,FleetID           INTEGER  NOT NULL
);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (23,20,15,50,55,'inactive',1);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (24,20,15,50,55,'inactive',2);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (25,20,15,50,55,'inactive',3);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (26,20,15,50,55,'inactive',4);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (27,20,30,50,45,'inactive',5);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (28,20,30,50,45,'inactive',6);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (29,20,30,50,45,'inactive',7);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (30,20,30,50,45,'inactive',8);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (168,45,30,50,50,'inactive',9);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (169,45,30,50,50,'inactive',10);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (170,45,30,50,50,'inactive',11);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (171,45,30,50,50,'inactive',12);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (172,45,60,50,40,'inactive',13);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (173,45,60,50,40,'inactive',14);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (174,45,60,50,40,'inactive',15);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (175,45,60,50,40,'inactive',16);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (176,45,60,50,40,'inactive',17);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (177,45,60,50,40,'inactive',18);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (7849,90,80,100,60,'inactive',19);
INSERT INTO Drone(Serial_Number,Weight_Capacity,Volume_Capacity,Distance_Autonomy,max_speed,status,FleetID) VALUES (7850,90,80,100,60,'inactive',20);

CREATE TABLE Employee(
   Email      VARCHAR(27) NOT NULL PRIMARY KEY
  ,salary     INTEGER  NOT NULL
  ,start_date DATE  NOT NULL
  ,Position   VARCHAR(15) NOT NULL
);
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('alexbook@gmail.com',1000000,'1/1/23','CEO');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('nickashbaugh@gmail.com',1000000,'1/1/23','CFO');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('nicholasyounoszai@gmail.com',1000000,'1/1/23','COO');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('daeyongjung@gmail.com',1000000,'1/1/23','CTO');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('lukealzapiedi@gmail.com',40000,'3/1/19','Floor Faculty');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('aditanup@gmail.com',45000,'4/1/19','Floor Faculty');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('nithishathilingam@gmail.com',50000,'5/1/19','Floor Faculty');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('maxbaker@gmail.com',55000,'6/1/19','Floor Faculty');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('cadebrautigan@gmail.com',60000,'7/1/19','IT Support');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('jamieburjek@gmail.com',65000,'8/1/19','IT Support');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('connorburke@gmail.com',70000,'10/23/15','IT Support');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('josiahchung@gmail.com',75000,'10/24/15','IT Support');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('lesliecobbold@gmail.com',80000,'11/5/15','IT Support');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('vishnudasaka@gmail.com',85000,'5/15/13','Human Resources');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('stephaniedietrich@gmail.com',90000,'8/20/13','Human Resources');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('annadubey@gmail.com',95000,'11/25/13','Human Resources');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('xavierdunifon@gmail.com',100000,'3/2/14','Human Resources');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('dayifan@gmail.com',105000,'6/7/14','Drone Developer');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('mosesgaines@gmail.com',110000,'11/4/11','Drone Developer');
INSERT INTO Employee(Email,salary,start_date,Position) VALUES ('ronitjain@gmail.com',115000,'6/10/11','Drone Developer');

CREATE TABLE Equipment(
   Serial_Number INTEGER  NOT NULL PRIMARY KEY 
  ,Type          VARCHAR(13) NOT NULL
  ,Weight        INTEGER  NOT NULL
  ,Size          VARCHAR(8) NOT NULL
  ,Order_Number  VARCHAR(4)
);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (7851,'Power Washer',80,'Standard',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (7852,'Power Washer',80,'Standard',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (7853,'Power Washer',80,'Standard',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (7854,'Power Washer',80,'Standard',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (342,'Chainsaw',50,'Small',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (343,'Chainsaw',50,'Small',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (344,'Chainsaw',60,'Large',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (345,'Generator',40,'Small',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (346,'Generator',40,'Small',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (347,'Generator',50,'Medium',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (348,'Generator',70,'Large',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (349,'Generator',70,'Large',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (350,'Hedge Trimmer',15,'Small',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (351,'Hedge Trimmer',20,'Medium',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (352,'Hedge Trimmer',25,'Large',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (76,'Leaf Blower',30,'Small',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (77,'Leaf Blower',30,'Small',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (78,'Leaf Blower',38,'Medium',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (79,'Leaf Blower',45,'Large',NULL);
INSERT INTO Equipment(Serial_Number,Type,Weight,Size,Order_Number) VALUES (80,'Leaf Blower',45,'Large',NULL);

CREATE TABLE Item(
   Serial_Number INTEGER  NOT NULL PRIMARY KEY 
  ,Model_Number  INTEGER  NOT NULL
  ,description   VARCHAR(27) NOT NULL
  ,WarehouseID   INTEGER  NOT NULL
  ,Order_Number  VARCHAR(10)
  ,Exp_Date      DATE  NOT NULL
);
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (23,822,'Lightweight Delivery Drone',1,NULL,'1/1/28');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (24,823,'Lightweight Delivery Drone',2,NULL,'1/1/29');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (25,824,'Lightweight Delivery Drone',3,NULL,'1/1/30');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (26,825,'Lightweight Delivery Drone',4,NULL,'1/1/31');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (27,826,'Lightweight Delivery Drone',5,NULL,'1/1/32');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (28,827,'Lightweight Delivery Drone',1,NULL,'1/1/33');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (29,828,'Lightweight Delivery Drone',2,NULL,'1/1/34');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (30,829,'Lightweight Delivery Drone',3,NULL,'1/1/35');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (168,17,'Mediumweight Delivery Drone',4,NULL,'1/1/36');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (169,18,'Mediumweight Delivery Drone',5,NULL,'1/1/37');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (170,19,'Mediumweight Delivery Drone',1,NULL,'1/1/38');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (171,20,'Mediumweight Delivery Drone',2,NULL,'1/1/39');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (172,21,'Mediumweight Delivery Drone',3,NULL,'1/1/40');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (173,22,'Mediumweight Delivery Drone',4,NULL,'1/1/41');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (174,23,'Mediumweight Delivery Drone',5,NULL,'1/1/42');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (175,24,'Mediumweight Delivery Drone',1,NULL,'1/1/43');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (176,25,'Mediumweight Delivery Drone',2,NULL,'1/1/44');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (177,26,'Mediumweight Delivery Drone',3,NULL,'1/1/45');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (7849,665,'Heavyweight Delivery Drone',4,NULL,'1/1/46');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (7850,666,'Heavyweight Delivery Drone',5,NULL,'1/1/47');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (7851,667,'Power washer',1,NULL,'1/1/48');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (7852,668,'Power washer',2,NULL,'1/1/49');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (7853,669,'Power washer',3,NULL,'1/1/50');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (7854,670,'Power washer',4,NULL,'1/1/51');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (342,671,'Small chainsaw',5,NULL,'1/1/52');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (343,672,'Small chainsaw',1,NULL,'1/1/53');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (344,673,'Large chainsaw',2,NULL,'1/1/54');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (345,674,'Small generator',3,NULL,'1/1/55');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (346,675,'Small generator',4,NULL,'1/1/56');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (347,676,'Medium generator',5,NULL,'1/1/57');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (348,913,'Large generator',1,NULL,'1/1/58');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (349,914,'Large generator',2,NULL,'1/1/59');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (350,915,'Small hedge trimmer',3,NULL,'1/1/60');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (351,916,'Medium hedge trimmer',4,NULL,'1/1/61');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (352,917,'Large hedge trimmer',5,NULL,'1/1/62');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (76,918,'Small leaf blower',1,NULL,'1/1/63');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (77,919,'Small leaf blower',2,NULL,'1/1/64');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (78,920,'Medium leaf blower',3,NULL,'1/1/65');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (79,921,'Large leaf blower',4,NULL,'1/1/66');
INSERT INTO Item(Serial_Number,Model_Number,description,WarehouseID,Order_Number,Exp_Date) VALUES (80,922,'Large leaf blower',5,NULL,'1/1/67');

CREATE TABLE Item_Model(
   Model_Number INTEGER  NOT NULL PRIMARY KEY 
  ,Year         INTEGER  NOT NULL
  ,Manufacturer VARCHAR(13) NOT NULL
);
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (822,2016,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (823,2016,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (824,2016,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (825,2016,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (826,2017,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (827,2017,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (828,2017,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (829,2017,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (17,2015,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (18,2015,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (19,2015,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (20,2015,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (21,2018,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (22,2018,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (23,2018,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (24,2018,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (25,2018,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (26,2018,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (665,2014,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (666,2014,'DynamicDrones');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (667,1994,'3M');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (668,1994,'3M');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (669,1994,'3M');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (670,1994,'3M');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (671,1994,'Craftsman');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (672,1994,'Craftsman');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (673,2002,'Craftsman');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (674,2002,'Caterpillar');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (675,2002,'Caterpillar');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (676,2008,'Caterpillar');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (913,2008,'Caterpillar');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (914,2008,'Caterpillar');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (915,2008,'Stihl');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (916,1999,'Stihl');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (917,1999,'Stihl');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (918,1999,'Atlas');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (919,2010,'Atlas');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (920,2010,'Atlas');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (921,2010,'Atlas');
INSERT INTO Item_Model(Model_Number,Year,Manufacturer) VALUES (922,2007,'Atlas');

CREATE TABLE Member(
   Email      VARCHAR(24) NOT NULL PRIMARY KEY
  ,start_date DATE  NOT NULL
  ,user_ID    INTEGER  NOT NULL
);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('gracejiang@gmail.com','1/10/20',1);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('hamzukashubeck@gmail.com','1/17/20',2);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('cameronklotter@gmail.com','1/24/20',3);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('drewkovalchick@gmail.com','1/31/20',4);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('sethlamancusa@gmail.com','2/7/20',5);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('bradyleemaster@gmail.com','2/14/20',6);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('williamma@gmail.com','3/4/21',7);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('leonmadrid@gmail.com','3/14/21',8);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('jingsongmeng@gmail.com','3/24/21',9);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('maxmiller@gmail.com','4/3/21',10);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('alinamueez@gmail.com','4/13/21',11);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('ethanmylett@gmail.com','4/23/21',12);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('seungnam@gmail.com','5/3/21',13);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('zacnichols@gmail.com','10/28/22',14);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('masonpacenta@gmail.com','11/2/22',15);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('breecepingle@gmail.com','11/7/22',16);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('robertrennard@gmail.com','11/12/22',17);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('chalinarussell@gmail.com','11/17/22',18);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('adamsaleh@gmail.com','11/22/22',19);
INSERT INTO Member(Email,start_date,user_ID) VALUES ('addisonsmith@gmail.com','11/27/22',20);


CREATE TABLE Person(
   Email      VARCHAR(27) NOT NULL PRIMARY KEY
  ,First_Name VARCHAR(9) NOT NULL
  ,Last_Name  VARCHAR(10) NOT NULL
  ,Address    VARCHAR(20) NOT NULL
  ,Phone      INTEGER  NOT NULL
);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('alexbook@gmail.com','Alex','Book','2020 N High St',6145195196);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('nickashbaugh@gmail.com','Nick','Ashbaugh','1000 N High St',6145195197);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('nicholasyounoszai@gmail.com','Nicholas','Younoszai','500 N High St',6145195198);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('daeyongjung@gmail.com','Daeyong','Jung','1500 N High St',6145195199);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('lukealzapiedi@gmail.com','Luke','Alzapiedi','50 Woodruff Ave',6145195200);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('aditanup@gmail.com','Adit','Anup','75 Woodruff Ave',6145195201);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('nithishathilingam@gmail.com','Nithish','Athilingam','100 Neil Ave',6145195202);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('maxbaker@gmail.com','Max','Baker','80 Neil Ave',6145195203);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('cadebrautigan@gmail.com','Cade','Brautigan','870 W Lane Ave',6145195204);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('jamieburjek@gmail.com','Jamie','Burjek','800 W Lane Ave',6145195205);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('connorburke@gmail.com','Connor','Burke','500 W Lane Ave',6145195206);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('josiahchung@gmail.com','Josiah','Chung','700 E 18th Ave',6145195207);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('lesliecobbold@gmail.com','Leslie','Cobbold','400 E 16th Ave',6145195208);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('vishnudasaka@gmail.com','Vishnu','Dasaka','200 E 16th Ave',6145195209);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('stephaniedietrich@gmail.com','Stephanie','Dietrich','100 E 16th Ave',6145195210);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('annadubey@gmail.com','Anna','Dubey','750 E Chittenden Ave',6145195211);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('xavierdunifon@gmail.com','Xavier','Dunifon','500 E Chittenden Ave',6145195212);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('dayifan@gmail.com','Dayi','Fan','900 E 14th Ave',6145195213);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('mosesgaines@gmail.com','Moses','Gaines','600 E 14th Ave',6145195214);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('ronitjain@gmail.com','Ronit','Jain','800 E 14th Ave',6145195215);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('gracejiang@gmail.com','Grace','Jiang','700 E 12th Ave',6145195216);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('hamzukashubeck@gmail.com','Hamzu','Kashubeck','600 E 12th Ave',6145195217);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('cameronklotter@gmail.com','Cameron','Klotter','400 E 12th Ave',6145195218);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('drewkovalchick@gmail.com','Drew','Kovalchick','200 E 12th Ave',6145195219);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('sethlamancusa@gmail.com','Seth','Lamancusa','100 E 10th Ave',6145195220);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('bradyleemaster@gmail.com','Brady','Leemaster','500 E 10th Ave',6145195221);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('williamma@gmail.com','William','Ma','1000 E 10th Ave',6145195222);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('leonmadrid@gmail.com','Leon','Madrid','500 W 8th Ave',6145195223);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('jingsongmeng@gmail.com','Jingsong','Meng','700 W 8th Ave',6145195224);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('maxmiller@gmail.com','Max','Miller','600 W 8th Ave',6145195225);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('alinamueez@gmail.com','Alina','Mueez','300 W 8th Ave',6145195226);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('ethanmylett@gmail.com','Ethan','Mylett','200 W 8th Ave',6145195227);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('seungnam@gmail.com','Seung','Nam','100 W 8th Ave',6145195228);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('zacnichols@gmail.com','Zac','Nichols','800 W 8th Ave',6145195229);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('masonpacenta@gmail.com','Mason','Pacenta','50 King Ave',6145195230);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('breecepingle@gmail.com','Breece','Pingle','100 King Ave',6145195231);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('robertrennard@gmail.com','Robert','Rennard','200 King Ave',6145195232);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('chalinarussell@gmail.com','Chalina','Russell','70 Blake Ave',6145195233);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('adamsaleh@gmail.com','Adam','Saleh','100 Blake Ave',6145195234);
INSERT INTO Person(Email,First_Name,Last_Name,Address,Phone) VALUES ('addisonsmith@gmail.com','Addison','Smith','220 Blake Ave',6145195235);

CREATE TABLE Rents(
   Email         VARCHAR(24) NOT NULL
  ,Serial_Number INTEGER  NOT NULL
  ,Checkout_Date DATE  NOT NULL
  ,Return_Date   DATE  NOT NULL
  ,PRIMARY KEY(Email, Serial_Number)
);
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('gracejiang@gmail.com',7851,'3/11/23','3/21/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('hamzukashubeck@gmail.com',7852,'3/12/23','3/22/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('cameronklotter@gmail.com',7853,'3/13/23','3/23/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('drewkovalchick@gmail.com',7854,'3/14/23','3/24/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('sethlamancusa@gmail.com',342,'3/15/23','3/25/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('bradyleemaster@gmail.com',343,'3/16/23','3/26/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('williamma@gmail.com',344,'3/17/23','3/27/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('leonmadrid@gmail.com',345,'3/18/23','3/28/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('jingsongmeng@gmail.com',346,'3/19/23','3/29/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('maxmiller@gmail.com',347,'3/20/23','3/30/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('alinamueez@gmail.com',348,'3/21/23','3/31/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('ethanmylett@gmail.com',349,'3/22/23','4/1/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('seunghyunnam@gmail.com',350,'3/23/23','4/2/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('zacnichols@gmail.com',351,'3/24/23','4/3/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('masonpacenta@gmail.com',352,'3/25/23','4/4/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('breecepingle@gmail.com',76,'3/26/23','4/5/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('robertrennard@gmail.com',77,'3/27/23','4/6/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('chalinerussell@gmail.com',78,'3/28/23','4/7/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('adamsaleh@gmail.com',79,'3/29/23','4/8/23');
INSERT INTO Rents(Email,Serial_Number,Checkout_Date,Return_Date) VALUES ('addisonsmith@gmail.com',80,'3/30/23','4/9/23');


CREATE TABLE Review(
   Review_Number INTEGER  NOT NULL PRIMARY KEY 
  ,Serial_Number INTEGER  NOT NULL
  ,Rating        NUMERIC(3,1) NOT NULL
  ,Comment       VARCHAR(38) NOT NULL
  ,Email         VARCHAR(24) NOT NULL
);
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (1,7851,9.8,'Worked Great','xavierdunifon@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (2,7852,7.1,'Worked Great','dayifan@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (3,7853,8.2,'Worked Great','mosesgaines@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (4,7854,5,'Arrived too late','ronitjain@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (5,342,8.3,'Worked Great','gracejiang@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (6,343,6.7,'Product in poor condition','hamzukashubeck@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (7,344,9.4,'Worked Great','cameronklotter@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (8,345,9.2,'Excellent service!','drewkovalchick@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (9,346,9.3,'Quick delivery','sethlamancusa@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (10,347,7.8,'Worked Great','bradyleemaster@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (11,348,7.9,'Met expectations','williamma@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (12,349,5.8,'Customer service was rude','leonmadrid@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (13,350,8.8,'Got the job done','jingsongmeng@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (14,351,6.3,'Missing parts','maxmiller@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (15,352,7.9,'Thanks','alinamueez@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (16,76,8.3,'Painless delivery and return!','ethanmylett@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (17,77,7.5,'Arrived as expected','seunghyunnam@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (18,78,9,'Love this company! Never dissappoints!','zacnichols@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (19,79,8.6,'Helped me get my housework done','masonpacenta@gmail.com');
INSERT INTO Review(Review_Number,Serial_Number,Rating,Comment,Email) VALUES (20,80,8.1,'Good service','breecepingle@gmail.com');

CREATE TABLE Shipment(
   PackageID     INTEGER  NOT NULL
  ,Serial_Number INTEGER  NOT NULL
  ,PRIMARY KEY(PackageID, Serial_Number)
);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (1,7851);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (2,7852);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (3,7853);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (4,7854);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (5,342);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (6,343);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (7,344);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (8,345);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (9,346);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (10,347);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (11,348);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (12,349);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (13,350);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (14,351);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (15,352);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (16,76);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (17,77);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (18,78);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (19,79);
INSERT INTO Shipment(PackageID,Serial_Number) VALUES (20,80);

CREATE TABLE Shipping_Container(
   PackageID INTEGER  NOT NULL PRIMARY KEY 
  ,Volume    INTEGER  NOT NULL
  ,Weight    INTEGER  NOT NULL
  ,Material  VARCHAR(9) NOT NULL
);
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (1,10,20,'Cardboard');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (2,15,20,'Cardboard');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (3,20,25,'Cardboard');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (4,25,30,'Plastic');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (5,30,35,'Plastic');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (6,35,40,'Plastic');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (7,40,45,'Plastic');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (8,45,50,'Plastic');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (9,50,55,'Plastic');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (10,55,60,'Plastic');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (11,60,65,'Plastic');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (12,65,70,'Plastic');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (13,70,75,'Plastic');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (14,75,80,'Aluminum');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (15,80,80,'Aluminum');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (16,80,85,'Aluminum');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (17,80,90,'Aluminum');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (18,80,90,'Aluminum');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (19,80,90,'Aluminum');
INSERT INTO Shipping_Container(PackageID,Volume,Weight,Material) VALUES (20,80,90,'Aluminum');

CREATE TABLE Warehouse_Order(
   Order_Number INTEGER  NOT NULL PRIMARY KEY 
  ,WarehouseID  INTEGER  NOT NULL
  ,Element_type VARCHAR(9) NOT NULL
  ,Num_items    INTEGER  NOT NULL
  ,Cost         INTEGER  NOT NULL
  ,ETA          DATE  NOT NULL
  ,Description  VARCHAR(20) NOT NULL
);
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (1,5,'Drone',1,200,'3/15/23','Lightweight drone');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (2,4,'Equipment',2,150,'3/16/23','Large Leafblower');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (3,3,'Drone',1,400,'3/17/23','Mediumweight drone');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (4,2,'Equipment',2,100,'3/18/23','Medium Hedge trimmer');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (5,1,'Drone',1,600,'3/19/23','Heavyweight drone');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (6,5,'Equipment',2,80,'3/20/23','Small chainsaw');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (7,4,'Drone',1,600,'3/21/23','Heavyweight drone');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (8,3,'Equipment',2,100,'3/22/23','Medium chainsaw');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (9,2,'Drone',1,200,'3/23/23','Lightweight drone');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (10,1,'Equipment',2,150,'3/24/23','Small generator');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (11,5,'Drone',1,400,'3/25/23','Mediumweight drone');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (12,4,'Equipment',2,200,'3/26/23','Large powerwasher');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (13,3,'Drone',1,500,'3/27/23','Heavyweight drone');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (14,2,'Equipment',2,80,'3/28/23','Small chainsaw');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (15,1,'Drone',1,600,'3/29/23','Heavyweight drone');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (16,5,'Equipment',2,150,'3/30/23','Large chainsaw');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (17,4,'Drone',1,500,'3/31/23','Heavyweight drone');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (18,3,'Equipment',2,200,'4/1/23','Large powerwasher');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (19,2,'Drone',1,400,'4/2/23','Mediumweight drone');
INSERT INTO Warehouse_Order(Order_Number,WarehouseID,Element_type,Num_items,Cost,ETA,Description) VALUES (20,1,'Equipment',2,80,'4/3/23','Small chainsaw');

CREATE TABLE Warehouse(
   WarehouseID  INTEGER  NOT NULL PRIMARY KEY 
  ,City         VARCHAR(13) NOT NULL
  ,Address      VARCHAR(23) NOT NULL
  ,Phone        VARCHAR(12) NOT NULL
  ,Manager_name VARCHAR(20) NOT NULL
);
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (1,'Columbus','7 Sauthoff Way','981-431-2164','Steven Phlipon');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (2,'Chicago','1676 Thackeray Hill','553-220-1628','North Sansun');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (3,'Austin','1 Vera Street','849-942-5873','Flore Mansion');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (4,'Seattle','51395 Melrose Plaza','966-123-9088','Hannis Starzaker');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (5,'Houston','75151 Washington Pass','160-709-9271','Shaughn Good');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (6,'Dallas','89918 Pennsylvania Hill','229-762-1790','Caryl Gaunter');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (7,'Miami','3 Jay Park','205-785-3394','Adaline Terbeek');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (8,'San Francisco','31789 Hanover Hill','635-396-0926','Yelena Bevar');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (9,'Fort Worth','99 Cascade Place','421-531-5460','Rhianna Pugh');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (10,'Denver','1 Nancy Court','140-776-7091','Arline Flasby');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (11,'Nashville','559 Spaight Junction','135-480-9527','Kirby Alpine');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (12,'Boston','3 Fieldstone Junction','699-425-8047','Tallulah Piotrkowski');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (13,'Detroit','814 Corben Trail','144-441-5804','Lavena Hutable');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (14,'Baltimore','5 Brentwood Lane','815-905-7062','Stacia Spearing');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (15,'Cincinnati','931 Manitowish Alley','180-682-3919','Francesco Livzey');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (16,'Cleveland','69212 Mesta Road','216-606-4206','Jackie Hewlings');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (17,'San Diego','734 Fremont Center','825-818-8886','Trudy Edwardes');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (18,'Jacksonville','42753 Sachs Trail','617-320-7419','Fredelia Beaver');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (19,'New York','5265 Redwing Plaza','378-623-7945','Philipa Etchell');
INSERT INTO Warehouse(WarehouseID,City,Address,Phone,Manager_name) VALUES (20,'San Jose','3 Upham Pass','671-999-8726','Griswold Olanda');

CREATE TABLE Workplace(
   Email       VARCHAR(27) NOT NULL
  ,WarehouseID INTEGER  NOT NULL
  ,PRIMARY KEY(Email, WarehouseID)
);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('alexbook@gmail.com',1);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('nickashbaugh@gmail.com',2);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('nicholasyounoszai@gmail.com',3);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('daeyongjung@gmail.com',4);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('lukealzapiedi@gmail.com',5);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('aditanup@gmail.com',1);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('nithishathilingam@gmail.com',2);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('maxbaker@gmail.com',3);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('cadebrautigan@gmail.com',4);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('jamieburjek@gmail.com',5);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('connorburke@gmail.com',1);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('josiahchung@gmail.com',2);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('lesliecobbold@gmail.com',3);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('vishnudasaka@gmail.com',4);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('stephaniedietrich@gmail.com',5);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('annadubey@gmail.com',1);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('xavierdunifon@gmail.com',2);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('dayifan@gmail.com',3);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('mosesgaines@gmail.com',4);
INSERT INTO Workplace(Email,WarehouseID) VALUES ('ronitjain@gmail.com',5);

