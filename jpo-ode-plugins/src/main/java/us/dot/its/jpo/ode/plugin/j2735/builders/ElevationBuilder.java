package us.dot.its.jpo.ode.plugin.j2735.builders;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.JsonNode;

public class ElevationBuilder {

   private ElevationBuilder() {
      throw new UnsupportedOperationException();
   }

   public static BigDecimal genericElevation(JsonNode elevation) {
      BigDecimal returnValue = null;

      if ((elevation != null) && (elevation.asLong() != -4096)) {
         returnValue = BigDecimal.valueOf(elevation.asLong(), 1);

      }
      return returnValue;
   }
}
