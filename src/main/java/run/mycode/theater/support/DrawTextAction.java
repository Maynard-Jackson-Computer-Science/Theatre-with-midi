package run.mycode.theater.support;

import org.code.media.Color;
import org.code.media.Font;
import org.code.media.FontStyle;
import run.mycode.theater.Stage;

import java.awt.*;

public class DrawTextAction implements SceneAction {
    public DrawTextAction(String text, int x, int y, double rotation, int textHeight, Font font, FontStyle fontStyle,
                          Color textColor) {
        // TODO: Draw text
    }

    /**
     * Perform the SceneAction
     *
     * @param context the graphics context upon which to perform the action
     * @param stage the stage where the scene is taking place
     */
    @Override
    public void go(Graphics2D context, Stage stage) {
        throw new UnsupportedOperationException(this.getClass().getName() + " not implemented");
    }
}
