module br.senai.sp.jandira.tata {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.senai.sp.jandira.tata to javafx.fxml;
    exports br.senai.sp.jandira.tata;
}