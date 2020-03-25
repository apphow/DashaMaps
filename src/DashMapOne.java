public class DashMapOne implements HashMapX {
// trying r-way tries
        private class Node {
            private static final int R = 0;
            Node[] next = new Node[R];
            boolean end;
        }

        public class StringSET {
            private static final int R = 128;
            private Node root = new Node();

            private class Node {
                Node[] next = new Node[R];
                boolean end;
            }

            public boolean contains(String s) {
                return contains(root, s, 0);
            }

            private boolean contains(Node x, String s, int i) {
                if (x == null) return false;
                if (i == s.length()) return x.end;
                char c = s.charAt(i);
                System.out.println(x);
                return contains(x.next[c], s, i + 1);
            }
            public String dashFunctionOne(String key) {
                if (key.length() > 0) {
                    return String.valueOf(key.charAt(0)).toLowerCase();
                }
                return null;
            }
        }
        public void set(String key, Integer value) {

        }

        public void delete(String key) {

        }

        public Integer get(String key) {
            return null;
        }

        public Boolean isEmpty() {
            return null;
        }

        public Integer size() {
            return null;
        }

        public Integer bucketSize(String key) {
            return null;
        }


    }
