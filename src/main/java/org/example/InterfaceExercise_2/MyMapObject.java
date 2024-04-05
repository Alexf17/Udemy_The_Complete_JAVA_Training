package org.example.InterfaceExercise_2;
import com.google.gson.Gson;

class MyMapObject implements MapMappable {
    private String label;
    private String geometry;
    private String icon;

    public MyMapObject(String label, String geometry, String icon) {
        this.label = label;
        this.geometry = geometry;
        this.icon = icon;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getGeometry() {
        return geometry;
    }

    @Override
    public String getIcon() {
        return icon;
    }

    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}