/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.effects;

import br.univali.model.Effect;
import com.jhlabs.image.EdgeFilter;
import java.awt.image.BufferedImage;

/**
 *
 * @author 5663296
 */
public class EdgeEffect implements Effect{

    @Override
    public BufferedImage apply(BufferedImage bufferedImage) {
        BufferedImage image = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), bufferedImage.getType());
        return new EdgeFilter().filter(bufferedImage, image);
    }

    @Override
    public String toString() {
        return "Edge";
    }
    
}
