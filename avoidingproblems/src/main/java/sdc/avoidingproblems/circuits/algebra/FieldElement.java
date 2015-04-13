package sdc.avoidingproblems.circuits.algebra;

/**
 * Here, we're encapsulating how we implement field operations. It doesn't
 * matter if we're using Integer or BigInteger, as long as they implement these
 * methods.
 *
 * @author Vitor Enes (vitorenesduarte ~at~ gmail ~dot~ com)
 */
public interface FieldElement {

   int intValue();

   FieldElement add(FieldElement fe);

   FieldElement sub(FieldElement fe);

   FieldElement mult(FieldElement fe);
   
   @Override
   public String toString();

}