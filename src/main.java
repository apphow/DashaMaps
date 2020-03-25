import sun.applet.Main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

        private DashMapOne dashMapOne;
        private DashMapTwo dashMapTwo;
        private DashMapThree dashMapThree;

        public void readFile(){
            dashMapOne = new DashMapOne();
            dashMapTwo = new DashMapTwo();
            dashMapThree = new DashMapThree();
        }

        public void setDashMapOne(DashMapOne dashMapOne) {
            this.dashMapOne = dashMapOne;
        }

        public void setDashMapTwo(DashMapTwo dashMapTwo) {
            this.dashMapTwo = dashMapTwo;
        }

        public void setDashMapThree(DashMapThree dashMapThree) {
            this.dashMapThree = dashMapThree;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader wordList = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/ahoward/Desktop/projects/DashaMaps/word-list.txt")));
            String build = null;
            while ((build = wordList.readLine()) != null) {
                System.out.println(build);
            }
            try {
                wordList.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public DashMapOne getDashMapOne() {
            return dashMapOne;
        }

        public DashMapTwo getDashMapTwo() {
            return dashMapTwo;
        }

        public DashMapThree getDashMapThree() {
            return dashMapThree;
        }
    }
