public class Main {
    public static void main(String[] args) {
        //Creamos Atletas
        Athlete atleta1 =new Athlete(46236362,"Santiago",1.70,18,57);
        Athlete atleta2 =new Athlete(40345543,"Augusto",1.91,19,80.3);
        Athlete atleta3 =new Athlete(43432423,"Josema",1.65,20,70);
        Athlete atleta4 =new Athlete(45789765,"Marco",1.82,21,78.8);

        //Creamos el Equipo Nacional
        NationalTeam team1= new NationalTeam("Violeta","Grecia");

        //Añadimos los atlelas al equipo
        team1.addAthlete(atleta1);
        team1.addAthlete(atleta2);
        team1.addAthlete(atleta3);
        team1.addAthlete(atleta4);

        //Creamos instalaciones
        Facility facility1= new Facility("Categoria 1","Polideportivo","Tipo9","Ciudad");
        Facility facility2= new Facility("Categoria 2","Campo","Tipo12","Parte Trasera");

        //Añadimos atletas a la prueba 1
        Proof proof1=new Proof(912,"Prueba de Talentos");
        proof1.addParticipants(atleta1);
        proof1.addParticipants(atleta2);

        //Añadimos atletas a la prueba 2
        Proof proof2=new Proof(72,"Prueba de Fuerza");
        proof2.addParticipants(atleta1);
        proof2.addParticipants(atleta2);
        proof2.addParticipants(atleta3);
        proof2.addParticipants(atleta4);


        //Creamos la Sede
        Sede sede1=new Sede(1,"09/12/24","17:00");

        //Asociamos las instlaciones y pruebas a la sede
        sede1.whereDoes(facility1,proof1);
        sede1.whereDoes(facility2,proof2);

        //Mostramos Nombre del 3er atleta de la 2da Prueba desde un objeto de instalacion
        System.out.println("Nombre del 3er atleta de la 2da Prueba: "+facility2.getAssociated_test().getParticipans().get(2).getName());
        System.out.println("--------------------------------");

        //Mostramos Codigo de la 2da Prueba desde un objeto de instalacion
        System.out.println("Codigo de la 2da Prueba: "+facility2.getAssociated_test().getCode());
        System.out.println("--------------------------------");

        //Mostramos la altura de los atletas desde un objeto de NationalTeam
        System.out.println("Altura de todos los jugadores del equipo: ");
        for (Athlete a : team1.getBelongs()){
            System.out.println(a.getHeight());
        }
        System.out.println("--------------------------------");

        //Mostramos peso extra de cada atleta desde un objeto de NationalTeam
        team1.showExtraWeight();
    }
}