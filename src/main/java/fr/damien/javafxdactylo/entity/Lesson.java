package fr.damien.entity;
public class Lesson {

    private int lesson_id;
    private String lesson_name;
    private String lesson_description;
    private String lesson_image;

    public int getIdLesson() {
        return lesson_id;
    };

    public String getLessonName() {
        return lesson_name;
    };

    public void setLessonName(String lesson_name) {
        this.lesson_name = lesson_name;
    };

    public String getLessonDescription() {
        return lesson_description;
    };

    public void setlessonDescription(String lesson_description){
        this.lesson_description = lesson_description;
    };

    public String getLessonImage() {
        return lesson_image;
    };

    public void setLessonImage(String lesson_image) {
        this.lesson_image = lesson_image;
    };

}