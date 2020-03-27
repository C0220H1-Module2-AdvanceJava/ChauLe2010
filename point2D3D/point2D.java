package point2D3D;

import java.util.Arrays;

public class point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public point2D() {

    }

    public point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] f = new float[2];
        f[0] = x;
        f[1] = y;
        return f;
    }

    @Override
    public String toString() {
        return "get x = "+ getX() +"\nget y = " + getY() + "\nget xy = " + Arrays.toString(getXY());
    }
}
