package J04011;

public class Point3D {
	private int x, y, z;

	public Point3D(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Point3D() {
		super();
	}
	
	public static Point3D vector(Point3D p1, Point3D p2) {

	        // vector giữa 2 điểm 

	        Point3D res = new Point3D();
	        res.x = p2.x - p1.x;
	        res.y = p2.y - p1.y;
	        res.z = p2.z - p1.z;
	        return res;
	   }
	

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {

        Point3D AB = vector(p1, p2);
        Point3D AC = vector(p1, p3);
        Point3D AD = vector(p1, p4);
        Point3D  tmp = new Point3D();
        tmp.x=AB.y*AC.z-AC.y*AB.z;
        tmp.y=AB.z*AC.x-AC.z*AB.x;
        tmp.z=AB.x*AC.y-AC.x*AB.y;
        int a=tmp.x*AD.x+tmp.y*AD.y+tmp.z*AD.z;
        return a == 0;
    }

//3
//1 2 0
//2 3 0
//4 0 0
//0 0 0
//1 1 1
//2 2 2
//3 3 3
//4 4 4
//5 6 7
//-8 -9 -10
//12 19 0
//3 1 5

}
