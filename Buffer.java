class Buffer {
    public static void main(String args[]) {
        StringBuffer sb=new StringBuffer("Deepak");
        sb.append(" is a scientist.");
        sb.append("He have 5 PHD's in multiple branches of astrophysics");
        String message=sb.toString();
        System.out.println(message);
        
    }
}