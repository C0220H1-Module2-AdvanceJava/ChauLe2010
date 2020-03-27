package point2D3D;

import java.util.Arrays;

public class point3D extends point2D {
    private float z = 0.0f;

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z =z;
    }
    public float[] getXYZ(){
        float [] arr =new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }
    @Override
    public String toString(){
        return "get xyz = " + Arrays.toString(getXYZ());
    }
}
