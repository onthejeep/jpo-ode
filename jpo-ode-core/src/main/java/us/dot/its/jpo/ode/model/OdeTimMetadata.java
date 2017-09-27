package us.dot.its.jpo.ode.model;

public class OdeTimMetadata extends OdeBsmMetadata {
   
   private static final long serialVersionUID = 1851475623026081007L;

   public OdeTimMetadata(OdeTimPayload timPayload) {
      super(timPayload);
   }

   public OdeTimMetadata(OdeTimPayload timPayload, SerialId serialId, String receivedAt, String generatedAt) {
      super(timPayload, serialId, receivedAt, generatedAt);
   }

}
