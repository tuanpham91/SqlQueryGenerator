import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;


/**
 *
 * Google Cloud Translator API : https://cloud.google.com/docs/authentication/getting-started?hl=de
 * Created by anh on 1/17/18.
 */
public class GeneratorWithUI extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String query = "INSERT INTO planttype ( name,familyName, waterGuide,fertilizerGuide,mistGuide,lightGuide,tempGuide,phGuide,acidGuide,toxicGuide,climateGuide,category, availableColors, bloomTime,spaceRange,heightRange,basiccare) VALUES (";
        String updateQuery  = "UPDATE planttype SET ";
        Group group = new Group();
        VBox rootVBox = new VBox();

        GridPane grid = new GridPane();
        Label name = new Label("Name");
        Label familyName = new Label("Family Name");
        Label waterGuide = new Label("Water Guide");
        Label fertilizerGuide = new Label("Fertilizer Suggestion");
        Label mistGuide = new Label("Mist Requirements");
        Label lightGuide = new Label("Light Preferences");
        Label tempGuide = new Label("Temperature Preference");
        Label phGuide = new Label("ph Range");
        Label acidGuide = new Label("Acidity Preference");
        Label toxicGuide = new Label("Toxicity");
        Label climateGuide = new Label("Climate");
        Label category = new Label("Category");
        Label availableColors = new Label("Available Colors");
        Label bloomTime = new Label("Bloom time");
        Label heightRange = new Label("Height Range");
        Label spaceRange = new Label("Space Range");
        Label basicCare = new Label("Basic Care");
        Label soil = new Label("Soil");

        TextArea nameT = new TextArea();
        TextArea familyNameT = new TextArea();
        TextArea waterGuideT = new TextArea();
        TextArea fertilizerGuideT = new TextArea();
        TextArea mistGuideT = new TextArea();
        TextArea lightGuideT = new TextArea();
        TextArea tempGuideT = new TextArea();
        TextArea phGuideT = new TextArea();
        TextArea toxicGuideT = new TextArea();
        TextArea climateGuideT = new TextArea();
        TextArea categoryT = new TextArea();
        TextArea availableColorT = new TextArea();
        TextArea bloomTimeT = new TextArea();
        TextArea heightRangeT = new TextArea();
        TextArea spaceRangeT = new TextArea();
        TextArea basicCareT = new TextArea();
        TextArea soilT = new TextArea();
        TextArea acidT = new TextArea();
        /*
        int height = 5;
        nameT.setMaxHeight(height);
        familyNameT.setMaxHeight(height);
        waterGuideT.setMaxHeight(height);
        fertilizerGuideT.setMaxHeight(height);
        lightGuideT.setMaxHeight(height);
        tempGuideT.setMaxHeight(height);
        phGuideT.setMaxHeight(height);
        toxicGuideT.setMaxHeight(height);
        climateGuideT.setMaxHeight(height);
        categoryT.setMaxHeight(height);
        availableColorT.setMaxHeight(height);
        bloomTimeT.setMaxHeight(height);
        heightRangeT.setMaxHeight(height);
        spaceRangeT.setMaxHeight(height);
        basicCareT.setMaxHeight(height);
        soilT.setMaxHeight(height);



*/



        grid.add(name, 0,0);
        grid.add(familyName, 0,1);
        grid.add(waterGuide, 0,2);
        grid.add(fertilizerGuide, 0,3);
        grid.add(mistGuide, 0,4);
        grid.add(lightGuide, 0,5);
        grid.add(tempGuide, 0,6);
        grid.add(phGuide, 0,7);
        grid.add(toxicGuide, 0,8);
        grid.add(climateGuide, 2,0);
        grid.add(category, 2,1);
        grid.add(availableColors, 2,2);
        grid.add(bloomTime, 2,3);
        grid.add(heightRange, 2,4);
        grid.add(spaceRange, 2,5);
        grid.add(basicCare, 2,6);
        grid.add(soil, 2,7);
        grid.add(acidGuide,2,8);
        grid.add(nameT, 1,0);
        grid.add(familyNameT, 1,1);
        grid.add(waterGuideT, 1,2);
        grid.add(fertilizerGuideT, 1,3);
        grid.add(mistGuideT, 1,4);
        grid.add(lightGuideT, 1,5);
        grid.add(tempGuideT, 1,6);
        grid.add(phGuideT, 1,7);
        grid.add(toxicGuideT, 1,8);
        grid.add(climateGuideT, 3,0);
        grid.add(categoryT, 3,1);
        grid.add(availableColorT, 3,2);
        grid.add(bloomTimeT, 3,3);
        grid.add(heightRangeT, 3,4);
        grid.add(spaceRangeT, 3,5);
        grid.add(basicCareT, 3,6);
        grid.add(soilT, 3,7);
        grid.add(acidT,3,8);
        grid.setHgap(10);
        rootVBox.setSpacing(20);
        TextArea res = new TextArea();
        Button newQuery = new Button("New Query");
        Button updateQueryB = new Button("Update Query");
        Button resetInfo = new Button("Reset Information");

        newQuery.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String curQuery = query;
                curQuery=curQuery+surroundWithBracket(nameT.getText())+","+surroundWithBracket(familyNameT.getText())+","+surroundWithBracket(waterGuideT.getText())+","+surroundWithBracket(fertilizerGuideT.getText())+","+surroundWithBracket(mistGuideT.getText())+","+surroundWithBracket(lightGuideT.getText())+","+surroundWithBracket(tempGuideT.getText())+","+surroundWithBracket(phGuideT.getText())+","+surroundWithBracket(acidT.getText())+","+surroundWithBracket(toxicGuideT.getText())+","+surroundWithBracket(climateGuideT.getText())+","
                        +surroundWithBracket(categoryT.getText())+","+surroundWithBracket(availableColorT.getText())+","+surroundWithBracket(bloomTimeT.getText())+","+surroundWithBracket(spaceRangeT.getText())+","+surroundWithBracket(heightRangeT.getText())+","+surroundWithBracket(basicCareT.getText())+");";
                res.setText(curQuery);
            }
        });

        updateQueryB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String currUpdateQuery = updateQuery;
                if (!familyNameT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"familyName = "+surroundWithBracket(familyNameT.getText())+",";
                }
                if (!waterGuideT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"waterGuide = "+surroundWithBracket(waterGuideT.getText())+",";
                }
                if (!fertilizerGuideT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"fertilizerGuide = "+surroundWithBracket(fertilizerGuideT.getText())+",";
                }
                if (!mistGuideT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"mistGuide = "+surroundWithBracket(mistGuideT.getText())+",";
                }

                if (!lightGuideT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"lightGuide = "+surroundWithBracket(lightGuideT.getText())+",";
                }

                if (!tempGuideT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"tempGuide = "+surroundWithBracket(tempGuideT.getText())+",";
                }

                if (!phGuideT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"fertilizerGuide = "+surroundWithBracket(fertilizerGuideT.getText())+",";
                }

                if (!acidT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"acidGuide = "+surroundWithBracket(acidT.getText())+",";
                }

                if (!toxicGuideT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"toxicGuide = "+surroundWithBracket(toxicGuideT.getText())+",";
                }

                if (!climateGuideT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"climateGuide = "+surroundWithBracket(climateGuideT.getText())+",";
                }

                if (!categoryT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"category = "+surroundWithBracket(categoryT.getText())+",";
                }

                if (!availableColorT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"availableColors = "+surroundWithBracket(availableColorT.getText())+",";
                }

                if (!bloomTimeT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"bloomTime = "+surroundWithBracket(bloomTimeT.getText())+",";
                }

                if (!spaceRangeT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"spaceRange = "+surroundWithBracket(spaceRangeT.getText())+",";
                }

                if (!heightRangeT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"heightRange = "+surroundWithBracket(heightRangeT.getText())+",";
                }

                if (!basicCareT.getText().trim().equals("")) {
                    currUpdateQuery=currUpdateQuery+"basicCare = "+surroundWithBracket(basicCareT.getText())+",";
                }

                res.setText(currUpdateQuery.substring(0,currUpdateQuery.length()-1)+" where name ="+surroundWithBracket(nameT.getText())+";");
            }
        });

        rootVBox.getChildren().addAll(grid);
        rootVBox.getChildren().addAll(res);
        rootVBox.getChildren().addAll(newQuery);
        rootVBox.getChildren().addAll(updateQueryB);
        rootVBox.getChildren().addAll(resetInfo);

        rootVBox.setPadding(new Insets(20,5,20,5));
        Scene scene = new Scene(rootVBox, 1200,800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("SQL Generator");
        primaryStage.show();
    }

    public static String surroundWithBracket(String a) {
        return "'"+a+"'";
    }


}
