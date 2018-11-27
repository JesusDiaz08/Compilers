package model;

import java.awt.Color;
import java.util.ArrayList;

public class Initialize {

    private ArrayList<Line> lineas;
    private Color color;
    private double X;
    private double Y;
    private int angle;

    public Initialize() {
        this.X = 0.0; // Coordenadas
        this.Y = 0.0; // de origen
        this.lineas = new ArrayList<Line>();
        this.color = Color.WHITE;
    }

    public void addLine(Line line) {
        this.lineas.add(line);
    }

    public void setPosition(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public void clear() {
        this.lineas.clear();
    }

    public ArrayList<Line> getLines() {
        return this.lineas;
    }

    public double getX() {
        return this.X;
    }

    public double getY() {
        return this.Y;
    }

    public int getAngle() {
        return this.angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String value = "";
        for (int i = 0; i < this.lineas.size(); i++)
            value += this.lineas.get(i) + ", ";

        value += "X : " + this.X + " Y : " + this.Y + " Angle : " + this.angle;

        return value;
    }
}