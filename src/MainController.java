package src;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField dataInput;

    @FXML
    protected void handleAddNode() {
        // Implementar lógica para agregar nodo
        String data = dataInput.getText();
        // Lógica para agregar el nodo a la estructura de datos
    }

    @FXML
    protected void handleRemoveNode() {
        // Implementar lógica para eliminar nodo
        String data = dataInput.getText();
        // Lógica para eliminar el nodo de la estructura de datos
    }
}
