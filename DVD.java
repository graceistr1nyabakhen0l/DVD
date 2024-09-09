public class DVD extends product {
        private int lenght;
        private String rating;
        private String studio;
    
        public int getLenght() {
            return this.lenght;
        }
    
        public void setLenght(int lenght) {
            this.lenght = lenght;
        }
    
        public String getRating() {
            return this.rating;
        }
    
        public void setRating(String rating) {
            this.rating = rating;
        }
    
        public String getStudio() {
            return this.studio;
        }
    
        public void setStudio(String studio) {
            this.studio = studio;
        }
    
        public DVD() {
            super(); //consstructor dari superclass
            lenght = 210;
            rating = "PG";
            studio = "NewLIne Cinema";
        }
        
        //Override
        public void print() {
            super.print();
            System.out.println("Lenght:\t" + lenght);
            System.out.println("Rating\t:" + rating);
            System.out.println("Studio\t" + studio);
        }
    }

