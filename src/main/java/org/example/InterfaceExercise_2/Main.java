package org.example.InterfaceExercise_2;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of MyMapObject
        MyMapObject mapObject = new MyMapObject("My Object", "Point", "Black Pushpin");

        // Access the methods defined in the MapMappable interface
        System.out.println("Label: " + mapObject.getLabel());
        System.out.println("Geometry: " + mapObject.getGeometry());
        System.out.println("Icon: " + mapObject.getIcon());

        // Convert the mappable object to JSON
        String json = mapObject.toJson();
        System.out.println("JSON: " + json);

        // Create a list of map objects
        List<MapMappable> mapObjects = new ArrayList<>();
        mapObjects.add(mapObject);

        // Convert the list of map objects to JSON
        String objectsJson = new Gson().toJson(mapObjects);
        System.out.println("Objects JSON: " + objectsJson);

        // Create a map of map objects
        Map<String, MapMappable> mapObjectMap = new HashMap<>();
        mapObjectMap.put("object1", mapObject);

        // Convert the map of map objects to JSON
        String mapJson = new Gson().toJson(mapObjectMap);
        System.out.println("Map JSON: " + mapJson);
    }
}
