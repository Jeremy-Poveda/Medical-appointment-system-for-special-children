package g05.controlador;

import g05.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class MenuController {

    @FXML
    private BorderPane borderPane;
    @FXML
    private Button botonAtenciones;

    @FXML
    private Button botonCitas;

    @FXML
    private Button botonClientes;

    @FXML
    private Button botonEmpleados;

    @FXML
    private Button botonSalir;

    @FXML
    private Button botonServicios;

    @FXML
    private ImageView displayMenu;

    @FXML
    private Label infoMenu;

    @FXML
    private VBox vBoxMenu;

    //Métodos cuando el cursor pasa por encima de cada boton
    @FXML
    public void preServicios(){
        Image im = new Image(App.class.getResourceAsStream("vista/servicios.png"));
        displayMenu.setImage(im);
        infoMenu.setText("Podrá ver, agregar, editar y/o desactivar \n algún servicio. Presione el botón\n -Servicios- para continuar");
    }
    @FXML
    public void preClientes(){
        Image im = new Image(App.class.getResourceAsStream("vista/clientes.png"));
        displayMenu.setImage(im);
        infoMenu.setText("Podrá ver, agregar y/o editar clientes.\n Presione el botón -Clientes- para\n continuar");
    }
    @FXML
    public void preAtenciones(){
        Image im = new Image(App.class.getResourceAsStream("vista/atenciones.png"));
        displayMenu.setImage(im);
        infoMenu.setText("Podrá ver, registrar y/o consultar las atenciones.\n Presione el botón -Atenciones- para\n continuar");
    }
    @FXML
    public void preCitas(){
        Image im = new Image(App.class.getResourceAsStream("vista/citas.png"));
        displayMenu.setImage(im);
        infoMenu.setText("Podrá ver, crear, eliminar, y/o consultar\n citas. Presione el botón -Citas- para\n continuar");
    }
    @FXML
    public void preEmpleados(){
        Image im = new Image(App.class.getResourceAsStream("vista/empleados.png"));
        displayMenu.setImage(im);
        infoMenu.setText("Podrá ver, agregar, editar y/o eliminar\n empleados. Presione el botón\n -Empleados- para continuar");
    }
    @FXML
    public void preSalir(){
        Image im = new Image(App.class.getResourceAsStream("vista/salir.png"));
        displayMenu.setImage(im);
        infoMenu.setText("Cerrará la sesión actual.\n Presione el botón -Salir- para cerrar\n el sistema");
    }

    //Métodos cuando se da click a cada boton
    @FXML
    public void entrarServicios(){
        try{
            borderPane.getChildren().clear();
            BorderPane loader = FXMLLoader.load(App.class.getResource("Servicios.fxml"));
            borderPane.getChildren().setAll(loader);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    public void entrarClientes(){
        try{
            borderPane.getChildren().clear();
            BorderPane loader = FXMLLoader.load(App.class.getResource("Clientes.fxml"));
            borderPane.getChildren().setAll(loader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    public void entrarAtenciones(){
        try{
            borderPane.getChildren().clear();
            BorderPane loader = FXMLLoader.load(App.class.getResource("Atenciones.fxml"));
            borderPane.getChildren().setAll(loader);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    public void entrarCitas(){
        try{
            borderPane.getChildren().clear();
            BorderPane loader = FXMLLoader.load(App.class.getResource("Citas.fxml"));
            borderPane.getChildren().setAll(loader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    public void entrarEmpleados(){
        try{
            borderPane.getChildren().clear();
            BorderPane loader = FXMLLoader.load(App.class.getResource("Empleados.fxml"));
            borderPane.getChildren().setAll(loader);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    public void cerrarSistema(){
        //Alerta de confirmación para salir del sistema.
        Alert alertaCerrar = new Alert(Alert.AlertType.CONFIRMATION);
        alertaCerrar.setTitle("Cierre del sistema");
        alertaCerrar.setHeaderText("Confirmación de cierre");
        alertaCerrar.setContentText("¿Está seguro que quiere salir del sistema?");
        Optional<ButtonType> resultado = alertaCerrar.showAndWait();
        //Si el usuario da OK, se cerrará el stage actual.
        if(resultado.get() == ButtonType.OK){
            Stage stage = (Stage)borderPane.getScene().getWindow();
            stage.close();
        }
    }
}