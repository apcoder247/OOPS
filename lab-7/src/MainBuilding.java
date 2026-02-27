class Building {
    int squareFootage;
    int stories;

    Building(int squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    void display() {
        System.out.println("Square Footage: " + squareFootage);
        System.out.println("Stories: " + stories);
    }
}

class House extends Building {
    int bedrooms, baths;

    House(int squareFootage, int stories, int bedrooms, int baths) {
        super(squareFootage, stories);
        this.bedrooms = bedrooms;
        this.baths = baths;
    }

    void display() {
        super.display();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Baths: " + baths);
    }
}

class School extends Building {
    int classrooms;
    String gradeLevel;

    School(int squareFootage, int stories, int classrooms, String gradeLevel) {
        super(squareFootage, stories);
        this.classrooms = classrooms;
        this.gradeLevel = gradeLevel;
    }

    void display() {
        super.display();
        System.out.println("Classrooms: " + classrooms);
        System.out.println("Grade Level: " + gradeLevel);
    }
}

public class MainBuilding {
    public static void main(String[] args) {

        Building h = new House(2000, 2, 4, 3);
        h.display();

        Building s = new School(5000, 3, 20, "Junior High");
        s.display();
    }
}