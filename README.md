## Intent of the Project

 	The main purpose of this project is to obtain information about the farm animals owned by a farmer. It aims to obtain information such as the location and health status of the animals in the existing land. It will also include information on the feeding types of animals and what they eat. Animal medical applications varying according to the seasons will be viewable. Based on the knowledge acquired during the course and using the design pattern, this project should be done.

## Purpose of The Design Patterns That We Used

## Abstract Factory: 
  When creating an object, the subclasses must decide. Therefore, there are 2 different types of cattle and there are different types of food. There are also two different groups of these different types of food (Protein & Carbohydrate). For this reason, Abstract Factory is the most suitable choice for feeding cattle and foods to related animals.

## Visitor Pattern: 
  With Visitor Pattern, it allows us to add new operations without changing the elements of the classes. In this way, ministries and veterinarians, who will come to different seasons for farm animals, will work correctly. In addition, the medical practices of the ministry and veterinarians on animals are different.

## Observer Pattern: 
  The location of the cattle on the farm is very important to us and we need to receive notification for every animal that goes outside the farm boundaries. Therefore, we had to define one-to-many dependencies on the objects. So we will be automatically notified when there are changes in the objects.

## Adapter Pattern: 
  The current system only accepts Zigbee signals for the majority of the cattle, but for some cattle we need to accept Bluetooth signals too. To solve this problem, we need to use the Adapter Pattern. Because we cannot modify the server software and it will allow us to connect these two different signal systems to each other. In this way, the system will be able to detect two different signal waves in the farm.

## Singleton Pattern: 
  We must have a global access to an object that belongs to a specific class. We have designed the Singleton Pattern to present the objects of the Concreate Factory class to use globally. Thus, in other classes will have access to this object.

