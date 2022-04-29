import com.company.Player;
import com.company.Question;
import com.company.Round;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Preguntas Faciles
        Question question1 = new Question(1, "¿Cual es el resultado de la siguiente operacion? 25+25", "Matematicas", "b", "A. 10", "B. 50", "C. 25", "D. 50");
        Question question2 = new Question(2, "¿Cual es el oceano mas grande del mundo?", "Cultura General", "c", "A. Oceano pacifico", "B. Oceano atlantico", "C. Oceano indico", "D. Oceano artico");
        Question question3 = new Question(3, "¿Cual fue el ganador del mundial de 2014?", "Deporte", "d", "A. Argentina", "B. Brasil", "C. Colombia", "D. Alemania");
        Question question4 = new Question(4, "¿Que es un algoritmo?", "Logica", "c", "A. Un computador super potente", "B. Figuras geometricas", "C. Una secuencia de pasos para solocionar un problema", "D. Fue el primer satelite en orbita terrestre");
        Question question5 = new Question(5, "¿En que continente esta ubicado Colombia?", "Geografia", "c", "A. Asia", "B. Oceania", "C. America", "D. Africa");
        //Preguntas Medias
        Question question6 = new Question(6, "¿Con que objeto se mide la temperatura?", "Cultura General", "c", "A. Ventilador", "B. Aire acondicionado", "C. Termometro", "D. Radiador");
        Question question7 = new Question(7, "¿Que son los acronimos?", "Lenguaje", "d", "A. Todas son correctas", "B. Nucleos de complementosacronimales", "C. Siglas que se pronuncian distinto", "D. Siglas que se pronuncian como una palabra");
        Question question8 = new Question(8, "Cual es la capital de España", "Geografia", "a", "A. Madrid", "B. Bogota", "C. Valencia", "D. Barcelona");
        Question question9 = new Question(9, "¿Cual es el oceano mas grande del mundo?", "Cultura general", "d", "A. Artico", "B. Indico", "C. Atlantico", "D. Pacifico");
        Question question10 = new Question(10, "¿Cual es la capital de Colombia?", "Geografia", "c", "A. Medellin", "B. Barranquilla", "C. Bogota", "D. Antioquia");
        //Preguntas Dificiles
        Question question11 = new Question(11, "¿Que palabra esta bien?", "Gramatica", "c", "A. deduzo", "B. pararrallos", "C. Ninguna de las anteriores", "D. Jirasol");
        Question question12 = new Question(12, "¿Cuanto dura en total un partido de futbol?", "Deporte", "d", "A. 85min", "B. 80min", "C. 91sg", "D. 90min");
        Question question13 = new Question(13, "En que año fue el ataque a las torres gemelas", "Historia", "d", "A. 2001", "B. 1999", "C. 1998", "D. 2000");
        Question question14 = new Question(14, "¿Quien pinto las ultima cena?", "Historia", "b", "A. Sandro Boticeli", "B. Leandro da Vinci", "C. Caravaggio", "D. Socrates");
        Question question15 = new Question(15, "¿Cuantos astronautas han tenido el privilegio de andar sobre la luna?", "Historia", "a", "A. Galileo", "B. Socrates", "C. Platon", "D. Hamlet");
        //Preguntas Extremas
        Question question16 = new Question(16, "¿Cuantos astronautas han tenido el privilegio de andar sobre la luna?", "Historia", "d", "A. 6", "B. 0", "C. 12", "D. 20");
        Question question17 = new Question(17, "¿Cual es el dia mas largo de la semana?", "Cultura general", "a", "A. Miercoles", "B. Sabado", "C. Martes", "D. Domingo");
        Question question18 = new Question(18, "¿Cuanto equivale el numero pi?", "Cultura general", "d", "A. Pierre Auguste", "B. Constantin Braincusi", "C. Auguste Eugine", "D. Auguste Rodin");
        Question question19 = new Question(19, "¿Quien creo la teoria del big bang?", "Ciencias", "a", "A. Georges Lemaitre", "B. Charles Darwin", "C. Lamark", "D. Martin Lutero");
        Question question20 = new Question(20, "¿En que año se invento el microscopio?", "Historia", "c", "A. 1914", "B. 1896", "C. 1916", "D. 1921");
        //Preguntas Orbitales
        Question question21 = new Question(21, "¿Como fue echa la animacion de Disney en sus inicios?", "Arte", "c", "A. Stop Motion", "B. Motion Graphics", "C. Animacion cuadro a cuadro", "D. Animacion 3D");
        Question question22 = new Question(22, "¿Quien pinto la Capilla Sixtina?", "Arte", "d", "A. Donatello", "B. Van Gogh", "C. Davinci", "D. Miguel Angel");
        Question question23 = new Question(23, "¿Quien pinto la noche estrellada?", "Arte", "d", "A. Davinci", "B. Socrates", "C. Miguel Angel", "D. Van Gogh");
        Question question24 = new Question(24, "¿Que seleccion de futbol ha ganado mas mundiales?", "Deporte", "a", "A. Colombia", "B. Argentina", "C. Francia", "D. Brail");
        Question question25 = new Question(25, "¿Que obra teatral inica con esta frase: 'Cual gritan esos malditos pero mal rayo me parta si concluyendo esta carta no pagan caros sus gritos'?" , "Obra Teatral", "b", "A. Hamlet", "B. Don Juan Tenorio", "C. La celestina", "D. Edipo Rey");

        //Asignar por arreglo cada pregunta segun su categoria, facil/medio/dificil/experto/legendario
        ArrayList<Question> easyQuestions = new ArrayList<Question>();
        easyQuestions.add(0, question1);
        easyQuestions.add(1, question2);
        easyQuestions.add(2, question3);
        easyQuestions.add(3, question4);
        easyQuestions.add(4, question5);

        ArrayList<Question> middleQuestions = new ArrayList<Question>();
        middleQuestions.add(0, question6);
        middleQuestions.add(1, question7);
        middleQuestions.add(2, question8);
        middleQuestions.add(3, question9);
        middleQuestions.add(4, question10);

        ArrayList<Question> hardQuestions = new ArrayList<Question>();
        hardQuestions.add(0, question11);
        hardQuestions.add(1, question12);
        hardQuestions.add(2, question13);
        hardQuestions.add(3, question14);
        hardQuestions.add(4, question15);

        ArrayList<Question> expertQuestions = new ArrayList<Question>();
        expertQuestions.add(0, question16);
        expertQuestions.add(1, question17);
        expertQuestions.add(2, question18);
        expertQuestions.add(3, question19);
        expertQuestions.add(4, question20);

        ArrayList<Question> legendaryQuestions = new ArrayList<Question>();
        legendaryQuestions.add(0, question21);
        legendaryQuestions.add(1, question22);
        legendaryQuestions.add(2, question23);
        legendaryQuestions.add(3, question24);
        legendaryQuestions.add(4, question25);

        //Creacion de objetos
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Round round = new Round();

        System.out.println("_----- Bienvenid@ a ¿Quien Quiere Ser Millonario?-----_");
        System.out.println("El juego consta en una serie de preguntas, en las cuales si constestas de manera acertada ganaras dinero.");
        System.out.println("Si respondes de manera correcta puedes retirarte con tu monto pero si fallas te iras a casa con las manos vacias");
        System.out.println("");
        System.out.println("Ingresa tu nombre completo");
        player.setPlayerName(scanner.nextLine());
        System.out.println("");
        System.out.println("Puntos actuales"+round.getPoints());

        round.roundOne(easyQuestions);
        if(round.getIsCorrect()==1){
            round.roundTwo(middleQuestions);
            if(round.getIsCorrect()==1){
                round.roundThree(hardQuestions);
                if(round.getIsCorrect()==1){
                    round.roundFour(expertQuestions);
                    if(round.getIsCorrect()==1){
                        round.roundFive(legendaryQuestions);
                        if(round.getIsCorrect()==1){
                            round.pointsToMoney(player);
                            System.out.println(player.getPlayerName() +", El dinero ganado en total es: "+ player.getEarnedMoney()+" Gracias por jugar");
                        }
                    }
                }
            }
        }
    }
}
