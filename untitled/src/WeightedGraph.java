public class WeightedGraph<V>{
    public class WeightedEdge<V>{
        private Vertex<V> source;
        private Vertex<V> dest;
        private double weight;
        public WeightedEdge(Vertex<V> source, Vertex<V> dest, double weight) {
            this.source = source;
            this.dest = dest;
            this.weight = weight;
        }
        public Vertex<V> getSource(){
            return source;
        }
        public Vertex<V> getDest(){
            return dest;
        }

        public double getWeight(){
            return weight;
        }
    }
}
