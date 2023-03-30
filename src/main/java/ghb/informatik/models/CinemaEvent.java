package ghb.informatik.models;

public class CinemaEvent {
    
    CinemaHall cinemahall;
    Movie movie;
    Seat[][] seats;
    String time;
    int id;
    String externalLink;

    /*   
        AUFGABE 2

        In der nachfolgenen For-Schleife werden neue Sitze erstellt und zu dem bestehendem, mehrdimensionalen Array hinzugefügt. Mit einem Startwert von 0 und der Abbruchbedingung der Länge dieses Arrays, wird die Variable i mit jedem Durchlauf um 1 erhöht. Im Rumpf steckt eine weitere For-Schleife, ebenfalls mit dem Startwert 0, der Abbruchbedingung der Länge des Arrays mit i und einer Erhöhung um 1 pro Durchlauf. Im Rumpf dieser wird bei jedem Durchgang ein neuer Sitz auf der Position des Arrays "seats", die durch die Werte von i und k vorgegeben ist, erstellt. 


    */
    public CinemaEvent(int id, Movie movie, CinemaHall cinemahall, String time, String externalLink){
        setCinemahall(cinemahall);
        setMovie(movie);
        setTime(time);
        setId(id);
        setExternalLink(externalLink);
        setSeats(new Seat[getCinemahall().getCols()][getCinemahall().getRows()]);

        for(int i = 0; i < getSeats().length; i++){
            for(int k = 0; k < getSeats()[i].length; k++){
                getSeats()[i][k] = new Seat(false);
            }
        }
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }
    public void setCinemahall(CinemaHall cinemahall) {
        this.cinemahall = cinemahall;
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }
    public CinemaHall getCinemahall() {
        return cinemahall;
    }
    public Movie getMovie() {
        return movie;
    }
    public Seat[][] getSeats() {
        return seats;
    }
    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }
    public String getExternalLink() {
        return externalLink;
    }
}
