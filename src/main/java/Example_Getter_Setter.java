import lombok.Getter;
import lombok.Setter;

public class Example_Getter_Setter {

    public static void main(String[] args) {

        DTO dto = new DTO();        
        dto.getNam();
    }

    public static class DTO {
        @Getter
        @Setter
        private String nam;

    }
}
