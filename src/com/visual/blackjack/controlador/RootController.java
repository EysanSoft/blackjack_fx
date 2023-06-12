package com.visual.blackjack.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import com.visual.blackjack.modelo.Baraja;
import com.visual.blackjack.modelo.BlackJack;
import com.visual.blackjack.modelo.Carta;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class RootController implements Initializable {
	
	@FXML
    private ImageView imagenBaraja;
	
	@FXML
	private Label estadoCrupier;

	@FXML
	private Label estadoJugador;

	@FXML
	private AnchorPane anchorPaneBotones;
	
	@FXML
	private AnchorPane anchorPaneBaraja;

	@FXML
	private Button botonQuedarse;

	@FXML
	private Button botonIniciar;

	@FXML
	private Button botonPedir;

	@FXML
	private Label puntosCrupier;

	@FXML
	private Label puntosJugador;

	@FXML
	private Pane paneTablero;
    
    private Image cartaCrupier1;
	private ImageView imagenCrupier1;
	private Image cartaCrupier2;
	private ImageView imagenCrupier2;
	private Image cartaCrupier3;
	private ImageView imagenCrupier3;
	private Image cartaCrupier4;
	private ImageView imagenCrupier4;
	private Image cartaCrupier5;
	private ImageView imagenCrupier5;
	private Image cartaJugador1;
    private ImageView imagenJugador1;
	private Image cartaJugador2;
	private ImageView imagenJugador2;
	private Image cartaJugador3;
	private ImageView imagenJugador3;
	private Image cartaJugador4;
	private ImageView imagenJugador4;
	private Image cartaJugador5;
	private ImageView imagenJugador5;
	private int[] barajaDeCartas = Baraja.crearBaraja();
	private int cartasJugadas = 0;
	private int posicion;
	private boolean asJugador;
	private boolean asCrupier;
	private Image cartaAnimada1;
	private ImageView imagenAnimada1;
	private Image cartaAnimada2;
	private ImageView imagenAnimada2;
	private Image cartaAnimada3;
	private ImageView imagenAnimada3;
	private Image cartaAnimada4;
	private ImageView imagenAnimada4;
	private Image cartaAnimada5;
	private ImageView imagenAnimada5;
	private Image cartaAnimada6;
	private ImageView imagenAnimada6;
	private Image cartaAnimada7;
	private ImageView imagenAnimada7;
	private Image cartaAnimada8;
	private ImageView imagenAnimada8;
	private Image cartaAnimada9;
	private ImageView imagenAnimada9;
	private Image cartaAnimada10;
	private ImageView imagenAnimada10;
	BlackJack juego = new BlackJack();

    @FXML
    void botonIniciarOnMouseClicked(MouseEvent event) {
    	//Remueve_las_cartas_animadas_por_transicion
    	paneTablero.getChildren().remove(imagenAnimada1);
    	paneTablero.getChildren().remove(imagenAnimada2);
    	paneTablero.getChildren().remove(imagenAnimada3);
    	paneTablero.getChildren().remove(imagenAnimada4);
    	paneTablero.getChildren().remove(imagenAnimada5);
    	paneTablero.getChildren().remove(imagenAnimada6);
    	paneTablero.getChildren().remove(imagenAnimada7);
    	paneTablero.getChildren().remove(imagenAnimada8);
    	paneTablero.getChildren().remove(imagenAnimada9);
    	paneTablero.getChildren().remove(imagenAnimada10);
    	
    	//carta_animada_1
    	imagenAnimada1 = new ImageView();
    	cartaAnimada1 = new Image("Recursos/cartaLadoInverso.png");
    	imagenAnimada1.setImage(cartaAnimada1);
    	imagenAnimada1.setLayoutX(625);
    	imagenAnimada1.setLayoutY(135);
    	paneTablero.getChildren().add(imagenAnimada1);
    	
        Duration duration = Duration.millis(500);
        TranslateTransition transition = new TranslateTransition(duration, imagenAnimada1);
        transition.setByX(-575);
        transition.setByY(125);
        transition.play();
        
    	//carta_animada_2
    	imagenAnimada2 = new ImageView();
    	cartaAnimada2 = new Image("Recursos/cartaLadoInverso.png");
    	imagenAnimada2.setImage(cartaAnimada2);
    	imagenAnimada2.setLayoutX(625);
    	imagenAnimada2.setLayoutY(135);
    	paneTablero.getChildren().add(imagenAnimada2);
  
        Duration duration2 = Duration.millis(500);
        TranslateTransition transition2 = new TranslateTransition(duration2, imagenAnimada2);
        transition2.setByX(-575);
        transition2.setByY(-125);
        transition2.play();
        
        //carta_animada_3
    	imagenAnimada3 = new ImageView();
    	cartaAnimada3 = new Image("Recursos/cartaLadoInverso.png");
    	imagenAnimada3.setImage(cartaAnimada3);
    	imagenAnimada3.setLayoutX(625);
    	imagenAnimada3.setLayoutY(135);
    	paneTablero.getChildren().add(imagenAnimada3);
    	
        Duration duration3 = Duration.millis(500);
        TranslateTransition transition3 = new TranslateTransition(duration3, imagenAnimada3);
        transition3.setByX(-460);
        transition3.setByY(125);
        transition3.play();
        
        //carta_animada_4
    	imagenAnimada4 = new ImageView();
    	cartaAnimada4 = new Image("Recursos/cartaLadoInverso.png");
    	imagenAnimada4.setImage(cartaAnimada4);
    	imagenAnimada4.setLayoutX(625);
    	imagenAnimada4.setLayoutY(135);
    	paneTablero.getChildren().add(imagenAnimada4);
  
        Duration duration4 = Duration.millis(500);
        TranslateTransition transition4 = new TranslateTransition(duration4, imagenAnimada4);
        transition4.setByX(-460);
        transition4.setByY(-125);
        transition4.play();
    	
    	//Declaramos_un_nuevo_juego,_barajeamos_la_baraja_y_se_agregan_botones.
    	estadoJugador.setText("Jugador Invitado ");
    	estadoCrupier.setText("Crupier Virtual ");
    	asJugador = false;
    	asCrupier = false;
    	barajaDeCartas = Baraja.barajar(barajaDeCartas);
    	anchorPaneBotones.getChildren().add(botonPedir);
    	anchorPaneBotones.getChildren().add(botonQuedarse);
    	
    	//elimina_toda_carta_imagen_como_metodo_de_reinicio_y_reiniciamos_los_puntos_del_juego
    	paneTablero.getChildren().remove(imagenCrupier1);
    	paneTablero.getChildren().remove(imagenCrupier2);
    	paneTablero.getChildren().remove(imagenCrupier3);
    	paneTablero.getChildren().remove(imagenCrupier4);
    	paneTablero.getChildren().remove(imagenCrupier5);
    	paneTablero.getChildren().remove(imagenJugador1);
    	paneTablero.getChildren().remove(imagenJugador2);
    	paneTablero.getChildren().remove(imagenJugador3);
    	paneTablero.getChildren().remove(imagenJugador4);
    	paneTablero.getChildren().remove(imagenJugador5);
    	juego.setPuntosCrupier(0);
    	juego.setPuntosJugador(0);
    	
    	//sacar_dos_cartas_para_el_crupier
    	posicion = barajaDeCartas[cartasJugadas];
    	juego.setPuntosCrupier(juego.getPuntosCrupier() + Carta.getValor(posicion));
    	puntosCrupier.setText("Puntos: " + juego.getPuntosCrupier());
    	imagenCrupier1 = new ImageView();
    	cartaCrupier1 = new Image(Carta.getImagen(posicion));
    	imagenCrupier1.setImage(cartaCrupier1);
    	imagenCrupier1.setLayoutX(50);
    	imagenCrupier1.setLayoutY(10);
    	paneTablero.getChildren().add(imagenCrupier1);
    	if(Carta.getValor(posicion) == 11) {
    		asCrupier = true;
    	}
    	cartasJugadas++;
    	
    	imagenCrupier2 = new ImageView();
    	cartaCrupier2 = new Image("Recursos/cartaLadoInverso.png");
    	imagenCrupier2.setImage(cartaCrupier2);
    	imagenCrupier2.setLayoutX(165);
    	imagenCrupier2.setLayoutY(10);
    	paneTablero.getChildren().add(imagenCrupier2);
    	
    	//sacar_dos_cartas_para_el_jugador
    	posicion = barajaDeCartas[cartasJugadas];
    	juego.setPuntosJugador(juego.getPuntosJugador() + Carta.getValor(posicion));
    	puntosJugador.setText("Puntos: " + juego.getPuntosJugador());
    	imagenJugador1 = new ImageView();
    	cartaJugador1 = new Image(Carta.getImagen(posicion));
    	imagenJugador1.setImage(cartaJugador1);
    	imagenJugador1.setLayoutX(50);
    	imagenJugador1.setLayoutY(260);
    	paneTablero.getChildren().add(imagenJugador1);
    	if(Carta.getValor(posicion) == 11) {
    		asJugador = true;
    	}
    	cartasJugadas++;
    	
    	posicion = barajaDeCartas[cartasJugadas];
    	juego.setPuntosJugador(juego.getPuntosJugador() + Carta.getValor(posicion));
    	puntosJugador.setText("Puntos: " + juego.getPuntosJugador());
    	imagenJugador2 = new ImageView();
    	cartaJugador2 = new Image(Carta.getImagen(posicion));
    	imagenJugador2.setImage(cartaJugador2);
    	imagenJugador2.setLayoutX(165);
    	imagenJugador2.setLayoutY(260);
    	paneTablero.getChildren().add(imagenJugador2);
    	if(Carta.getValor(posicion) == 11) {
    		asJugador = true;
    	}
    	if(juego.getPuntosJugador() > 21 && asJugador == true) {
			juego.setPuntosJugador(juego.getPuntosJugador() - 10);
			puntosJugador.setText("Puntos: " + juego.getPuntosJugador());
			asJugador = false;
		}
    	cartasJugadas++;
    	//removemos_el_boton_iniciar
    	anchorPaneBotones.getChildren().remove(botonIniciar);
    	
    	//Si_el_jugador_consigue_un_blackjack,_entonces_se_reinicia_el_juego
    	if(juego.getPuntosJugador() == 21) {
    		cartasJugadas = 0;
        	anchorPaneBotones.getChildren().remove(botonPedir);
        	anchorPaneBotones.getChildren().remove(botonQuedarse);
        	anchorPaneBotones.getChildren().add(botonIniciar);
        	estadoJugador.setText("¡BlackJack! gano el jugador");
        	estadoCrupier.setText("Pierde la casa...");
    	}
    }

    @FXML
    void botonPedirOnMouseClicked(MouseEvent event) {
    	cartasJugadas++;
    	if(cartasJugadas == 4) {		
    		//carta_animada_5
        	imagenAnimada5 = new ImageView();
        	cartaAnimada5 = new Image("Recursos/cartaLadoInverso.png");
        	imagenAnimada5.setImage(cartaAnimada5);
        	imagenAnimada5.setLayoutX(625);
        	imagenAnimada5.setLayoutY(135);
        	paneTablero.getChildren().add(imagenAnimada5);
        	
            Duration duration5 = Duration.millis(500);
            TranslateTransition transition5 = new TranslateTransition(duration5, imagenAnimada5);
            transition5.setByX(-345);
            transition5.setByY(125);
            transition5.play();
    		
    		posicion = barajaDeCartas[cartasJugadas];
    		juego.setPuntosJugador(juego.getPuntosJugador() + Carta.getValor(posicion));
        	puntosJugador.setText("Puntos: " + juego.getPuntosJugador());
    		imagenJugador3 = new ImageView();
        	cartaJugador3 = new Image(Carta.getImagen(posicion));
        	imagenJugador3.setImage(cartaJugador3);
        	imagenJugador3.setLayoutX(280);
        	imagenJugador3.setLayoutY(260);
        	paneTablero.getChildren().add(imagenJugador3);
        	if(Carta.getValor(posicion) == 11) {
        		asJugador = true;
        	}
        	if(juego.getPuntosJugador() > 21 && asJugador == true) {
    			juego.setPuntosJugador(juego.getPuntosJugador() - 10);
    			puntosJugador.setText("Puntos: " + juego.getPuntosJugador());
    			asJugador = false;
    		}
        	if(juego.getPuntosJugador() > 21) {
        		cartasJugadas = 0;
            	anchorPaneBotones.getChildren().remove(botonPedir);
            	anchorPaneBotones.getChildren().remove(botonQuedarse);
            	anchorPaneBotones.getChildren().add(botonIniciar);
            	estadoJugador.setText("Pierde el Jugador...");
            	estadoCrupier.setText("¡Gana la casa!");
        	}
    	}
    	
        if(cartasJugadas == 5) {
        	//carta_animada_6
        	imagenAnimada6 = new ImageView();
        	cartaAnimada6 = new Image("Recursos/cartaLadoInverso.png");
        	imagenAnimada6.setImage(cartaAnimada6);
        	imagenAnimada6.setLayoutX(625);
        	imagenAnimada6.setLayoutY(135);
        	paneTablero.getChildren().add(imagenAnimada6);
        	
            Duration duration6 = Duration.millis(500);
            TranslateTransition transition6 = new TranslateTransition(duration6, imagenAnimada6);
            transition6.setByX(-230);
            transition6.setByY(125);
            transition6.play();
        	
        	posicion = barajaDeCartas[cartasJugadas];
        	juego.setPuntosJugador(juego.getPuntosJugador() + Carta.getValor(posicion));
        	puntosJugador.setText("Puntos: " + juego.getPuntosJugador());
        	imagenJugador4 = new ImageView();
        	cartaJugador4 = new Image(Carta.getImagen(posicion));
        	imagenJugador4.setImage(cartaJugador4);
        	imagenJugador4.setLayoutX(395);
        	imagenJugador4.setLayoutY(260);
        	paneTablero.getChildren().add(imagenJugador4);
        	if(Carta.getValor(posicion) == 11) {
        		asJugador = true;
        	}
        	if(juego.getPuntosJugador() > 21 && asJugador == true) {
    			juego.setPuntosJugador(juego.getPuntosJugador() - 10);
    			puntosJugador.setText("Puntos: " + juego.getPuntosJugador());
    			asJugador = false;
    		}
        	if(juego.getPuntosJugador() > 21) {
        		cartasJugadas = 0;
            	anchorPaneBotones.getChildren().remove(botonPedir);
            	anchorPaneBotones.getChildren().remove(botonQuedarse);
            	anchorPaneBotones.getChildren().add(botonIniciar);
            	estadoJugador.setText("Pierde el Jugador...");
            	estadoCrupier.setText("¡Gana la casa!");
        	}
    	}
        
        if(cartasJugadas == 6) {
        	//carta_animada_7
        	imagenAnimada7 = new ImageView();
        	cartaAnimada7 = new Image("Recursos/cartaLadoInverso.png");
        	imagenAnimada7.setImage(cartaAnimada7);
        	imagenAnimada7.setLayoutX(625);
        	imagenAnimada7.setLayoutY(135);
        	paneTablero.getChildren().add(imagenAnimada7);
        	
            Duration duration7 = Duration.millis(500);
            TranslateTransition transition7 = new TranslateTransition(duration7, imagenAnimada7);
            transition7.setByX(-115);
            transition7.setByY(125);
            transition7.play();
        	
        	posicion = barajaDeCartas[cartasJugadas];
        	juego.setPuntosJugador(juego.getPuntosJugador() + Carta.getValor(posicion));
        	puntosJugador.setText("Puntos: " + juego.getPuntosJugador());
        	imagenJugador5 = new ImageView();
        	cartaJugador5 = new Image(Carta.getImagen(posicion));
        	imagenJugador5.setImage(cartaJugador5);
        	imagenJugador5.setLayoutX(510);
        	imagenJugador5.setLayoutY(260);
        	paneTablero.getChildren().add(imagenJugador5);
        	if(Carta.getValor(posicion) == 11) {
        		asJugador = true;
        	}
        	if(juego.getPuntosJugador() > 21 && asJugador == true) {
    			juego.setPuntosJugador(juego.getPuntosJugador() - 10);
    			puntosJugador.setText("Puntos: " + juego.getPuntosJugador());
    			asJugador = false;
    		}
        	if(juego.getPuntosJugador() > 21) {
        		cartasJugadas = 0;
            	anchorPaneBotones.getChildren().remove(botonPedir);
            	anchorPaneBotones.getChildren().remove(botonQuedarse);
            	anchorPaneBotones.getChildren().add(botonIniciar);
            	estadoJugador.setText("Pierde el Jugador...");
            	estadoCrupier.setText("¡Gana la casa!");
        	}
        	anchorPaneBotones.getChildren().remove(botonPedir);
        }
    }

    @FXML
    void botonQuedarseOnMouseClicked(MouseEvent event) {
    	//Se_revela_la_carta_oculta.
    	paneTablero.getChildren().remove(imagenCrupier2);
    	cartasJugadas++;
    	posicion = barajaDeCartas[cartasJugadas];
    	juego.setPuntosCrupier(juego.getPuntosCrupier() + Carta.getValor(posicion));
    	puntosCrupier.setText("Puntos: " + juego.getPuntosCrupier());
    	imagenCrupier2 = new ImageView();
    	cartaCrupier2 = new Image(Carta.getImagen(posicion));
    	imagenCrupier2.setImage(cartaCrupier2);
    	imagenCrupier2.setLayoutX(165);
    	imagenCrupier2.setLayoutY(10);
    	paneTablero.getChildren().add(imagenCrupier2);
    	
    	if(juego.getPuntosCrupier() < 17) {
    		//carta_animada_8
        	imagenAnimada8 = new ImageView();
        	cartaAnimada8 = new Image("Recursos/cartaLadoInverso.png");
        	imagenAnimada8.setImage(cartaAnimada8);
        	imagenAnimada8.setLayoutX(625);
        	imagenAnimada8.setLayoutY(135);
        	paneTablero.getChildren().add(imagenAnimada8);
      
            Duration duration8 = Duration.millis(500);
            TranslateTransition transition8 = new TranslateTransition(duration8, imagenAnimada8);
            transition8.setByX(-345);
            transition8.setByY(-125);
            transition8.play();
    		
    		cartasJugadas++;
        	posicion = barajaDeCartas[cartasJugadas];
        	juego.setPuntosCrupier(juego.getPuntosCrupier() + Carta.getValor(posicion));
        	puntosCrupier.setText("Puntos: " + juego.getPuntosCrupier());
        	imagenCrupier3 = new ImageView();
        	cartaCrupier3 = new Image(Carta.getImagen(posicion));
        	imagenCrupier3.setImage(cartaCrupier3);
        	imagenCrupier3.setLayoutX(280);
        	imagenCrupier3.setLayoutY(10);
        	paneTablero.getChildren().add(imagenCrupier3);
        	if(Carta.getValor(posicion) == 11) {
        		asCrupier = true;
        	}
        	if(juego.getPuntosCrupier() > 21 && asCrupier == true) {
    			juego.setPuntosCrupier(juego.getPuntosCrupier() - 10);
    			puntosCrupier.setText("Puntos: " + juego.getPuntosCrupier());
    			asCrupier = false;
    		}
    	}
    	
    	if(juego.getPuntosCrupier() < 17) {
    		//carta_animada_9
        	imagenAnimada9 = new ImageView();
        	cartaAnimada9 = new Image("Recursos/cartaLadoInverso.png");
        	imagenAnimada9.setImage(cartaAnimada9);
        	imagenAnimada9.setLayoutX(625);
        	imagenAnimada9.setLayoutY(135);
        	paneTablero.getChildren().add(imagenAnimada9);
      
            Duration duration9 = Duration.millis(500);
            TranslateTransition transition9 = new TranslateTransition(duration9, imagenAnimada9);
            transition9.setByX(-230);
            transition9.setByY(-125);
            transition9.play();
    		
    		cartasJugadas++;
        	posicion = barajaDeCartas[cartasJugadas];
        	juego.setPuntosCrupier(juego.getPuntosCrupier() + Carta.getValor(posicion));
        	puntosCrupier.setText("Puntos: " + juego.getPuntosCrupier());
        	imagenCrupier4 = new ImageView();
        	cartaCrupier4 = new Image(Carta.getImagen(posicion));
        	imagenCrupier4.setImage(cartaCrupier4);
        	imagenCrupier4.setLayoutX(395);
        	imagenCrupier4.setLayoutY(10);
        	paneTablero.getChildren().add(imagenCrupier4);
        	if(Carta.getValor(posicion) == 11) {
        		asCrupier = true;
        	}
        	if(juego.getPuntosCrupier() > 21 && asCrupier == true) {
    			juego.setPuntosCrupier(juego.getPuntosCrupier() - 10);
    			puntosCrupier.setText("Puntos: " + juego.getPuntosCrupier());
    			asCrupier = false;
    		}
    	}
    	
    	if(juego.getPuntosCrupier() < 17) {
    		//carta_animada_10
        	imagenAnimada10 = new ImageView();
        	cartaAnimada10 = new Image("Recursos/cartaLadoInverso.png");
        	imagenAnimada10.setImage(cartaAnimada10);
        	imagenAnimada10.setLayoutX(625);
        	imagenAnimada10.setLayoutY(135);
        	paneTablero.getChildren().add(imagenAnimada10);
      
            Duration duration10 = Duration.millis(500);
            TranslateTransition transition10 = new TranslateTransition(duration10, imagenAnimada10);
            transition10.setByX(-115);
            transition10.setByY(-125);
            transition10.play();
    		
    		cartasJugadas++;
        	posicion = barajaDeCartas[cartasJugadas];
        	juego.setPuntosCrupier(juego.getPuntosCrupier() + Carta.getValor(posicion));
        	puntosCrupier.setText("Puntos: " + juego.getPuntosCrupier());
        	imagenCrupier5 = new ImageView();
        	cartaCrupier5 = new Image(Carta.getImagen(posicion));
        	imagenCrupier5.setImage(cartaCrupier5);
        	imagenCrupier5.setLayoutX(510);
        	imagenCrupier5.setLayoutY(10);
        	paneTablero.getChildren().add(imagenCrupier5);
        	if(Carta.getValor(posicion) == 11) {
        		asCrupier = true;
        	}
        	if(juego.getPuntosCrupier() > 21 && asCrupier == true) {
    			juego.setPuntosCrupier(juego.getPuntosCrupier() - 10);
    			puntosCrupier.setText("Puntos: " + juego.getPuntosCrupier());
    			asCrupier = false;
    		}
    	}
    	
    	if(juego.getPuntosCrupier() == juego.getPuntosJugador()) {
    		estadoJugador.setText("¡Es un empate!");
        	estadoCrupier.setText("¡Es un empate!");
    		
    	}
    	else if(juego.getPuntosCrupier() > 21) {
    		estadoJugador.setText("¡Gana el jugador!");
        	estadoCrupier.setText("Pierde la casa...");
    	}
    	else if(juego.getPuntosCrupier() < juego.getPuntosJugador()) {
    		estadoJugador.setText("¡Gana el jugador!");
        	estadoCrupier.setText("Pierde la casa...");
    	}
    	else {
    		estadoJugador.setText("Pierde el Jugador...");
        	estadoCrupier.setText("¡Gana la casa!");
    	}
    	
    	cartasJugadas = 0;
    	anchorPaneBotones.getChildren().remove(botonPedir);
    	anchorPaneBotones.getChildren().remove(botonQuedarse);
    	anchorPaneBotones.getChildren().add(botonIniciar);
    }
   
    public void initialize(URL arg0, ResourceBundle arg1) {
    	anchorPaneBotones.getChildren().remove(botonPedir);
    	anchorPaneBotones.getChildren().remove(botonQuedarse);
    	imagenBaraja.setImage(new Image("recursos/cartaLadoInverso.png"));
	}
	
}
