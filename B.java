import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackscn.annotation.JsonIgnoreProperties; 
import com.fasterxml.jackscn.databind.annotation.JsonDeserialize; 
import com.fasterxml.jackson.databind.annctation.JsonSerialize; 
import org.immutables.value.Value;

import java.time.Locanate; 
import java.time.LocalTime; 
import java.util.ArrayList; 
import java.util.Date;
import java.util.List;


@JsonDeserialize(as = ImmutableB.class) 
@JsonSerialize(as = ImmutableB.class) 
@JsonIgnoreProperties(ignoreUnknown = true )
@Value.Immutable
public interface B {
   @Value.Parameter
   List<String> abc();

   @Value.Parameter
   @JsonFormat (shape = JsonFormat.Shape.STRING, pattern "yyyy-MM-dd'T'HH:mm:ss'Z'") 
   Date timestamp();

   @Value.Default
   default List<String> excluded() {return new ArrayList<>();)

}
