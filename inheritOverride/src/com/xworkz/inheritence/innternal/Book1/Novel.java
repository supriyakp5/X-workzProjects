package com.xworkz.inheritence.innternal.Book1;


    class Novel extends Book1 {
        public Novel() {
            super();
            System.out.println("Novel constructor - child");
        }

        @Override
        public void read() {
            System.out.println("Reading novel - child");
        }

        @Override
        public void getTitle() {
            System.out.println("Novel title - child");
        }

        @Override
        public void getAuthor() {
            System.out.println("Novel author - child");
        }

        @Override
        public void getPages() {
            System.out.println("Novel pages - child");
        }

        @Override
        public void getGenre() {
            System.out.println("Novel genre - child");
        }
}
