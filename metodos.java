public class metodos {
    public int [][] LlenarMatrizEntera(int[][ ]m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                m[i][j] = (int) (Math.random()* 50 + 1);
            }
        }
        return m;
    }
    public void MostrarMatrizEntera(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                System.out.print(" - " + m[i][j]);
            }
            System.out.println();
        }
    }
    public ObjMatrices[][]LlenarMatrizObjetual(ObjMatrices[][]m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                ObjMatrices o = new ObjMatrices();
                o.setDato((int) (Math.random() * 50 + 1));
                m[i][j] = o;
            }
        }

       return m;
    

    }
    public void MostrarMatrizObjetual(ObjMatrices[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j= 0; j < m.length; j++){
                System.out.print("  -  " + m [i][j].getDato());
            }
            System.out.println();
        }
    }
}
