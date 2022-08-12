package g05.controlador;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import g05.App;
import g05.modelo.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class CitasController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private BorderPane borderPane;

    @FXML
    private Button botonCrear;

    @FXML
    private Button botonEliminar;

    @FXML
    private Button botonFecha;

    @FXML
    private Button botonRegresar;

    @FXML
    private TableView<Cita> tablaCitas;

    //@FXML
    //private TableColumn<Cliente, String> colCedula;

    @FXML
    private TableColumn<Cliente, String> colNombreCi;

    @FXML
    private TableColumn<Empleado, String> colEmpleadoCi;

    @FXML
    private TableColumn<Cita, LocalDate> colFechaCi;

    @FXML
    private TableColumn<Cita, LocalTime> colHoraCi;

    @FXML
    private TableColumn<Servicio, String> colServicioCi;

    @FXML
    private TextField txtCedCliente;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //colCedula.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Cédula"));
        colNombreCi.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombre"));
        colEmpleadoCi.setCellValueFactory(new PropertyValueFactory<Empleado, String>("proveedor"));
        colFechaCi.setCellValueFactory(new PropertyValueFactory<Cita, LocalDate>("fecha"));
        colHoraCi.setCellValueFactory(new PropertyValueFactory<Cita, LocalTime>("hora"));
        colServicioCi.setCellValueFactory(new PropertyValueFactory<Servicio, String>("servicio"));
        tablaCitas.setItems(obtenerCitas());

    }

    public ObservableList<Cita> obtenerCitas() {
        ObservableList<Cita> citas = FXCollections.observableArrayList();
        for (Cita c : Cita.citas) {
            citas.add(c);
        }
        return citas;
    }


    //Metodos de las opciones de cita
    @FXML
    public void crearCita() {
        App.changeRootFXML("vista/secundarias/AgregarCitas");
    }


    @FXML
    public void backCitas(){
        App.changeRootFXML("vista/Menu");
    }
}
