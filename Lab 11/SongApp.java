public class SongApp { 
   public static void main(String[]args) {
      Song s1 = new Song("While my guitar gently weeps");
      System.out.println(s1);
      s1.process();
      
      Song s2 = new Song("Let it be");
      System.out.println(s2);
      s2.process();
      
      Song s3 = new Song("Penny Lane");
      System.out.println(s3);
      s3.process();
   }
}