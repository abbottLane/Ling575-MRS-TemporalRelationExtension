/**
 * Created by wlane on 4/18/16.
 */
import org.cleartk.examples.pos.RunExamplePOSAnnotator;
import org.cleartk.timeml.*;
import org.cleartk.eval.*;
import org.cleartk.examples.*;
import org.cleartk.timeml.eval.TempEval2013Evaluation;

public class RelationExtractor {
    public static void main(String[] args){
        System.out.print("Running TempEval 2013 ClearTK-TimeML system");
        try {
//            --train-dirs /path/to/TimeBank /path/to/AQUAINT
//            --test-dirs /path/to/te3-platinum
            String[] in_out = {"--train-dirs", "src/main/resources/train/TBAQ-cleaned/TimeBank","src/main/resources/train/TBAQ-cleaned/AQUAINT", "--test-dirs","src/main/resources/TE3-platinum-test"};
            TempEval2013Evaluation.main(in_out);
            //TimeMlAnnotate.main("src/main/resources/TE3-platinum-test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
