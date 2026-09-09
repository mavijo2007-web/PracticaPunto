public class Punto {

    
      private int x ;
        private int y ;
        public int getX() {
            return this.x;
        }
        public int getY() {
            return this.y;
        }
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
        public double modulo (){
            return Math.sqrt(this.x * this.x + this.y * this.y);
        }
}



